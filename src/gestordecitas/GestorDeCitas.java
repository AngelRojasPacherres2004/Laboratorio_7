/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestordecitas;

import entidades.Cita;

import entidades.Medico;
import entidades.Paciente;
import gestordecitas.pantallas.JFrameGestorDeCitas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emers
 */
public class GestorDeCitas {

    //Tenemos las listas de forma estatica para toda la aplicaion
    public static List<Cita> citasEnElSistema;
    public static List<Paciente> listaDePacientes;
    public static List<Medico> listaDeMedicos; 
    
    public static List<String> horasDisponibles = new ArrayList<>();
       public static List<String> fechaDisponibles = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Generamos las listas pero en blanco, crear un lugar en la memoria
        //Para comenzar a insertar los datos respectivos.
        citasEnElSistema = new ArrayList<>();
        listaDePacientes = new ArrayList<>();
        listaDeMedicos = new ArrayList<>();
        
        
        
        
        
        
        horasDisponibles.add("9:00am");
        horasDisponibles.add("9:30am");
        horasDisponibles.add("10:00am");
        horasDisponibles.add("10:30am");
        horasDisponibles.add("11:00am");
        horasDisponibles.add("11:30am");
        
        fechaDisponibles.add("05/05/2023");
        fechaDisponibles.add("06/05/2023");
        fechaDisponibles.add("07/05/2023");
        fechaDisponibles.add("08/05/2023");
        
        
        
        
        
        //Invocamos a la pantalla principal para se muestre 
        //Se mostrará cuando se ejecute
        JFrameGestorDeCitas framePrincipal = new JFrameGestorDeCitas();
        framePrincipal.setLocationRelativeTo(null); //Para que se coloque en el centro
        framePrincipal.setVisible(true); //Para que se muestre
        
        
        
    }  
    
}
