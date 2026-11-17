/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoVeterinaria.modelo;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Registro {
    private ArrayList<Recepcionista> recepcionista;
    private ArrayList<Dueño> dueños;
    private ArrayList<Veterinario> veterinarios;

    public Registro() {
    }

    public ArrayList<Recepcionista> getRecepcionista() {
        return recepcionista;
    }

    public ArrayList<Dueño> getDueños() {
        return dueños;
    }

    public ArrayList<Veterinario> getVeterinarios() {
        return veterinarios;
    }
    
    
    public void añadirVeterinario(Veterinario veterinario){
        this.veterinarios.add(veterinario);
    }
    
    public void añadirDueño(Dueño dueño){
        this.dueños.add(dueño);
    }
    
    public void añadirRecepcionista(Recepcionista recepcionista){
        this.recepcionista.add(recepcionista);
    }
}
