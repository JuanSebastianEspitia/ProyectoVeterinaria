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
    
    private float recargoExotica = 0.25f;
    private int costoSedacion = 4000;
    private String permisoAmbientalICA;
    private boolean requiereSedacion;

    public MascotaExotica(String permisoAmbientalICA, boolean requiereSedacion, String nombre, String edad, String peso, Dueño dueño) {
        super(nombre, edad, peso, dueño);
        this.permisoAmbientalICA = permisoAmbientalICA;
        this.requiereSedacion = requiereSedacion;
    }

    @Override
    public float calcularPago(ConsultaMedica consulta) {
       float total = tarifaBase * (1 + recargoExotica);
    if (requiereSedacion) {
        total += costoSedacion;
    }
    return total;
}

    
    public String getPermisoAmbientalICA() {
        return permisoAmbientalICA;
    }

    public boolean isRequiereSedacion() {
        return requiereSedacion;
    }
    
}
