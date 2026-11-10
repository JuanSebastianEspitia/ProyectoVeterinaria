/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoVeterinaria.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JUAN SEBASTIAN
 */
public class Dueño extends Persona {
    private List<Mascota> mascotas = new ArrayList<>();

    public Dueño(String nombre, String documento, String correo, String telefono) {
        super(nombre, documento, correo, telefono);
    }
    
    public void agregarMascota(Mascota mascota){
        mascotas.add(mascota);
    }
    
}
