
package LAB3_20495193_A1;
/**
 * Se crea una clase Etiqueta la cual tiene como atributos el nombre
 * de la etiqueta y la descripcion de la misma
 * @author Kevin Silva
 */
public class Etiqueta{
    private String nombre;
    private String descripcion;

    public Etiqueta(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

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


