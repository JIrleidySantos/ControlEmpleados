/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.controldeempleados.RescursosHumanos;

/**
 *
 * @author mundo
 */
public class Obrero extends Empleado{
     private String dependencia, telefono;
    private static final double BONO = 0.10;

    public Obrero(int codigo, String nombres, String apellidos, String direccion, double sueldoBasico,
                  String dependencia, String telefono) {
        super(codigo, nombres, apellidos, direccion, sueldoBasico);
        this.dependencia = dependencia;
        this.telefono = telefono;
    }

    @Override
    public double calcularSalario() {
        return sueldoBasico + (BONO * sueldoBasico);
    }
    
    @Override
    public void imprimirDatos() {
        System.out.println("Obrero: " + nombres + " " + apellidos + ", Código: " + codigo +
                ", Dependencia: " + dependencia + ", Teléfono: " + telefono + ", Salario: $" + calcularSalario());
    }
}
