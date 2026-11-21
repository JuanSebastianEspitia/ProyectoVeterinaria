/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoVeterinaria.controlador;

import ProyectoVeterinaria.modelo.Recepcionista;
import ProyectoVeterinaria.modelo.Registro;
import ProyectoVeterinaria.modelo.Veterinario;
import ProyectoVeterinaria.vista.VistaConsultas;
import ProyectoVeterinaria.vista.VistaDueñoMascota;
import ProyectoVeterinaria.vista.VistaEmpleados;
import ProyectoVeterinaria.vista.VistaVacunas;
import ProyectoVeterinaria.vista.VistaVeterinaria;
import javax.swing.JOptionPane;

/**
 *
 * @author JUAN SEBASTIAN
 */
public class ControladorVeterinaria {
    private VistaVeterinaria vistaVeterinaria;
    
    private Registro registro;

    public ControladorVeterinaria(VistaVeterinaria vistaVeterinaria, Registro registro) {
        this.vistaVeterinaria=vistaVeterinaria;
        
        this.registro=registro;
    }
    
    public void iniciar(){
        
        this.vistaVeterinaria.addAgregarActionListenerRegistrarRecepcionista(e->{
            try{
            if(this.vistaVeterinaria.getTxtCorreoRecepcionista().isEmpty()||
               this.vistaVeterinaria.getTxtNombreRecepcionista().isEmpty()||
               this.vistaVeterinaria.getTxtTelefonoRecepcionista().isEmpty()||
               this.vistaVeterinaria.getTxtDocumentoRecepcionista().isEmpty()||
               this.vistaVeterinaria.getTxtSalario().isEmpty())
                throw new IllegalArgumentException("ERROR: debe de llenar todos los campos");
                
            String correoRecepcionista=this.vistaVeterinaria.getTxtCorreoRecepcionista();
            String nombreRecepcionista=this.vistaVeterinaria.getTxtNombreRecepcionista();
            String telefonoRecepcionista=this.vistaVeterinaria.getTxtTelefonoRecepcionista();
            String documentoRecepcionista=this.vistaVeterinaria.getTxtDocumentoRecepcionista();
            float sueldoRecepcionista=Float.parseFloat(this.vistaVeterinaria.getTxtSalario()) ;
            
            
            Recepcionista recepcionista=new Recepcionista(sueldoRecepcionista,nombreRecepcionista,documentoRecepcionista,correoRecepcionista, telefonoRecepcionista);
            this.registro.añadirRecepcionista(recepcionista);
            this.vistaVeterinaria.getCbmRecepcionista().removeAllItems();
            for(Recepcionista re: registro.getRecepcionistas()){
                this.vistaVeterinaria.getCbmRecepcionista().addItem(re.getNombre()+"-"+re.getCorreo()+"-"+re.getTelefono());
            }
            this.vistaVeterinaria.setTxtCorreoRecepcionista("");
            this.vistaVeterinaria.setTxtDocumentoRecepcionista("");
            this.vistaVeterinaria.setTxtNombreRecepcionista("");
            this.vistaVeterinaria.setTxtSueldoRecepcionista("");
            this.vistaVeterinaria.setTxtTelefonoRecepcionista("");
            JOptionPane.showMessageDialog(null, "RECEPCIONISTA "+recepcionista.getNombre().toUpperCase()+" FUE AGREGADO CORRECTAMENTE");
        } catch(NumberFormatException errorNumero){
            JOptionPane.showMessageDialog(null, "ERROR: el sueldo debe ser un número válido");
        }
          catch(IllegalArgumentException ex){
              JOptionPane.showMessageDialog(null, ex.getMessage());
          }
        });
        
        
        this.vistaVeterinaria.addAgregarActionListenerRegistrarVeterinario(e->{
            try{
            if(this.vistaVeterinaria.getTxtCorreoVeterinario().isEmpty()||
               this.vistaVeterinaria.getTxtNombreVeterinario().isEmpty()||
               this.vistaVeterinaria.getTxtTelefonoVeterinario().isEmpty()||
               this.vistaVeterinaria.getTxtDocumentoVeterinario().isEmpty()||
               this.vistaVeterinaria.getTxtSalarioVeterinario().isEmpty()||
               this.vistaVeterinaria.getTxtTarjetaProfesionalVeterinario().isEmpty()||
               this.vistaVeterinaria.getTxtEspecialidadVeterinario().isEmpty())
                throw new IllegalArgumentException("ERROR: debe de llenar todos los campos");
                
            String correoVeterinario=this.vistaVeterinaria.getTxtCorreoVeterinario();
            String nombreVeterinario=this.vistaVeterinaria.getTxtNombreVeterinario();
            String telefonoVeterinario=this.vistaVeterinaria.getTxtTelefonoVeterinario();
            String documentoVeterinario=this.vistaVeterinaria.getTxtDocumentoVeterinario();
            float sueldoVeterinario=Float.parseFloat(this.vistaVeterinaria.getTxtSalarioVeterinario()) ;
            String tarjetaProfesional=this.vistaVeterinaria.getTxtTarjetaProfesionalVeterinario();
            String especialidadVeterinario=this.vistaVeterinaria.getTxtEspecialidadVeterinario();
            
            
            
            Veterinario veterinario=new Veterinario(especialidadVeterinario,tarjetaProfesional,nombreVeterinario,documentoVeterinario,correoVeterinario,telefonoVeterinario,sueldoVeterinario);
            this.registro.añadirVeterinario(veterinario);
            this.vistaVeterinaria.setTxtCorreoVeterinario("");
            this.vistaVeterinaria.setTxtDocumentoVeterinario("");
            this.vistaVeterinaria.setTxtNombreVeterinario("");
            this.vistaVeterinaria.setTxtSalarioVeterinario("");
            this.vistaVeterinaria.setTxtTelefonoVeterinario("");
            JOptionPane.showMessageDialog(null, "VETERINARIO "+veterinario.getNombre().toUpperCase()+" DE TARJETA"+veterinario.getTarjetaProfesional()+"\n Y ESPECIALIDAD "
                    +veterinario.getEspecialidad() +" FUE AGREGADO CORRECTAMENTE");
        } catch(NumberFormatException errorNumero){
            JOptionPane.showMessageDialog(null, "ERROR: el sueldo debe ser un número válido");
        }
          catch(IllegalArgumentException ex){
              JOptionPane.showMessageDialog(null, ex.getMessage());
          }
            
            
        });
        
        
        
        
        
       
        
        
        
        
        
    }
    
}
