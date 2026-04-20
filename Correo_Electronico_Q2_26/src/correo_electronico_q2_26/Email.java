/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correo_electronico_q2_26;

/**
 *
 * @author user
 */
    
public class Email {
    String Direccion;
    String asunto;
    String Contenido;
    boolean leido;
    
    public Email (String Direccion, String asunto, String Contenido){
        this.Direccion = Direccion;
        this.asunto = asunto;
        this.Contenido = Contenido;
        this.leido = false;
        
       
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getContenido() {
        return Contenido;
    }

    public boolean isLeido() {
        return leido;
    }
    
    public void marcarComoLeido(){
        leido = true;
    }
    
    public void imprimirCorreo(){
        System.out.println("DE: " +Direccion);
        System.out.println ("Asunto: " + asunto);
        System.out.println(Contenido);
    }
    
    
}
