
package LAB3_20495193_A1;
import java.util.ArrayList;

//se genera la clase Stack que sera el nucleo de todos los datos del programa
public class Stack {
    ArrayList<String> usuarios = new ArrayList<>();
    ArrayList<String> contrasenas = new ArrayList<>();
    ArrayList<String> preguntas= new ArrayList<>();
    ArrayList<String> respuestas = new ArrayList<>();
    //constructor
    public Stack() {
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

   
    
    

   
   

}