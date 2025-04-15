/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.controldeempleados.RescursosHumanos;

/**
 *
 * @author mundo
 */
public class Inspector extends Empleado{
     private String especialidad;
    private int horasExtras;
    private static final double BONO = 0.30;
    private static final double PAGO_HORA_EXTRA = 20;

    public Inspector(int codigo, String nombres, String apellidos, String direccion, double sueldoBasico,
                     String especialidad, int horasExtras) {
        super(codigo, nombres, apellidos, direccion, sueldoBasico);
        this.especialidad = especialidad;
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        return sueldoBasico + (BONO * sueldoBasico) + (horasExtras * PAGO_HORA_EXTRA);
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Inspector: " + nombres + " " + apellidos + ", Código: " + codigo +
                ", Especialidad: " + especialidad + ", Salario: $" + calcularSalario());
    }
}
