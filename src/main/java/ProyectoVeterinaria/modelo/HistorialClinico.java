/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoVeterinaria.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JUAN SEBASTIAN
 */
public class HistorialClinico {
    private List<ConsultaMedica> consultas = new ArrayList<>();
    
    public void agregarConsulta(ConsultaMedica consulta){
        consultas.add(consulta);
    }
    public List<ConsultaMedica> obtenerConsultas(){
        return consultas;
    }
    
}
