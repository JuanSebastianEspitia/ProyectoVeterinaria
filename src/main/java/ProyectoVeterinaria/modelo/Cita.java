/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoVeterinaria.modelo;

import java.time.LocalDate;

/**
 *
 * @author JUAN SEBASTIAN
 */
public class Cita {
    private LocalDate fecha;
    private String hora;
    private Veterinario veterinario;
    private Mascota mascota;
    private Dueño dueño;

    public Cita(LocalDate fecha, String hora, Veterinario veterinario, Mascota mascota, Dueño dueño) {
        this.fecha = fecha;
        this.hora = hora;
        this.veterinario = veterinario;
        this.mascota = mascota;
        this.dueño = dueño;
    }
    
}
