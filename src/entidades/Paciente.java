 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.List;

/**
 *
 * @author emers
 */
public class Paciente {
    
    private String dni;
    private String nombre;
    private String telefono;
    private int sexobiologico;

    
    
    public final static int MASCULINO =0;
    public final static int FEMENINO =0;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getSexobiologico() {
        return sexobiologico;
    }

    public void setSexobiologico(int sexobiologico) {
        this.sexobiologico = sexobiologico;
    }
   
    
    public String getDatosMostrar() {
        return this.nombre +" - DNI: "+this.dni+""+this.telefono;
    }
    
    
   
    
}
