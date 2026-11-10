/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoVeterinaria.modelo;

/**
 *
 * @author JUAN SEBASTIAN
 */
public class Veterinario extends Trabajador {
    private String especialidad;
    private String tarjetaProfesional;

    public Veterinario(String especialidad, String tarjetaProfesional, String nombre, String documento, String correo, String telefono, float sueldo) {
        super(sueldo, nombre, documento, correo, telefono);
        this.especialidad = especialidad;
        this.tarjetaProfesional = tarjetaProfesional;
    }
    public void generarConsultaMedica(ConsultaMedica consulta){
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getTarjetaProfesional() {
        return tarjetaProfesional;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setTarjetaProfesional(String tarjetaProfesional) {
        this.tarjetaProfesional = tarjetaProfesional;
    }
    
}
