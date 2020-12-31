/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB3_20495193_A1;


public class Stack {
    String preguntas[];
    String respuestas[];

    public Stack(String[] preguntas, String[] respuestas) {
        this.preguntas = preguntas;
        this.respuestas = respuestas;
    }

    public String[] getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(String[] preguntas) {
        this.preguntas = preguntas;
    }

    public String[] getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(String[] respuestas) {
        this.respuestas = respuestas;
    }
    
}

