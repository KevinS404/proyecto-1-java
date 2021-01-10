
package LAB3_20495193_A1;
import java.util.ArrayList;
import java.util.Scanner;

//se genera la clase Stack que sera el nucleo de todos los datos del programa
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
    public void agregarUsuario(String usuario, String contrasena, int reputacion){
        Usuario usuarioEjemplo = new Usuario(usuario,contrasena,reputacion);
        usuarios.add(usuarioEjemplo);

    }
    public void agregarPregunta(int id, int respuestas,ArrayList<String> etiquetas, String titulo, String contenido, String fechaDePublicacion, String autor, String estado, int recompensa){
        Pregunta preguntaEjemplo = new Pregunta(id,respuestas,etiquetas, titulo, contenido , fechaDePublicacion, autor, estado, recompensa);
        preguntas.add(preguntaEjemplo);
    }
    public void agregarRespuesta(int idRespuesta, String autor, String fecha, String contenido){
        Respuesta respuestaEjemplo = new Respuesta(idRespuesta,autor,fecha,contenido);
        respuestas.add(respuestaEjemplo);
    }
    public void agregarEtiqueta(String nombreEtiqueta, String descripcion){
        ArrayList<String> etiqueta = new ArrayList<>();
        etiqueta.add(nombreEtiqueta);
        etiqueta.add(descripcion);
        etiquetas.add(etiqueta);
    }
    
  public Pregunta mostrarPreguntas(Stack stack){
      ArrayList<Pregunta> preguntas = stack.getPreguntas();
      ArrayList<Pregunta> preguntasDisponibles = new ArrayList<>();
      System.out.println("Preguntas disponibles para responder o recompensar: \n");
      int j = 1;
      for(int i = 0; i < preguntas.size();i++){
          if("abierta".equals(preguntas.get(i).getEstado())){
            preguntasDisponibles.add(preguntas.get(i));
            System.out.println("Pregunta" + " "+ j + ": "+ preguntas.get(i).getTitulo()+ ". Publicada por: " +  preguntas.get(i).getAutor());
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
    /*
    public void mostrarRespuestas(){
        
    }
    */
}
    
   


   