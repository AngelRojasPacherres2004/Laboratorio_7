/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Cita {
    
       
    
    
    private int hora;
    private int fecha;
    private Medico medico;
    private Paciente paciente;
    private Especialidad especialidad;

    public Cita(Medico medico, Paciente paciente, Especialidad especialidad) {
        this.medico = medico;
        this.paciente = paciente;
        this.especialidad = especialidad;
        
    }
    
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

   

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
    
    public String mostrarDatos(){
        return this.getPaciente().getNombre() + " - "
                +gestordecitas.GestorDeCitas.fechaDisponibles.get(getFecha())+" - "
                +gestordecitas.GestorDeCitas.horasDisponibles.get(getHora())+" - "
                +" | Medico: "+this.getMedico().getNombre();
    }
}
