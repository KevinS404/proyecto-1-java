
package LAB3_20495193_A1;

//se genera una clase Respuesta con sus atributos fundamentales 

import java.util.Scanner;

//la clase stack
public class Respuesta{
    private int idRespuesta;
    private String autor;
    private String fecha;
    private String contenido;
    //constructor
    public Respuesta(int idRespuesta, String autor, String fecha, String contenido) {
        this.idRespuesta = idRespuesta;
        this.autor = autor;
        this.fecha = fecha;
        this.contenido = contenido;
    }
    public Respuesta(Stack stack,Usuario user) {
        //mostramos todas las respuestas que aun esten disponibles para responderse
        //y guardamos la eleecion del usuario en una variable de tipo Pregunta
        Pregunta eleccion = stack.mostrarPreguntas(stack);
        //obtenemos la cantidad de respuestas que tiene esta pregunta y lo aumentamos
        //en 1, esto vendria a ser el id unico de la respuesta dentro de la pregunta
        int id = eleccion.getCantidadRespuestas();
        id++;
        //en el metodo ask se genera la pregunta mediante el ingreso por teclado
        int resultado = answer(stack,eleccion,contenido,id,user);  
    }
    
    //getters y setters de la clase Respuesta
    public int getidRespuesta() {
        return idRespuesta;
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
    public int answer(Stack stack, Pregunta eleccion,String contenido,int id,Usuario user){
        this.idRespuesta = id;
        eleccion.setCantidadRespuestas(id);
        System.out.println("Ingrese el contenido de la respuesta a la pregunta: ");
        Scanner aux = new Scanner(System.in);
        contenido = aux.nextLine();
        
        this.autor = user.getNombre();
        
        String fechaDePublicacion;
        System.out.println("Ingrese la fecha de publicacion con formato dd/mm/aaaa: ");
        Scanner aux2 = new Scanner(System.in);
        fechaDePublicacion = aux2.nextLine();
        stack.agregarRespuesta(id, user.getNombre(), fechaDePublicacion, contenido);
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
    public void accept(){
        
    }
    
    
}
