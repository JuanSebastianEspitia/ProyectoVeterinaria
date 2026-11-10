/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoVeterinaria.modelo;

/**
 *
 * @author JUAN SEBASTIAN
 */
public class Vacuna {
    private double valorVacuna;
    private String nombreVacuna;

    public Vacuna(double valorVacuna, String nombreVacuna) {
        this.valorVacuna = valorVacuna;
        this.nombreVacuna = nombreVacuna;
    }

    public double getValorVacuna() {
        return valorVacuna;
    }

    public String getNombreVacuna() {
        return nombreVacuna;
}
}
