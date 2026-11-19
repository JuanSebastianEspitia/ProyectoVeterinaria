/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoVeterinaria.controlador;

import ProyectoVeterinaria.modelo.Recepcionista;
import ProyectoVeterinaria.modelo.Registro;
import ProyectoVeterinaria.vista.VistaConsultas;
import ProyectoVeterinaria.vista.VistaDueñoMascota;
import ProyectoVeterinaria.vista.VistaEmpleados;
import ProyectoVeterinaria.vista.VistaVacunas;
import javax.swing.JOptionPane;

/**
 *
 * @author JUAN SEBASTIAN
 */
public class ControladorVeterinaria {
    private VistaEmpleados vistaEmpleados;
    private VistaConsultas vistaConsultas;
    private VistaVacunas vistaVacunas;
    private VistaDueñoMascota vistaDueñoMascota;
    private Registro registro;

    public ControladorVeterinaria(VistaEmpleados vistaEmpleados, VistaConsultas vistaConsultas, VistaVacunas vistaVacunas, VistaDueñoMascota vistaDueñoMascota, Registro registro) {
        this.vistaEmpleados = vistaEmpleados;
        this.vistaConsultas = vistaConsultas;
        this.vistaVacunas = vistaVacunas;
        this.vistaDueñoMascota = vistaDueñoMascota;
        this.registro=registro;
    }
    
    public void iniciar(){
        
        this.vistaEmpleados.addAgregarActionListenerRegistrarRecepcionista(e->{
            try{
            if(this.vistaEmpleados.getTxtCorreoRecepcionista().isEmpty()||
               this.vistaEmpleados.getTxtNombreRecepcionista().isEmpty()||
               this.vistaEmpleados.getTxtTelefonoRecepcionista().isEmpty()||
               this.vistaEmpleados.getTxtDocumentoRecepcionista().isEmpty()||
               this.vistaEmpleados.getTxtSalario().isEmpty())
                throw new IllegalArgumentException("ERROR: debe de llenar todos los campos");
                
            String correoRecepcionista=this.vistaEmpleados.getTxtCorreoRecepcionista();
            String nombreRecepcionista=this.vistaEmpleados.getTxtNombreRecepcionista();
            String telefonoRecepcionista=this.vistaEmpleados.getTxtTelefonoRecepcionista();
            String documentoRecepcionista=this.vistaEmpleados.getTxtDocumentoRecepcionista();
            float sueldoRecepcionista=Float.parseFloat(this.vistaEmpleados.getTxtSalario()) ;
            
            
            Recepcionista recepcionista=new Recepcionista(sueldoRecepcionista,nombreRecepcionista,documentoRecepcionista,correoRecepcionista, telefonoRecepcionista);
            this.registro.añadirRecepcionista(recepcionista);
            JOptionPane.showMessageDialog(null, "RECEPCIONISTA "+recepcionista.getNombre().toUpperCase()+" FUE AGREGADO CORRECTAMENTE");
        } catch(NumberFormatException errorNumero){
            JOptionPane.showMessageDialog(null, "ERROR: el sueldo debe ser un número válido");
        }
          catch(IllegalArgumentException ex){
              JOptionPane.showMessageDialog(null, ex.getMessage());
          }
            
            
        });
        
        
        
        
        
    }
    
}
