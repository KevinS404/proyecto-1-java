
package LAB3_20495193_A1;

//se genera la clase Etiqueta

import java.util.ArrayList;

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


