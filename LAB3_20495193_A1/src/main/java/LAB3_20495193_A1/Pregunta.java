/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB3_20495193_A1;

/**
 *
 * @author Admin
 */
public class Pregunta {
    private int iD;
    private int respuestas;
    private String etiquetas[];
    private String titulo;
    private String fechaDePublicacion;
    private String autor;
    private String estado;
    private int recompensa;

    public Pregunta(int iD, int respuestas, String[] etiquetas, String titulo, String autor, String estado, int recompensa) {
        this.iD = iD;
        this.respuestas = respuestas;
        this.etiquetas = etiquetas;
        this.titulo = titulo;
        this.autor = autor;
        this.estado = estado;
        this.recompensa = recompensa;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public int getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(int respuestas) {
        this.respuestas = respuestas;
    }

    public String[] getEtiquetas() {
        return etiquetas;
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
    
    
    public void ask(String titulo,String contenido,String etiquetas[]){
        
    }
   
    
}
