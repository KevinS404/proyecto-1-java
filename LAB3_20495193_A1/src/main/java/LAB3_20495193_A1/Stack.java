
package LAB3_20495193_A1;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Se crea una clase llamada Stack que almacenara todas las clases nuevas
 * que se vayan creando en ArrayList para cada tipo, esta clase tiene sus respectivo
 * constructor, getters y setters. Tambien posee metodos para agregar todo los otros
 * tipos de clases a la lista que se definen en sus atributos, por lo q tiene una relacion
 * de agregacion con todas las otras clases menos main.
 * @author Kevin Silva
 */
public class Stack {
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<Pregunta> preguntas = new ArrayList<>();
    private ArrayList<Respuesta> respuestas = new ArrayList<>();
    private ArrayList<ArrayList<String>> etiquetas = new ArrayList<>();
    
    //constructor
    public Stack() {
        this.usuarios = new ArrayList<>();
        this.preguntas = new ArrayList<>();
        this.respuestas = new ArrayList<>();
        this.etiquetas = new ArrayList<>();
         
    }
    //getters y setters de la clase Stack
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public ArrayList<Respuesta> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(ArrayList<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }

    public ArrayList<ArrayList<String>> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(ArrayList<ArrayList<String>> etiquetas) {
        this.etiquetas = etiquetas;
    }
    /**
     * metodo para agregar usuario al arrayList de usuarios, recibe como parametros
     * un string con el nombre, otro con la contrasena y un int con la reputacion,
     * genera una variable de tipo Usuario con estos datos y los añade a la lista
     * @param usuario
     * @param contrasena
     * @param reputacion 
     */
    public void agregarUsuario(String usuario, String contrasena, int reputacion){
        Usuario usuarioEjemplo = new Usuario(usuario,contrasena,reputacion);
        usuarios.add(usuarioEjemplo);

    }
    /**
     * metodo que agregar una pregunta al ArrayList de preguntas, para esto recibe como
     * parametros todos los datos correspondientes a la pregunta, con estos genera una 
     * variable de tipo Pregunta y la añade a la lista de preguntas
     * @param id
     * @param respuestas
     * @param etiquetas
     * @param titulo
     * @param contenido
     * @param fechaDePublicacion
     * @param autor
     * @param estado
     * @param recompensa 
     */
    public void agregarPregunta(int id, int respuestas,ArrayList<String> etiquetas, String titulo, String contenido, String fechaDePublicacion, String autor, String estado, int recompensa){
        Pregunta preguntaEjemplo = new Pregunta(id,respuestas,etiquetas, titulo, contenido , fechaDePublicacion, autor, estado, recompensa);
        preguntas.add(preguntaEjemplo);
    }
    /**
     * metodo que agregar una respuesta al ArrayList de respuestas, para esto recibe como
     * parametros todos los datos correspondientes a la respuesta, con estos genera una 
     * variable de tipo Respuesta y la añade a la lista de respuestas
     * @param idPregunta
     * @param idRespuesta
     * @param autor
     * @param fecha
     * @param contenido 
     */
    public void agregarRespuesta(int idPregunta,int idRespuesta, String autor, String fecha, String contenido){
        Respuesta respuestaEjemplo = new Respuesta(idPregunta,idRespuesta,autor,fecha,contenido);
        respuestas.add(respuestaEjemplo);
    }
    /**
     * metodo que agregar una etiqueta al ArrayList de etiquetas, para esto recibe como
     * parametros todos los datos correspondientes a la etiqueta, con estos genera una 
     * variable de tipo Etiqueta y la añade a una lista auxiliar que almacenara ambos datos
     * para despues guardar estos como una lista  en el ArrayList de etiquetas.
     * @param nombreEtiqueta
     * @param descripcion 
     */
    public void agregarEtiqueta(String nombreEtiqueta, String descripcion){
        ArrayList<String> etiqueta = new ArrayList<>();
        etiqueta.add(nombreEtiqueta);
        etiqueta.add(descripcion);
        etiquetas.add(etiqueta);
    }
    /**
     * metodo que muestra todas las preguntas del stack que este con el estado
     * "abierta" para que un usuario pueda responderla o recompensarla, para esto se
     * implementa un loop for que recorre la lista de preguntas y verifica que este 
     * con el estado deseado, si este es el caso se agrega la pregunta a un ArrayList
     * auxiliar de tipo Pregunta que almacenara las preguntas disponibles
     * luego se le dara la opcion al usuario para ingresar por teclado el numero de la pregunta
     * que quiere responder o recompensar segun el metodo por el cual se este llamando, entonces
     * esto hara que el metodo retorne dicha pregunta para el usuario.
     * @param stack
     * @return Pregunta que el usuario quiere responder o recompensar.
     */
    public Pregunta mostrarPreguntas(Stack stack){
        
        ArrayList<Pregunta> preguntas = stack.getPreguntas();
        ArrayList<Pregunta> preguntasDisponibles = new ArrayList<>();
        System.out.println("Preguntas disponibles para responder o recompensar: \n");
        int j = 1;
        for(int i = 0; i < preguntas.size();i++){
            if("abierta".equals(preguntas.get(i).getEstado())){
                preguntasDisponibles.add(preguntas.get(i));
                System.out.println("Pregunta" + " "+ j + ": "+ preguntas.get(i).getTitulo()+ ". Publicada por: " +  preguntas.get(i).getAutor()+
                                    ". Etiquetas: "+ preguntas.get(i).getEtiquetas());
                System.out.println("Su contenido es: ");
                System.out.println(preguntas.get(i).getContenido()+"\n");
                j++;
            }
        }
        int eleccion;
        System.out.println("Escriba el numero de la pregunta a elegir: ");
        Scanner aux = new Scanner(System.in);
        eleccion = aux.nextInt();
        return preguntasDisponibles.get(eleccion-1);
  }
    /**
     * Metodo que se encarga de buscar en el stack una pregunta o respuesta mediante
     * un criterio a eleccion y un String con los caracteres buscados que se le pediran
     * ingresar por teclado al usuario en Main.
     * @param stack
     * @param criterio
     * @param busqueda 
     */
    public void search(Stack stack,int criterio,String busqueda){
        int j = 1; // variable auxiliar para enumerar
        /**
         * Si se escoge el primer criterio entonces buscaremos en las preguntas con un ciclo
         * que evaluara si es que la pregunta contiene al string de busqueda en su titulo o en su contenido
         * si es que esto ocurre mostrara por pantalla el contenido de la pregunta correspondiente al titulo
         * autor, contenido y etiquetas.
         */
        if (criterio == 1){
            System.out.print("Preguntas que coindicen con el criterio de busqueda: \n\n");
            for(int i  = 0;i <stack.getPreguntas().size();i++){
                //si la pregunta contiene el criterio en su titulo o en su contenido entonces le mostramos al usuario esto
                if(stack.getPreguntas().get(i).getTitulo().contains(busqueda) || stack.getPreguntas().get(i).getContenido().contains(busqueda)){
                    System.out.println("Pregunta" + " "+ j + ": "+ stack.getPreguntas().get(i).getTitulo()+ ". Publicada por: " +  stack.getPreguntas().get(i).getAutor()+
                                    ". Etiquetas: "+ stack.getPreguntas().get(i).getEtiquetas());
                                    System.out.println("Su contenido es: ");
                                    System.out.println(stack.getPreguntas().get(i).getContenido()+"\n");
                    j++;
                }
            }
            
        }
        /**
         * Si se escoge el segundo criterio entonces buscaremos en las respuestas con un ciclo
         * que evaluara si es que la respuesta contiene al string de busqueda en su contenido,
         * si es que esto ocurre mostrara por pantalla el contenido de la respuesta correspondiente al 
         * contenido y el autor.
         */
        else if(criterio == 2){
            System.out.print("Respuestas que coindicen con el criterio de busqueda: \n\n");
            for(int i  = 0;i <stack.getRespuestas().size();i++){
                //si la pregunta contuviera lo que se se busca entonces se muestra su autor y su contenido
                if(stack.getRespuestas().get(i).getContenido().contains(busqueda)){
                        System.out.println("Respuesta de: " + stack.getRespuestas().get(i).getAutor());
                        System.out.println("Contenido: " +stack.getRespuestas().get(i).getContenido());
                }
            }
            
        }
        /**
         * Si se escoge el tercer criterio entonces buscaremos en las etiquetas con un ciclo
         * que evaluara si es que la respuesta contiene al string de busqueda en su nombre o en su descripcion,
         * si es que esto ocurre mostrara por pantalla el contenido de la etiqueta correspondiente al 
         * nombre y su descripcion.
         */
        else if(criterio == 3){
            System.out.print("Etiquetas que coindicen con el criterio de busqueda: \n\n");
            for(int i  = 0;i <stack.getEtiquetas().size();i++){
                if(stack.getEtiquetas().get(i).get(0).contains(busqueda) || stack.getEtiquetas().get(i).get(1).contains(busqueda)){
                    System.out.println("Nombre de etiqueta: " + stack.getEtiquetas().get(i).get(0));
                    System.out.println("Descripcion de etiqueta: " + stack.getEtiquetas().get(i).get(1));
                    
                }
            }
            
        }
    }
}
    
   


   