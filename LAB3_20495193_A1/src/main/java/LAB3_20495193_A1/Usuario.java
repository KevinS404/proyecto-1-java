package LAB3_20495193_A1;

//Se genera una clase Usuario con 3 atributos esenciales para el programa

import java.util.Scanner;
//se genera la clase Usuario que hereda a la clase Stack
public class Usuario extends Stack{
    private String nombre;
    private String contrasena;
    private int reputacion;
    
    //constructor
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
        
        this.nombre = contrasenaRegistro;
        int resultado = register(stackPrincipal,contrasenaRegistro,nombreRegistro);
  
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
    
    
    public void Login(String Nombre,String Usuario){
        
        
    }
    public void logout(String Nombre,String Usuario){
        
    }
   public int register(Stack stackPrincipal,String user, String password){
       for(int i = 0; i < usuarios.size();i++){
           if(user == null ? usuarios.get(i) == null : user.equals(usuarios.get(i))){
               usuarios.add(user);
               System.out.println("Registro exitoso ");
               return 1;
           }
       }
       return 0;
   }
            
}
