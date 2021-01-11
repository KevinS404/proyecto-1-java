package LAB3_20495193_A1;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Se genera una clase llamada Usuario con 3 atributos refiriendose al nombre,
 * contraseña y reputacion de este. Esta clase tiene su respectivo constructor, getters
 * y setters ademas de poseer los metodos correspondientes a register,login,logout,reward
 * y accept.
 * @author Kevin Silva
 */
public class Usuario{
    private String nombre;
    private String contrasena;
    private int reputacion = 500; //por temas practicos todos inician con 500 puntos
    
    /**
     * Constructor de usuario, se utiliza para generar variables de la estructura
     * que debe tener un usuario.
     * @param nombre
     * @param contrasena
     * @param reputacion 
     */
    //Constructor de usuario
    public Usuario(String nombre, String contrasena, int reputacion) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.reputacion = reputacion;
    }
    
    //serie de getters y setters para cada elemento de la clase Usuario
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getReputacion() {
        return reputacion;
    }

    public void setReputacion(int reputacion) {
        this.reputacion = reputacion;
    }
    
    /** 
     * Metodo mediante el cual un usuario ingresa a las demas opciones que ofrece
     * el programa mediante la verificacion de sus credenciales
     * @param stackPrincipal
     * @param user
     * @return numero para saber si el logeo fue exitoso y darle acceso al usuario
     * o los datos fueron erroneos y el usuario no tiene acceso al sistema
     */
    public int Login(Stack stackPrincipal,Usuario user){
        //le indicamos al usuario que esta en el proceso de logeo
        System.out.println("PROCESO DE LOGEO\n");
        String nombreInicio;
        //le pedimos que ingrese su usuario por pantalla
        System.out.println("Ingrese su usuario: ");
        Scanner opcion = new Scanner(System.in);
        nombreInicio = opcion.nextLine();
        this.nombre = nombreInicio;
        //hacemos lo mismo para la contraseña del usuario
        String contrasenaInicio;
        System.out.println("Ingrese su contrasena: ");
        Scanner password = new Scanner(System.in);
        contrasenaInicio = password.nextLine();
        this.contrasena = contrasenaInicio;
        /**
         * Una vez se tienen las variables de nombre y contrasena se genera un verificador que
         * nos dira si es que el usuario pudo ser logeado o no. Esto se hace mediante un ciclo en
         * el cual se itera toda la lista de usuarios buscando si el nombre y la contraseña ya se encuentra ingresado,
         * si es que se encuentran entonces cambiamos el valor del user creado en main al usuario guardado
         * a la vez que cambiamos el valor del verificador.
         */
        int verificador = 1;
        for(int i = 0; i < stackPrincipal.getUsuarios().size();i++){
            if(user.getNombre().equals(stackPrincipal.getUsuarios().get(i).getNombre()) && user.getContrasena().equals(stackPrincipal.getUsuarios().get(i).getContrasena())){
                user = stackPrincipal.getUsuarios().get(i);
                verificador = 0;
           }
        }
        /**
         * Una vez listo este proceso el programa verifica que valor tiene el verificador
         * si este tiene el valor de 1 entonces no se encontro que el usuario o la contraseña
         * estuviera registrado por lo que se le dira que los datos no son validos
         */
        if(verificador == 1){
            System.out.println("Datos invalidos\n");
            return 1;
        }
        else if(verificador == 0) {
            System.out.println("Usuario logeado: " + user.getNombre());
            return 0;
        }
        return 0;
    }
    /**
     * Metodo que cierra la sesion de un usuario, para esto cambia la opcion que
     * mantiene el bucle do while de main a 6 y se le indica al usuario que la sesion
     * se esta cerrando.
     * @param cambiarOpcion
     * @return 
     */
    public int logout(int cambiarOpcion){
        System.out.println("Cerrando sesion.");
        cambiarOpcion = 6;
        return cambiarOpcion;
        
    }
   /**
    * Metodo que registrara a un usuario si es que este ya no esta registrado en
    * el stack, el metodo verificara que el usuario no exista, si este es el caso
    * entonces añadira el usuario a la lista de usuarios del stack.
    * @param stackPrincipal
    * @param user
    * @return 0
    */
   public int register(Stack stackPrincipal,Usuario user){
        //se le indica al usuario que esta en el proceso de registro
        System.out.println("\nPROCESO DE REGISTRO\n");
        String nombreRegistro;
        //le pedimos que ingrese el nombre de usuario que desea
        System.out.println("Ingrese el nombre de usuario con el que se registrara:");
        Scanner opcion = new Scanner(System.in);
        nombreRegistro = opcion.nextLine();
        System.out.println("\n");
        //hacemos lo mismo para la contraseña
        String contrasenaRegistro;
        System.out.println("Ingrese su contrasena: ");
        Scanner password = new Scanner(System.in);
        contrasenaRegistro = password.nextLine();
        System.out.println("\n");
       //variable auxiliar para retornar si es que el usuario fue registrado o no
        int verificador = 1;
        //recorremos la lista de usuarios viendo si es que el user que desea registrarse
        //ya existe
        for(int i = 0; i < stackPrincipal.getUsuarios().size();i++){
            if(user.equals(stackPrincipal.getUsuarios().get(i).getNombre())){
                //si el user existiera en la lista cambiamos el verificador a 0
                verificador = 0;
           }
        }
        //si el usuario no existe en el stack, indicamos por pantalla que el registro
        //se pudo hacer y agregamos el usuario al stack
        if(verificador == 1){
            this.nombre = nombreRegistro;
            this.contrasena = contrasenaRegistro;
            this.reputacion = 500;
            System.out.println("REGISTRO EXITOSO!\n");
            //agregamos al usuario a la lista con una reputacion inicial de 500 puntos
            stackPrincipal.agregarUsuario(nombreRegistro, contrasenaRegistro, 500);
        }
        //si el usuario existiera le indicaremos esto al usuario por pantalla
        //y le daremos la opcion de registrarse o de iniciar sesion
        else if(verificador == 0) {
            System.out.println("Usuario ya ingresado, intente con otro nombre");
        }
        return 0;
    }
   /**
    * Metodo mediante el cual un usuario recompensa una pregunta, para esto almacena
    * la pregunta mediante un metodo de la clase Stack el cual muestra las preguntas 
    * disponibles y el usuario elige la pregunta, el metodo entonces retornara esta pregunta
    * y empezara el proceso de premiacion en el cual se le dira al usuario cuanta reputacion tiene
    * y cuanta quiere dar, si esta es menor que la reputacion que tiene entonces el programa le dira que no
    * no tiene suficientes puntos. Si es que el usuario tiene los suficientes puntos,entonces se calculara la
    * diferencia entre la reputacion actual y la que quiere premiar y se le asignara esta a la reputacion del usuario
    * y la recompensa a la pregunta.
    * @param stack
    * @param user 
    */
       public void reward(Stack stack,Usuario user){
        Pregunta eleccion = stack.mostrarPreguntas(stack);
        int recompensa,diferencia;
        int repUsuario = user.getReputacion();
        System.out.println("usted tiene actualmente una reputacion de: " + repUsuario);
        System.out.println("Ingrese la cantidad de puntos de reputacion que premiara:");
        Scanner aux = new Scanner(System.in);
        recompensa = aux.nextInt();
       
        if (recompensa <= user.getReputacion()){
            eleccion.setRecompensa(recompensa);
            diferencia =user.getReputacion() - recompensa;
            user.setReputacion(diferencia);
            System.out.println("\nRecompensa otorgada.\n");
            System.out.println("Escoja su opcion: \n" +
                            "1. Agregar nueva pregunta\n" +
                            "2. Responder pregunta\n" +
                            "3. Dar recompensa\n" +
                            "4. Aceptar respuesta\n" +
                            "5. Cerrar sesion\n" +
                            "6. Salir del programa");
        }
        else{
            System.out.println("No tiene suficientes puntos.");
            System.out.println("Escoja su opcion: \n" +
                            "1. Agregar nueva pregunta\n" +
                            "2. Responder pregunta\n" +
                            "3. Dar recompensa\n" +
                            "4. Aceptar respuesta\n" +
                            "5. Cerrar sesion\n" +
                            "6. Salir del programa"); 
        }
    }  
    /**
     * Metodo para aceptar la respuesta a una de las preguntas del usuario
     * como resultado se cierra la pregunta y el autor de la respuesta 
     * se lleva la recompensa que tenga la pregunta acumulada hasta ese momento
     * @param stack
     * @param user 
     */
    public void accept(Stack stack, Usuario user){
        /**
         * Primero se genera un ArrayList de pregunta para almacenar las futuras
         * preguntas disponibles del usuario que esten aun abiertas, si es que
         * esta pregunta tiene 0 respuestas, se le notificara al usuario, en cambio,
         * si la pregunta tiene respuestas estas se le mostraran al usuario
         */
        ArrayList<Pregunta> preguntasDisponibles = new ArrayList<>();
        int j = 1;//variable auxiliar para mostrar al usuario el numero de la pregunta
        for(int i = 0; i < stack.getPreguntas().size();i++){
            //si la pregunta esta abierta entonces agregamos a preguntasDisponibles
            if("abierta".equals(stack.getPreguntas().get(i).getEstado()) && user.getNombre().equals(stack.getPreguntas().get(i).getAutor())){
                preguntasDisponibles.add(stack.getPreguntas().get(i));
                System.out.println("Pregunta" + " "+ j + ": "+ stack.getPreguntas().get(i).getTitulo()); //se le muestra al usuario la pregunta
                //caso en que la pregunta tenga 0 respuestas
                if(stack.getPreguntas().get(i).getCantidadRespuestas() == 0){
                    System.out.println("Aun no hay respuestas para esta pregunta.");
                }
                //este es el caso de que la pregunta si tenga respuestas
                else{
                    for(int k = 0; k < stack.getPreguntas().get(i).getCantidadRespuestas();i++){
                        if(stack.getRespuestas().get(i).getIdPregunta() == stack.getPreguntas().get(i).getIdPregunta()){
                            System.out.println("Respuesta de: " + stack.getRespuestas().get(i).getAutor());
                            System.out.println("Contenido: " + stack.getRespuestas().get(i).getContenido());
                        }   
                    }
                }
                j++;
            }
        }
        /**
         * Ahora queda el usuario eliga una respuesta para recompensar, si es que la lista de preguntas disponibles
         * no esta vacia entonces se le pedira al usuario que eliga una pregunta, si esta pregunta tiene 0 respuestas
         * entonces se le notificara al usuario que nadie ha respondido esta pregunta, si este no es el caso entonces
         * se le mostraran al usuario todas las respuestas disponibles para aceptar
         */
        //caso en que no hayan preguntas disponibles para elegir
        if(preguntasDisponibles.isEmpty()){
            System.out.println("No tiene preguntas disponibles para realizar esta accion");
        }
        //caso en el que hayan al menos una pregunta disponible
        else if(preguntasDisponibles.size() >= 1){
            int eleccion;
            System.out.println("Escriba el numero de la pregunta a elegir: ");
            Scanner aux = new Scanner(System.in);
            eleccion = aux.nextInt();
            Pregunta seleccion = preguntasDisponibles.get(eleccion-1);
            //si es que la pregunta no tiene respuestas, se le notificara al usuario
            if(seleccion.getCantidadRespuestas() == 0){
                System.out.println("Lo sentimos, esta pregunta no tiene respuestas aun");
            }
            //si es que la pregunta tiene respuestas, entonces le mostraremos todas las respuestas de la pregunta
            else if (seleccion.getCantidadRespuestas() >= 1){
                int aceptada;//variable auxiliar para almacenar la opcion 
                ArrayList<Respuesta> disponibles = new ArrayList<>();
                j = 1; //devolvemos esta variable a 1 para repetir un proceso similiar con las respuestas
                int id = seleccion.getIdPregunta();
                for(int i = 0;i < seleccion.getCantidadRespuestas();i++){
                    if(stack.getRespuestas().get(i).getIdPregunta() == id){
                        System.out.println("opcion numero: "+j);
                        System.out.println("Respuesta de: " + stack.getRespuestas().get(i).getAutor());
                        System.out.println("Contenido: " +stack.getRespuestas().get(i).getContenido());
                        disponibles.add(stack.getRespuestas().get(i));
                        j = j +1;
                    }
                }
            /**
             * hacemos que el usuario escoja una respuesta de las mostradas por pantalla
             * entonces haremos que esta respuesta sea guardada en una variable de tipo Respuesta,
             * tambien guardamos la recompensa acumulada de la pregunta en una variable y vaciamos
             * este atributo de la pregunta, para despues asignar esta recompensa al autor de la pregunta
             * que sera buscado mediante un ciclo,y finalmente dejar el estado de la pregunta como "cerrada"
             */
                System.out.println("Escoja la respuesta que desea aceptar: ");
                Scanner aux2 = new Scanner(System.in);
                aceptada = aux2.nextInt();
                Respuesta seleccionada = disponibles.get(aceptada-1);//variable para guardar la respuesta
                int recompensa = seleccion.getRecompensa();//variable para guardar la recompensa de la pregunta
                String usuario = seleccionada.getAutor();
                for (int i = 0;i < stack.getUsuarios().size();i++){
                    if(usuario == null ? stack.getUsuarios().get(i).getNombre() == null : usuario.equals(stack.getUsuarios().get(i).getNombre())){
                        System.out.println("Respuesta aceptada, la pregunta se marcara como cerrada");
                        int suma = stack.getUsuarios().get(i).getReputacion() + recompensa;
                        stack.getUsuarios().get(i).setReputacion(suma);
                        seleccion.setRecompensa(0);
                        seleccion.setEstado("cerrada");
                    }
                }
            }
        }
     System.out.println("\nOpciones disponibles: \n" +
                        "1. Agregar nueva pregunta\n" +
                        "2. Responder pregunta\n" +
                        "3. Dar recompensa\n" +
                        "4. Aceptar respuesta\n" +
                        "5. Cerrar sesion\n" +
                        "6. Salir del programa");    
    }  
}
