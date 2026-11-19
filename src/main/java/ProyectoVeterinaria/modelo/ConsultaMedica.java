/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoVeterinaria.modelo;

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author JUAN SEBASTIAN
 */
public class ConsultaMedica {
    
    private int costoSedacion = 4000;
    private boolean requiereSedacion;
    private LocalDateTime fecha;
    private String diagnostico;
    private String tratamientoAplicado;
    private ArrayList<Vacuna> vacunasAplicadas;
    private String notasMedicas;
    private Veterinario veterinario;
    private Cita cita;

    public ConsultaMedica(LocalDateTime fecha,String diagnostico, String tratamientoAplicado, ArrayList<Vacuna> vacunasAplicadas, String notasMedicas, Veterinario veterinario, Cita cita, boolean sedacion) {
        this.fecha = fecha;
        this.diagnostico = diagnostico;
        this.tratamientoAplicado = tratamientoAplicado;
        this.vacunasAplicadas = vacunasAplicadas;
        this.notasMedicas = notasMedicas;
        this.veterinario = veterinario;
        this.cita=cita;
        this.requiereSedacion=sedacion;
    }

    public LocalDateTime getFecha() {
        return this.fecha;
    }

    public String getDiagnostico() {
        return this.diagnostico;
    }

    public String getTratamientoAplicado() {
        return this.tratamientoAplicado;
    }

    public ArrayList<Vacuna> getVacunasAplicadas() {
        return this.vacunasAplicadas;
    }

    public String getNotasMedicas() {
        return this.notasMedicas;
    }

    public Veterinario getVeterinario() {
        return this.veterinario;
    }

    public Cita getCita() {
        return cita;
    }

    public int getCostoSedacion() {
        return costoSedacion;
    }
    
    public String obtenerCostoSedacion(){
        return String.valueOf(costoSedacion);
    }
    
    
    
    
    
    public void añadirVacuna(Vacuna vacunas){
        this.vacunasAplicadas.add(vacunas);
    }
    
    
    public float calcularValorBiologico() {
    float total = 0;
    for (Vacuna v : this.vacunasAplicadas) {
        total += v.getValorVacuna();
    }
    return total;
}
    
    
    public float obtenerTotalSinDescuentos(){
        float total=0;
        total=this.cita.getMascota().calcularPago();
        if(requiereSedacion)
            total+=this.getCostoSedacion();
        return total;
    }
    
    public float obtenerRecargoExotica(){
        float valor =0;
        if(this.getCita().getMascota() instanceof MascotaExotica){
            MascotaExotica exotica=(MascotaExotica) this.getCita().getMascota();
            valor=exotica.obtenerRecargoExotica();
                    }
        return valor;
    }
    
    public float obtenerDescuento(float totalSinDescuentos){
        float totalConDescuentos=0;
        if(this.cita.getDueño().tieneDescuento()){
        totalConDescuentos=totalSinDescuentos*0.1f;
        }
        return totalConDescuentos;
    }
    
    public float totalTotal(){
        return this.obtenerTotalSinDescuentos()-this.obtenerDescuento(this.obtenerTotalSinDescuentos());
    }
    
    public String obtenerTotalTotal(){
        return String.valueOf(this.totalTotal());
    }
    
    
    
    
    public String obtenerVacunas(){
        String mensaje="";
        for (Vacuna v : this.vacunasAplicadas) {
           mensaje+="\n"+v.getNombreVacuna()+" $"+v.getValorVacuna();
        }
        return mensaje;
    }
    
    
}
