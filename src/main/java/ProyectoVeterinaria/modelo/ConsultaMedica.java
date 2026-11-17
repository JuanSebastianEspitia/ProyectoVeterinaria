/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoVeterinaria.modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author JUAN SEBASTIAN
 */
public class ConsultaMedica {
    
    private Date fecha;
    private String diagnostico;
    private String tratamientoAplicado;
    private ArrayList<Vacuna> vacunasAplicadas;
    private String notasMedicas;
    private Veterinario veterinario;
    private boolean requirioSedacion;
    private float valorConsulta;

    public ConsultaMedica(Date fecha,String diagnostico, String tratamientoAplicado, ArrayList<Vacuna> vacunasAplicadas,
            String notasMedicas, Veterinario veterinario, boolean requirioSedacion, float valorConsulta) {
        this.fecha = fecha;
        this.diagnostico = diagnostico;
        this.tratamientoAplicado = tratamientoAplicado;
        this.vacunasAplicadas = vacunasAplicadas;
        this.notasMedicas = notasMedicas;
        this.veterinario = veterinario;
        this.requirioSedacion = requirioSedacion;
        this.valorConsulta = valorConsulta;
    }

    public Date getFecha() {
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

    public boolean isRequirioSedacion() {
        return requirioSedacion;
    }

    public float getValorConsulta() {
        return valorConsulta;
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
