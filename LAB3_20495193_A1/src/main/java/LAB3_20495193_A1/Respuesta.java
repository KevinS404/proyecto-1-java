
package LAB3_20495193_A1;

//se genera una clase Respuesta con sus atributos fundamentales que tambien hereda 
//la clase stack
public class Respuesta extends Stack {
    static int idRespuesta = 0;
    String autor;
    String fecha;
    String contenido;
    //constructor
    public Respuesta(int idRespuesta, String autor, String fecha, String contenido) {
        Respuesta.idRespuesta = idRespuesta + 1;
        this.autor = autor;
        this.fecha = fecha;
        this.contenido = contenido;
    }
    //getters y setters de la clase Respuesta
    public int getidRespuesta() {
        return idRespuesta;
    }

    public void setidRespuesta(int idRespuesta) {
        Respuesta.idRespuesta = idRespuesta;
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
    public void answer(){
        
    }
    public void accept(){
        
    }
    
    
}
