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

/**
 *
 * @author JUAN SEBASTIAN
 */
public class ProyectoVeterinaria {

    public static void main(String[] args) {
       VistaEmpleados vistaEmpleados=new VistaEmpleados();
       VistaConsultas vistaConsultas=new VistaConsultas();
       VistaDueñoMascota vistaDueñoMascota= new VistaDueñoMascota();
       VistaVacunas vistaVacunas= new VistaVacunas();
       Registro registro=new Registro();
       ControladorVeterinaria controlador=new ControladorVeterinaria(vistaEmpleados, vistaConsultas, vistaVacunas, vistaDueñoMascota, registro);
       controlador.iniciar();
       vistaEmpleados.setVisible(true);
       
    }
}
