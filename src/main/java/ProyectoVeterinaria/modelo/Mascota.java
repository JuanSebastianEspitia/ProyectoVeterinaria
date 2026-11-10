/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoVeterinaria.modelo;

/**
 *
 * @author JUAN SEBASTIAN
 */
public class Mascota {
    
    public float tarifaBase = 10000f;
    
    private String nombre;
    private String edad;
    private String peso;
    private Dueño dueño;
    private HistorialClinico historialClinico;

    public Mascota(String nombre, String edad, String peso, Dueño dueño, HistorialClinico historialClinico) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.dueño = dueño;
        this.historialClinico = historialClinico;
    }
    
    public float calcularPago(ConsultaMedica consulta);

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public String getPeso() {
        return peso;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public HistorialClinico getHistorialClinico() {
        return historialClinico;
    }
    
    
}
