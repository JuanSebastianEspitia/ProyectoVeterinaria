/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectoveterinaria;

import ProyectoVeterinaria.controlador.ControladorVeterinaria;
import ProyectoVeterinaria.modelo.Registro;
import ProyectoVeterinaria.vista.VistaConsultas;
import ProyectoVeterinaria.vista.VistaDueñoMascota;
import ProyectoVeterinaria.vista.VistaEmpleados;
import ProyectoVeterinaria.vista.VistaVacunas;
import ProyectoVeterinaria.vista.VistaVeterinaria;

/**
 *
 * @author JUAN SEBASTIAN
 */
public class ProyectoVeterinaria {

    public static void main(String[] args) {
       VistaVeterinaria vistaVeterinaria=new VistaVeterinaria();
       
       Registro registro=new Registro();
       ControladorVeterinaria controlador=new ControladorVeterinaria(vistaVeterinaria,registro);
       controlador.iniciar();
       vistaVeterinaria.setVisible(true);
       
    }
}
