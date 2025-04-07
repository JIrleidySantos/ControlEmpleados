/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.controldeempleados.RescursosHumanos;

/**
 *
 * @author mundo
 */
public class Administrador extends Empleado{
    private String numeroSocial;
    private int horasExtras;
    private static final double BONO = 0.40;
    private static final double PAGO_HORA_EXTRA = 30;

    public Administrador(int codigo, String nombres, String apellidos, String direccion, double sueldoBasico,
                         String numeroSocial, int horasExtras) {
       super(codigo, nombres, apellidos, direccion, sueldoBasico);
        this.numeroSocial = numeroSocial;
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        return sueldoBasico + (BONO * sueldoBasico) + (horasExtras * PAGO_HORA_EXTRA);
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Administrador: " + nombres + " " + apellidos + ", Código: " + codigo +
                ", N° Social: " + numeroSocial + ", Salario: $" + calcularSalario());
    }

}
