/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoVeterinaria.modelo;

/**
 *
 * @author JUAN SEBASTIAN
 */
public class ComprobantePago {
    
    private String idComprobante;
    private Cita cita;
    private float subtotalBase;
    private float recargos;
    private float descuentos;
    private float total;

    public ComprobantePago(String idComprobante, Cita cita, float subtotalBase, float recargos, float descuentos, float total) {
        this.idComprobante = idComprobante;
        this.cita = cita;
        this.subtotalBase = subtotalBase;
        this.recargos = recargos;
        this.descuentos = descuentos;
        this.total = total;
    }

    public String getIdComprobante() {
        return idComprobante;
    }

    public Cita getCita() {
        return cita;
    }

    public float getSubtotalBase() {
        return subtotalBase;
    }

    public float getRecargos() {
        return recargos;
    }

    public float getDescuentos() {
        return descuentos;
    }

    public float getTotal() {
        return total;
    }
}
