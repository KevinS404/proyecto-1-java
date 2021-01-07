
package LAB3_20495193_A1;

import java.util.Scanner;

//se genera la clase Pregunta que hereda la clase Stack
public class Pregunta extends Stack{
    static private int idPregunta = 5;
    static private int cantidadRespuestas;
    private String etiquetas[];
    private String titulo;
    private String fechaDePublicacion;
    private String autor;
    private String estado;
    private int recompensa;
    //cosntructor
    public Pregunta(int idPregunta, int respuestas, String[] etiquetas, String titulo, String autor, String estado, int recompensa) {
        Pregunta.idPregunta ++;
        Pregunta.cantidadRespuestas = 0;
        this.etiquetas = etiquetas;
        this.titulo = titulo;
        this.autor = autor;
        this.estado = estado;
        this.recompensa = recompensa;
    }

    //getters y setters para la clase Pregunta
    public int getidPregunta() {
        return idPregunta;
    }

    public void setidPregunta(int idPregunta) {
        Pregunta.idPregunta = idPregunta;
    }

    
    public int getCantidadRespuestas() {
        return cantidadRespuestas;
    }

    public void setCantidadRespuestas(int cantidadRespuestas) {
        Pregunta.cantidadRespuestas = cantidadRespuestas;
    }

    public void setEtiquetas(String[] etiquetas) {
        this.etiquetas = etiquetas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public void setFechaDePublicacion(String fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(int recompensa) {
        this.recompensa = recompensa;
    }
    
    
    public void ask(){
       
    }
    public void reward(){
        
    }
   
    
}
