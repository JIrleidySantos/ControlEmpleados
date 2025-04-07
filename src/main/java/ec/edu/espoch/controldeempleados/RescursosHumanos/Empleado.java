/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.controldeempleados.RescursosHumanos;

/**
 *
 * @author mundo
 */
abstract class Empleado {

    protected int codigo;
    protected String nombres;
    protected String apellidos;
    protected String direccion;
    protected double sueldoBasico;

    public Empleado(int codigo, String nombres, String apellidos, String direccion, double sueldoBasico) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.sueldoBasico = sueldoBasico;
    }

    public abstract double calcularSalario();

    public int getCodigo() {
        return codigo;
    }//

    public void imprimirDatos() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombres + " " + apellidos);
        System.out.println("Dirección: " + direccion);
        System.out.println("Salario: " + calcularSalario());
    }
}
