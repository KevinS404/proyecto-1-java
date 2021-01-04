
package LAB3_20495193_A1;

//se genera la clase Etiqueta que hereda a la clase Stack
public class Etiqueta extends Stack{
    private String nombre;
    private String descripcion;
    //constructor
    public Etiqueta(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    //getters y setters para cada elemento de la clase Etiqueta
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
    
}


