/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoVeterinaria.modelo;

/**
 *
 * @author JUAN SEBASTIAN
 */
public class MascotaExotica extends Mascota {
    
    private String permisoAmbientalICA;
    private boolean requiereSedacion;

    public MascotaExotica(String permisoAmbientalICA, boolean requiereSedacion, String nombre, String edad, String peso,
            Dueño dueño, HistorialClinico historialClinico) {
        super(nombre, edad, peso, dueño, historialClinico);
        this.permisoAmbientalICA = permisoAmbientalICA;
        this.requiereSedacion = requiereSedacion;
    }

    @Override
    public float calcularPago() {
       
    }
}
