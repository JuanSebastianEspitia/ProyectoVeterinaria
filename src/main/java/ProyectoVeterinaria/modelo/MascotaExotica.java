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
    private String permisoAmbientalICA;

    public MascotaExotica(String permisoAmbientalICA, String nombre, String edad, String peso, Dueño dueño) {
        super(nombre, edad, peso, dueño);
        this.permisoAmbientalICA = permisoAmbientalICA;
    }

    
    
    @Override
    public float calcularPago() {
       float total = this.getValorBase() +this.recargoExotica;
    return total;
}
    
    public float obtenerRecargoExotica(){
        float total=this.getValorBase()*this.recargoExotica;
        return total; 
    }
    
    public String getPermisoAmbientalICA() {
        return permisoAmbientalICA;
    }

    
    
}
