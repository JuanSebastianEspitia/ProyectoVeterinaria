/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoVeterinaria.modelo;

/**
 *
 * @author JUAN SEBASTIAN
 */
public class Recepcionista extends Trabajador {
    
    private static final float descuentoDueño = 0.10f;
    
    public Recepcionista(float sueldo, String nombre, String documento, String correo, String telefono) {
        super(sueldo, nombre, documento, correo, telefono);
    }
    public ComprobantePago generarComprobantePago(String idComprobante, Cita cita, ConsultaMedica consulta){
        float subtotal=cita.getMascota().calcularPago(consulta);
        float recargos = subtotal - Mascota.tarifaBase;
        float descuento = cita.getDueño().tieneDescuento() ? subtotal *descuentoDueño: 0f;
        float total =  subtotal-descuento;
        
        return new ComprobantePago(idComprobante, cita, Mascota.tarifaBase,recargos, descuento, total);

    }
    
}
