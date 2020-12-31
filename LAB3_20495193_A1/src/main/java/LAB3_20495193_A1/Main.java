/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB3_20495193_A1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    
    Usuario usuario1 = new Usuario("kevin", "polar12");
    Usuario usuario2 = new Usuario("kevin", "polar12");
    Usuario usuario3 = new Usuario("kevin", "polar12");
    Usuario usuario4 = new Usuario("kevin", "polar12");
    
    
    
    public static void main(String[] args) {
       
        System.out.println("Escoja su opcion: \n" +
                           "1. Agregar nueva pregunta\n" +
                           "2. Responder pregunta\n" +
                           "3. Dar recompensa\n" +
                           "4. Aceptar respuesta\n" +
                           "5. Cerrar sesion\n" +
                           "6. Salir del programa");
        Scanner opcion = new Scanner(System.in);
        System.out.println("INTRODUZCA SU OPCION: ");
        int opcion1 = opcion.nextInt();
        if(opcion1 == 1){
            System.out.println("opcion 1");
        }
        else if(opcion1 == 2){
            System.out.println("opcion 2");
        }
        else if(opcion1 == 3){
            System.out.println("opcion 3");
        }
        else if(opcion1 == 4){
            System.out.println("opcion 4");
        }
        else if(opcion1 == 5){
            System.out.println("opcion 5");
        }
        else if(opcion1 == 6){
            System.out.println("opcion 6");
        }
        else{
            System.out.println("Opcion no valida");
        }
        }
    
}