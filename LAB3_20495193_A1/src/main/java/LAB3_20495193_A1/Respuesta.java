
package LAB3_20495193_A1;


import java.util.Scanner;

/**
 * Se crea la clase Respuesta la cual tiene los atributos necesarios 
 * para la implementacion de este programa, tambien posee su respectivo constructor
 * getters y setters. Tambien posee un segundo constructor que sirve de auxiliar 
 * para el metodo de answer,el cual genera una nueva respuesta en el stack
 * @author Kevin Silva
 */
public class Respuesta{
    private int idPregunta;
    private int idRespuesta;
    private String autor;
    private String fecha;
    private String contenido;
    //constructor
    public Respuesta(int idPregunta,int idRespuesta, String autor, String fecha, String contenido) {
        this.idPregunta = idPregunta;
        this.idRespuesta = idRespuesta;
        this.autor = autor;
        this.fecha = fecha;
        this.contenido = contenido;
    }
    /**
     * Constructor que se inicia al momento de quere usar el metodo answer
     * este almacenara en una variable la pregunta a la cual quiere responder el 
     * usuario y un id correspondiente a la cantidad de respuestas de esta pregunta
     * esto lo entragara a una variable que llama al metodo answer
     * @param stack
     * @param user 
     */
    public Respuesta(Stack stack,Usuario user) {
        //mostramos todas las respuestas que aun esten disponibles para responderse
        //y guardamos la elecion del usuario en una variable de tipo Pregunta
        Pregunta eleccion = stack.mostrarPreguntas(stack);
        //obtenemos la cantidad de respuestas que tiene esta pregunta y lo aumentamos
        //en 1, esto vendria a ser el id unico de la respuesta dentro de la pregunta
        int id = eleccion.getCantidadRespuestas();
        id++;
        //en el metodo ask se genera la pregunta mediante el ingreso por teclado
        int resultado = answer(stack,eleccion,id,user);  
    }
    //getters y setters de la clase Respuesta
    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {    
        this.idPregunta = idPregunta;
    }

    public int getIdRespuesta() {
        return idRespuesta;
    }

   
    public void setIdRespuesta(int idRespuesta) {    
        this.idRespuesta = idRespuesta;
    }


    public void setidRespuesta(int idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    /**
     * metodo mediante el cual el usuario agrega una respuesta a una pregunta en concreto
     * para esto se le asigna a la pregunta en su variable de id de pregunta el id de esta misma
     * y se prosigue a pedirle al usuario el contenido de la respuesta, despues se asigna al autoe de la 
     * respuesta el nombre del usuario que inicio este metodo, se le pide la fecha y se le indica que 
     * su respuesta fue publicada.
     * @param stack
     * @param eleccion
     * @param contenido
     * @param id
     * @param user
     * @return 
     */
    public int answer(Stack stack, Pregunta eleccion,int id,Usuario user){
        this.idPregunta = eleccion.getIdPregunta();
        this.idRespuesta = idRespuesta;
        eleccion.setCantidadRespuestas(idRespuesta);
        System.out.println("Ingrese el contenido de la respuesta a la pregunta: ");
        Scanner aux = new Scanner(System.in);
        contenido = aux.nextLine();
        
        this.autor = user.getNombre();
 
        String fechaDePublicacion;
        System.out.println("Ingrese la fecha de publicacion con formato dd/mm/aaaa: ");
        Scanner aux2 = new Scanner(System.in);
        fechaDePublicacion = aux2.nextLine();
        stack.agregarRespuesta(idPregunta,id, user.getNombre(), fechaDePublicacion, contenido);
        System.out.println("\nRespuesta publicada.\n");
        System.out.println("Escoja su opcion: \n" +
                        "1. Agregar nueva pregunta\n" +
                        "2. Responder pregunta\n" +
                        "3. Dar recompensa\n" +
                        "4. Aceptar respuesta\n" +
                        "5. Cerrar sesion\n" +
                        "6. Salir del programa");
        
        return 1;
    } 
}
