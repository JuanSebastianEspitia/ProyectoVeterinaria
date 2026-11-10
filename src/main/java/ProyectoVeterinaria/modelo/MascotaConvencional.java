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
public class MascotaConvencional extends Mascota {
    private String raza;
    private List<Vacuna> registroVacunas = new ArrayList<>();

    public MascotaConvencional(String raza, String nombre, String edad, String peso, Dueño dueño, HistorialClinico historialClinico) {
        super(nombre, edad, peso, dueño, historialClinico);
        this.raza = raza;
    }
    
    
    
}
