/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB3_20495193_A1;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
  
    Usuario usuario1 = new Usuario("usuario1", "polar9");
    Usuario usuario2 = new Usuario("usuario2", "polar10");
    Usuario usuario3 = new Usuario("usuario3", "polar11");
    Usuario usuario4 = new Usuario("usuario4", "polar12");
    
    
    
    public static void main(String[] args) {
        System.out.println("Bienvenido\n"
                        + "1. Login\n"
                        + "2. Register\n");
        //login()
        int primeraOpcion;
        Scanner opcion1 = new Scanner(System.in);
        System.out.println("INTRODUZCA SU OPCION:");
        primeraOpcion = opcion1.nextInt();
        if(primeraOpcion == 1){
            System.out.println("Escoja su opcion: \n" +
                           "1. Agregar nueva pregunta\n" +
                           "2. Responder pregunta\n" +
                           "3. Dar recompensa\n" +
                           "4. Aceptar respuesta\n" +
                           "5. Cerrar sesion\n" +
                           "6. Salir del programa");
            int opcion2;
            do{
                Scanner opcion = new Scanner(System.in);
                System.out.println("INTRODUZCA SU OPCION: ");
                opcion2 = opcion.nextInt();
                switch (opcion2) {
                    case 1:
                        System.out.println("opcion 1");
                        //ask();
                        break;
                    case 2:
                        System.out.println("opcion 2");
                        //answer();
                        break;
                    case 3:
                        System.out.println("opcion 3");
                        //reward();
                        break;
                    case 4:
                        System.out.println("opcion 4");
                        //aceppt();
                        break;
                    case 5:
                        System.out.println("opcion 5");
                        //logout();
                        break;
                    case 6:
                        System.out.println("Fin del programa");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
            }while (opcion2 != 6);
        }
        if(primeraOpcion == 2){
            System.out.println("Register");
            //register();
        }
    }
}