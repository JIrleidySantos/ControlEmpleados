/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.controldeempleados.RescursosHumanos;

/**
 *
 * @author mundo
 */
public class Trabajador extends Empleado {
    private String area;
    private int horasExtras;
    private static final double BONO = 0.2;
    private static final double PAGO_HORA_EXTRA = 10;

    public Trabajador(int codigo, String nombres, String apellidos, String direccion, double sueldoBasico, String area, int horasExtras) {
        super(codigo, nombres, apellidos, direccion, sueldoBasico);
        this.area = area;
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        return sueldoBasico + (sueldoBasico * BONO) + (horasExtras * PAGO_HORA_EXTRA);
    }
}
