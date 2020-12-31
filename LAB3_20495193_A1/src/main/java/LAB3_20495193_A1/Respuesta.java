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
public class Respuesta {
    int iD;
    String autor;
    String fecha;
    String contenido;

    public Respuesta(int iD, String autor, String fecha, String contenido) {
        this.iD = iD;
        this.autor = autor;
        this.fecha = fecha;
        this.contenido = contenido;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
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
    
    
}
