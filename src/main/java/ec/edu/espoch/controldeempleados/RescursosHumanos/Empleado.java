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

}
