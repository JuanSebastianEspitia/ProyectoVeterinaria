/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoVeterinaria.modelo;

import java.util.ArrayList;

/**
 *
 * @author JUAN SEBASTIAN
 */
public class ConsultaMedica {
    private String diagnostico;
    private String tratamientoAplicado;
    private ArrayList<Vacuna> vacunasAplicadas;
    private String notasMedicas;
    private Veterinario veterinario;
    private boolean requirioSedacion;
    private float valorConsulta;

    public ConsultaMedica(String diagnostico, String tratamientoAplicado, ArrayList<Vacuna> vacunasAplicadas,
            String notasMedicas, Veterinario veterinario, boolean requirioSedacion, float valorConsulta) {
        this.diagnostico = diagnostico;
        this.tratamientoAplicado = tratamientoAplicado;
        this.vacunasAplicadas = vacunasAplicadas;
        this.notasMedicas = notasMedicas;
        this.veterinario = veterinario;
        this.requirioSedacion = requirioSedacion;
        this.valorConsulta = valorConsulta;
    }
    
    public void añadirVacuna(Vacuna vacunas){
        vacunasAplicadas.add(vacunas);
    }
}
