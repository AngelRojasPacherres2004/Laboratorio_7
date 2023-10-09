/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emers
 */
public class Medico {

    
    private String nombre;
    private String CMP;
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCMP() {
        return CMP;
    }

    public void setCMP(String CMP) {
        this.CMP = CMP;
    }
    
    
    private List<Especialidad> especialidades;

    public Medico(String nombre, String CMP,List<Especialidad> especialidadaes ) throws Exception {
        this.nombre = nombre;
        this.CMP = CMP;
        this.especialidades = especialidadaes;
        if(especialidadaes==null){
          throw new Exception("No se puede crear");
        }
    }
    
    public void agregarEspecialidad(Especialidad especialidad){ //Con este metodo se agrega una un elemento d las especialidades
        this.especialidades.add(especialidad);
    }
    
    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }
    
    
    public String getDatosMostrar() {
        
        return this.nombre + " | CMP: " + this.CMP;
        
    }    
}
