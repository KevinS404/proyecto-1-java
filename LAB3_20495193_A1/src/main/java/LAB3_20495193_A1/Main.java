
package LAB3_20495193_A1;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        //1 stack inicial
        Stack stackPrincipal = new Stack();
        //4 usuarios registrados
        stackPrincipal.getUsuarios().add("usuario1");
        stackPrincipal.getContrasenas().add("contrasena1");
        stackPrincipal.getUsuarios().add("usuario2");
        stackPrincipal.getContrasenas().add("contrasena2");
        stackPrincipal.getUsuarios().add("usuario3");
        stackPrincipal.getContrasenas().add("contrasena3");
        stackPrincipal.getUsuarios().add("usuario4");
        stackPrincipal.getContrasenas().add("contrasena4");
        //5 preguntas
        stackPrincipal.getPreguntas().add("pregunta1");
        stackPrincipal.getPreguntas().add("pregunta2");
        stackPrincipal.getPreguntas().add("pregunta3");
        stackPrincipal.getPreguntas().add("pregunta4");
        stackPrincipal.getPreguntas().add("pregunta5");
        
        
        int verificador = 1;
        while(verificador == 1){
            System.out.println("Bienvenido\n"
                                + "1. Login\n"
                                + "2. Register\n");
            //creamos vairables auxiliares para almacenar la opcion del usuario
            //una vez que ingrese
            int primeraOpcion;
            Scanner opcion1 = new Scanner(System.in);
            System.out.println("INTRODUZCA SU OPCION:");
            primeraOpcion = opcion1.nextInt();
            //si el usuario ingresa la opcion 1 entonces se le pedira que inicie sesion
            if(primeraOpcion == 1){
                Usuario user1 = new Usuario();
                int comprobante = user1.Login(stackPrincipal);
                if(comprobante == 0){
                    //una vez iniciada la sesion correctamente entonces se le despliega el menu
                    //para que elija una accion.
                    System.out.println("Escoja su opcion: \n" +
                           "1. Agregar nueva pregunta\n" +
                           "2. Responder pregunta\n" +
                           "3. Dar recompensa\n" +
                           "4. Aceptar respuesta\n" +
                           "5. Cerrar sesion\n" +
                           "6. Salir del programa");
                    //generamos una variable auxiliar para la opcion que escoja el usuario
                    int opcion2;
                    //este menu funcionara mientras la persona no escoga la opcion 6
                    do{
                        Scanner opcion = new Scanner(System.in);
                        System.out.println("INTRODUZCA SU OPCION: ");
                        opcion2 = opcion.nextInt();
                        switch (opcion2) {
                            //en el caso de elegir la primera opcion ejecutaremos la funcionalidad ask
                            case 1:
                                System.out.println("opcion 1");
                                //ask();
                                break;
                            //en el caso de elegir la segunda opcion ejecutaremos la funcionadlidad answer
                            case 2:
                                System.out.println("opcion 2");
                                //answer();
                                break;
                            //en el caso de elegir la tercera opcion ejecutaremos la funcionadlidad reward
                            case 3:
                                System.out.println("opcion 3");
                                //reward();
                                break;
                            //en el caso de elegir la cuarta opcion ejecutaremos la funcionadlidad accept
                            case 4:
                                System.out.println("opcion 4");
                                //aceppt();
                                break;
                            //en el caso de elegir la quinta opcion ejecutaremos la funcionalidad logout
                            case 5:
                                System.out.println("opcion 5");
                                opcion2 = user1.logout(opcion2);
                                break;
                            //en el caso de elegir la sexta opcion se indicara por pantalla que el programa se termino
                            case 6:
                                System.out.println("Fin del programa");;
                                verificador = 0;
                                break;
                            //si se ingresa una opcion distinta, se indicara por pantalla que no es valido
                            default:
                                System.out.println("Opcion no valida");
                                break;
                            }
                    }while (opcion2 != 6);
                }
            }
            //si la primera opcion es 2 entonces ejecutraremos la funcionalidad register
            else if(primeraOpcion == 2){
                Usuario user = new Usuario(stackPrincipal);
            }
        }
    }
}