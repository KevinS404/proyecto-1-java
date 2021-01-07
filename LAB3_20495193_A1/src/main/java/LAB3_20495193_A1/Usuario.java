package LAB3_20495193_A1;

//Se genera una clase Usuario con 3 atributos esenciales para el programa

import java.util.ArrayList;
import java.util.Scanner;
//se genera la clase Usuario que hereda a la clase Stack
public class Usuario extends Stack{
    private String nombre;
    private String contrasena;
    private int reputacion;
    
    //constructor
    
    public Usuario() {
    }

    public Usuario(Stack stackPrincipal) {
        String nombreRegistro;
        System.out.println("Ingrese su nombre: ");
        Scanner opcion = new Scanner(System.in);
        nombreRegistro = opcion.nextLine();
        
        this.nombre = nombreRegistro;
        
        String contrasenaRegistro;
        System.out.println("Ingrese su contrasena: ");
        Scanner password = new Scanner(System.in);
        contrasenaRegistro = password.nextLine();
        
        this.contrasena = contrasenaRegistro;
        int resultado = register(stackPrincipal,nombreRegistro,contrasenaRegistro);
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
    
    
    public int Login(Stack stackPrincipal){
        String nombreInicio;
        System.out.println("Ingrese su nombre: ");
        Scanner opcion = new Scanner(System.in);
        nombreInicio = opcion.nextLine();
        
        String contrasenaInicio;
        System.out.println("Ingrese su contrasena: ");
        Scanner password = new Scanner(System.in);
        contrasenaInicio = password.nextLine();
        ArrayList<String> users = stackPrincipal.getUsuarios();
        ArrayList<String> pass = stackPrincipal.getContrasenas();
        int verificador = 1;
        for(int i = 0; i < users.size();i++){
            if(nombreInicio.equals(users.get(i)) && contrasenaInicio.equals(pass.get(i))){
                verificador = 0;
           }
        }
        if(verificador == 1){
            System.out.println("Usuario no encontrado");
            return 1;
        }
        else if(verificador == 0) {
            System.out.println("Usuario logeado: "+ nombreInicio);
            return 0;
        }
        return 0;
    }
    public int logout(int cambiarOpcion){
        cambiarOpcion = 6;
        return cambiarOpcion;
        
    }
    
   public int register(Stack stackPrincipal,String user, String password){
        ArrayList<String> users = stackPrincipal.getUsuarios();
        int verificador = 1;
        for(int i = 0; i < users.size();i++){
            if(user.equals(users.get(i))){
                verificador = 0;
           }
        }
        if(verificador == 1){
            System.out.println("REGISTRO EXITOSO!");
            stackPrincipal.getUsuarios().add(user);
        }
        else if(verificador == 0) {
            System.out.println("Usuario ya ingresado,intente otra vez");
            Usuario retry = new Usuario(stackPrincipal);
        }
        return 0;
    }
            
}
