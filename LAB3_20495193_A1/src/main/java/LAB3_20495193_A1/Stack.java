
package LAB3_20495193_A1;
import java.util.ArrayList;

//se genera la clase Stack que sera el nucleo de todos los datos del programa
public class Stack {
    private ArrayList<String> usuarios = new ArrayList<>();
    private ArrayList<String> contrasenas = new ArrayList<>();
    private ArrayList<String> preguntas= new ArrayList<>();
    private ArrayList<String> respuestas = new ArrayList<>();
    private ArrayList<String> etiquetas = new ArrayList<>();
    //constructor

    public Stack() {
        this.usuarios = new ArrayList<>();
        this.contrasenas = new ArrayList<>();
        this.preguntas = new ArrayList<>();
        this.respuestas = new ArrayList<>();
        this.etiquetas = new ArrayList<>();
         
    }
    
    //getters y setters de la clase Stack

    public ArrayList<String> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<String> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<String> getContrasenas() {
        return contrasenas;
    }

    public void setContrasenas(ArrayList<String> contrasenas) {
        this.contrasenas = contrasenas;
    }

    public ArrayList<String> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<String> preguntas) {
        this.preguntas = preguntas;
    }

    public ArrayList<String> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(ArrayList<String> respuestas) {
        this.respuestas = respuestas;
    }

    public ArrayList<String> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(ArrayList<String> etiquetas) {
        this.etiquetas = etiquetas;
    }
    
   
}

   