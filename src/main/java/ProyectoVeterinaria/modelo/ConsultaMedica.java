/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoVeterinaria.modelo;

import java.util.ArrayList;
import java.time.LocalDate;

/**
 *
 * @author JUAN SEBASTIAN
 */
public class ConsultaMedica {
    
    private LocalDate fecha;
    private String diagnostico;
    private String tratamientoAplicado;
    private ArrayList<Vacuna> vacunasAplicadas;
    private String notasMedicas;
    private Veterinario veterinario;

    public ConsultaMedica(LocalDate fecha,String diagnostico, String tratamientoAplicado, ArrayList<Vacuna> vacunasAplicadas, String notasMedicas, Veterinario veterinario) {
        this.fecha = fecha;
        this.diagnostico = diagnostico;
        this.tratamientoAplicado = tratamientoAplicado;
        this.vacunasAplicadas = vacunasAplicadas;
        this.notasMedicas = notasMedicas;
        this.veterinario = veterinario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getTratamientoAplicado() {
        return tratamientoAplicado;
    }

    public ArrayList<Vacuna> getVacunasAplicadas() {
        return vacunasAplicadas;
    }

    public String getNotasMedicas() {
        return notasMedicas;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }
    public void añadirVacuna(Vacuna vacunas){
        vacunasAplicadas.add(vacunas);
    }
    public float calcularValorBiologico() {
    float total = 0;
    for (Vacuna v : vacunasAplicadas) {
        total += v.getValorVacuna();
    }
    return total;
}
}
