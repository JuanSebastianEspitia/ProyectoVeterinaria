/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoVeterinaria.modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

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
    public ConsultaMedica generarConsultaMedica(LocalDateTime fecha,String diagnostico, String tratamientoAplicado, ArrayList<Vacuna> vacunasAplicadas, String notasMedicas, Veterinario veterinario, Cita cita, boolean sedacion) {
    ConsultaMedica consulta=new ConsultaMedica(fecha, diagnostico, tratamientoAplicado, vacunasAplicadas, notasMedicas, veterinario,cita, sedacion);
    return consulta;
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
