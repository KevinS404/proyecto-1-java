
package LAB3_20495193_A1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //primero se incluyen todas las estructuras de ejemplo solicitadas
        //1 stack inicial
        Stack stackPrincipal = new Stack();
        //4 usuarios registrados de ejemplo
        stackPrincipal.agregarUsuario("usuario1", "contrasena1",500);
        stackPrincipal.agregarUsuario("usuario2", "contrasena2",200);
        stackPrincipal.agregarUsuario("usuario3", "contrasena3",10);
        stackPrincipal.agregarUsuario("usuario4", "contrasena4",27);
        //4 etiquetas de ejemplo
        stackPrincipal.agregarEtiqueta("java","lenguaje orientado a objetos");
        stackPrincipal.agregarEtiqueta("prolog","lenguaje de paradigma logico");
        stackPrincipal.agregarEtiqueta("scheme","lenguaje de paradigma funcional");
        stackPrincipal.agregarEtiqueta("c++","lenguaje orientado a objetos");
        //auxiliares para generar 5 preguntas con sus etiquetas respectivas
        ArrayList<String> etiqueta1 = new ArrayList<>();
        etiqueta1.add("java");
        ArrayList<String> etiqueta2 = new ArrayList<>();
        etiqueta1.add("prolog");
        ArrayList<String> etiqueta3 = new ArrayList<>();
        etiqueta1.add("scheme");
        ArrayList<String> etiqueta4 = new ArrayList<>();
        etiqueta1.add("c++");
        //5 preguntas de ejemplo
        
        stackPrincipal.agregarPregunta(1,2,etiqueta1, "titulo1", "contenido1" , "fechaDePublicacion1", "usuario1", "cerrada", 0);
        stackPrincipal.agregarPregunta(2,0,etiqueta2, "titulo2", "contenido2" , "fechaDePublicacion2", "usuario2", "abierta", 15);
        stackPrincipal.agregarPregunta(3,5,etiqueta3, "titulo3", "contenido3" , "fechaDePublicacion3", "usuario3", "cerrada", 0);
        stackPrincipal.agregarPregunta(4,1,etiqueta1, "titulo4", "contenido4" , "fechaDePublicacion4", "usuario4", "abierta", 0);
        stackPrincipal.agregarPregunta(5,6,etiqueta4, "titulo5", "contenido5" , "fechaDePublicacion4", "usuario1", "cerrada", 0);

        //10 respuestas de ejemplo
        stackPrincipal.agregarRespuesta(1,1, "usuario1", "27/07/2020", "contenido1");
        stackPrincipal.agregarRespuesta(2,2, "usuario1", "07/01/2021", "contenido2");
        stackPrincipal.agregarRespuesta(3,1, "usuario2", "10/07/2020", "contenido3");
        stackPrincipal.agregarRespuesta(2,1, "usuario2", "27/03/2020", "contenido4");
        stackPrincipal.agregarRespuesta(1,2, "usuario2", "02/01/2021", "contenido5");
        stackPrincipal.agregarRespuesta(3,2, "usuario3", "30/11/2020", "contenido6");
        stackPrincipal.agregarRespuesta(2,3, "usuario3", "20/09/2020", "contenido7");
        stackPrincipal.agregarRespuesta(2,4, "usuario3", "12/12/2020", "contenido8");
        stackPrincipal.agregarRespuesta(4,5, "usuario4", "06/07/2020", "contenido9");
        stackPrincipal.agregarRespuesta(5,5, "usuario4", "15/01/2020", "contenido10");
        /**
         * Se genera una variable auxiliar para el menu del programa, la segunda variable 
         * que se genera tiene como objetivo almacenar la opcion del usuario al mostrarse
         * el primer menu del programa, segun lo que eliga el usuario se ejecutan diferentes 
         * metodos, el de la opcion 1 es login y el de la opcion 2 es register.
         */
        int verificador = 1;
        System.out.println("Bienvenido");
        while(verificador == 1){
            System.out.println( "1. Login\n" + "2. Register\n" + "3. Search");
            //creamos vairables auxiliares para almacenar la opcion del usuario
            //una vez que ingrese
            int primeraOpcion;
            Scanner opcion1 = new Scanner(System.in);
            System.out.println("INTRODUZCA SU OPCION:");
            primeraOpcion = opcion1.nextInt();
            /**
             * Si el usuario ingresa el numero uno entonces se le pedira que inicie sesion,
             * si el inicio es exitoso entonces se le mostrara el menu principal del programa en
             * el cual tiene opciones para agregar preguntas y respuestas, dar recompensar,aceptar
             * respuestas de otros usuarios a sus preguntas, cerrar sesion o salir del programa
             */
            if(primeraOpcion == 1){
                Usuario user = new Usuario("","",500);
                int comprobante = user.Login(stackPrincipal,user);
                if(comprobante == 0){
                    //una vez iniciada la sesion correctamente entonces se le despliega el menu
                    //para que elija una accion.
                    System.out.println("\nOpciones disponibles: \n" +
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
                            //en el caso de elegir la primera opcion haremos que el usuario ingrese los datos de la pregunta
                            case 1:
                                Pregunta question = new Pregunta(stackPrincipal,user);
                                break;
                            //en el caso de elegir la segunda opcion haremos que el usuario responda alguna pregunta
                            case 2:
                                Respuesta answer = new Respuesta(stackPrincipal,user);
                                break;
                            //en el caso de elegir la tercera opcion haremos que el usuario agregue la recompensa
                            case 3:
                              user.reward(stackPrincipal, user);
                                break;
                            //en el caso de elegir la cuarta opcion ejecutaremos el metodo accept 
                            case 4:
                                user.accept(stackPrincipal, user);
                                break;
                            //en el caso de elegir la quinta opcion ejecutaremos el metodo de logout
                            case 5:
                                opcion2 = user.logout(opcion2);
                                break;
                            //en el caso de elegir la sexta opcion se indicara por pantalla que el programa se termino
                            case 6:
                                System.out.println("Fin del programa");;
                                verificador = 0;
                                break;
                            //si se ingresa una opcion distinta, se indicara por pantalla que no es valido
                            default:
                                System.out.println("Opcion no valida\n");
                                break;
                            }
                     //mientras el usuario no elija salir del programa se seguira mostrando este menu
                    }while (opcion2 != 6);
                }
            }
            //si la primera opcion es 2 entonces haremos que el usuario se registre
            else if(primeraOpcion == 2){
                Usuario user = new Usuario("","",500);
                user.register(stackPrincipal, user);
            }
            //si la primera opcion es 3 entonces haremos ejecucion del metodo search
            else if (primeraOpcion == 3){
                int opcionBusqueda;
                String busqueda;
                System.out.println("Opciones de busqueda:\n1. Texto dentro de pregunta\n"
                        + "2. Texto dentro de respuesta\n"
                        + "3. Por etiquetas\n"
                        + "Escoja el numero de la opcion que desea: ");
                Scanner aux = new Scanner(System.in);
                opcionBusqueda = aux.nextInt();
                //nos aseguramos de que solo se pueda iniciar el metodo si se escoge uno de los 3 criterios mostrados.
                if(opcionBusqueda >= 1 && opcionBusqueda <=3){
                    System.out.println("Escriba la palabra o criterio que esta buscando: ");
                    Scanner aux2 = new Scanner(System.in);
                    busqueda = aux2.nextLine();
                    stackPrincipal.search(stackPrincipal, opcionBusqueda, busqueda);
                }
                else{
                    System.out.println("Opcion no valida.\n");
                }
                
            }
        }
    }
}