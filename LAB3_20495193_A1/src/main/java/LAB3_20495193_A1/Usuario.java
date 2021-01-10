package LAB3_20495193_A1;

//Se genera una clase Usuario con 3 atributos esenciales para el programa

import java.util.Scanner;
//se genera la clase Usuario 
public class Usuario{
    private String nombre;
    private String contrasena;
    private int reputacion;
    
    //constructor
    
    public Usuario(String nombre, String contrasena, int reputacion) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.reputacion = reputacion;
    }

    public Usuario(Stack stackPrincipal, int n) {
        //dentro del constructor tenemos 2 condicionales, si el numero inicial es 1
        //entonces ejecutaremos el proceso que tiene que ver con login
        if(n == 1){
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
        }
        //si el usuario elige la segunda opcion ejecutamos el proceso
        //de registro
        else if(n == 2){
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
            //una vez que tenemos los datos esenciales, ejecutamos el metodo register que
            //retornara una variable que usaremos para ver si efectivamente se logro el proceso
            int resultado = register(stackPrincipal,nombreRegistro,contrasenaRegistro);
        }
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
    
    //metodo para logear que recibe como entrada el stack, un nombre y una contraseña
    public int Login(Stack stackPrincipal,String nombreInicio, String contrasenaInicio){
        //almacenamos en unas listas auxiliares todos los usuarios y contraseñas que se tienen hasta el momento
        int verificador = 1;
        for(int i = 0; i < stackPrincipal.getUsuarios().size();i++){
            if(nombreInicio.equals(stackPrincipal.getUsuarios().get(i).getNombre()) && contrasenaInicio.equals(stackPrincipal.getUsuarios().get(i).getContrasena())){
                verificador = 0;
           }
        }
        if(verificador == 1){
            System.out.println("Datos invalidos\n");
            return 1;
        }
        else if(verificador == 0) {
            this.nombre = nombreInicio;
            this.contrasena = contrasenaInicio;
            System.out.println("Usuario logeado: "+ nombreInicio);
            return 0;
        }
        return 0;
    }
    public int logout(int cambiarOpcion){
        cambiarOpcion = 6;
        return cambiarOpcion;
        
    }
    //meotodo que registra un usuario si es que este no existe ya en el stack
   public int register(Stack stackPrincipal,String user, String password){
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
            this.nombre = user;
            this.contrasena = password;
            this.reputacion = 500;
            System.out.println("REGISTRO EXITOSO!\n");
            //agregamos al usuario a la lista con una reputacion inicial de 500 puntos
            stackPrincipal.agregarUsuario(user, contrasena, reputacion);
        }
        //si el usuario existiera le indicaremos esto al usuario por pantalla
        //y le daremos la opcion de registrarse o de iniciar sesion
        else if(verificador == 0) {
            System.out.println("Usuario ya ingresado, intente con otro nombre");
                Usuario reIntento = new Usuario(stackPrincipal,2);
        }
        return 0;
    }
       public void reward(Stack stack,Usuario user){
        Pregunta eleccion = stack.mostrarPreguntas(stack);
        int recompensa;
        int repUsuario = user.getReputacion();
        System.out.println("usted tiene actualmente una reputacion de: " + repUsuario);
        System.out.println("Ingrese la cantidad de puntos de reputacion que premiara:");
        Scanner aux = new Scanner(System.in);
        recompensa = aux.nextInt();
        if (recompensa <= user.getReputacion()){
            eleccion.setRecompensa(recompensa);
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
}
