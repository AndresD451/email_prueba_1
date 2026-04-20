/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correo_electronico_q2_26;

/**
 *
 * @author user
 */
public class EmailAccount {
    
    String Direccion;
    String Contrasena;
    String nombre_Usuario;
    Email[] inbox;
    
    public EmailAccount(String Direccion, String Contrasena, String nombre_Usuario){
        
        this.Direccion = Direccion;
        this.Contrasena = Contrasena;
        this.nombre_Usuario = nombre_Usuario;
        this.inbox = new Email[100];
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public String getNombre_Usuario() {
        return nombre_Usuario;
    }

    public boolean recibirEmail (Email nuevo){
        for (int i = 0; i < inbox.length; i++){
            if (inbox[i] == null){
                inbox[i] = nuevo;
                return true;
            }
        }
        return false;
    }
    
    
    
}
