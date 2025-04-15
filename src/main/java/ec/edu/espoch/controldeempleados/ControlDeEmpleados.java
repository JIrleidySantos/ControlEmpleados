/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.controldeempleados;

import ec.edu.espoch.controldeempleados.RescursosHumanos.Administrador;
import ec.edu.espoch.controldeempleados.RescursosHumanos.Empleado;
import ec.edu.espoch.controldeempleados.RescursosHumanos.Inspector;
import ec.edu.espoch.controldeempleados.RescursosHumanos.Obrero;
import ec.edu.espoch.controldeempleados.RescursosHumanos.Trabajador;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mundo
 */
public class ControlDeEmpleados {
private static List<Empleado> empleados = new ArrayList<>();
    public static void main(String[] args) {
            

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1. Ingresar Empleado");
            System.out.println("2. Buscar Empleado por Código");
            System.out.println("3. Total a pagar por salarios");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt(); sc.nextLine();

            switch (opcion) {
                case 1 -> ingresarEmpleado(sc);
                case 2 -> buscarEmpleado(sc);
                case 3 -> calcularTotalSalarios();
                case 4 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 4);

        sc.close();
    }

    private static void ingresarEmpleado(Scanner sc) {
        System.out.println("Tipo de Empleado (1-Trabajador, 2-Inspector, 3-Obrero, 4-Administrador): ");
        int tipo = sc.nextInt(); sc.nextLine();

        System.out.print("Código: ");
        String codigo = sc.nextLine();
        System.out.print("Nombres: ");
        String nombres = sc.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = sc.nextLine();
        System.out.print("Dirección: ");
        String direccion = sc.nextLine();
        System.out.print("Sueldo Básico: ");
        double sueldoBasico = sc.nextDouble(); sc.nextLine();

        switch (tipo) {
            case 1 -> {
                System.out.print("Área: ");
                String area = sc.nextLine();
                System.out.print("Horas Extras: ");
                int horas = sc.nextInt(); sc.nextLine();
                empleados.add(new Trabajador(codigo, nombres, apellidos, direccion, sueldoBasico, area, horas));
            }
            case 2 -> {
                System.out.print("Especialidad: ");
                String especialidad = sc.nextLine();
                System.out.print("Horas Extras: ");
                int horas = sc.nextInt(); sc.nextLine();
                empleados.add(new Inspector(codigo, nombres, apellidos, direccion, sueldoBasico, especialidad, horas));
            }
            case 3 -> {
                System.out.print("Dependencia: ");
                String dependencia = sc.nextLine();
                System.out.print("Teléfono: ");
                String telefono = sc.nextLine();
                empleados.add(new Obrero(codigo, nombres, apellidos, direccion, sueldoBasico, dependencia, telefono));
            }
            case 4 -> {
                System.out.print("Número Social: ");
                String numSocial = sc.nextLine();
                System.out.print("Horas Extras: ");
                int horas = sc.nextInt(); sc.nextLine();
                empleados.add(new Administrador(codigo, nombres, apellidos, direccion, sueldoBasico, numSocial, horas));
            }
            default -> System.out.println("Tipo inválido.");
        }
    }

    private static void buscarEmpleado(Scanner sc) {
        System.out.print("Ingrese el código del empleado: ");
        String codigo = sc.nextLine();
        for (Empleado e : empleados) {
            if (e.getCodigo().equalsIgnoreCase(codigo)) {
                e.imprimirDatos();
                return;
            }
        }
        System.out.println("Empleado no encontrado.");
    }

    private static void calcularTotalSalarios() {
        double total = 0;
        for (Empleado e : empleados) {
            total += e.calcularSalario();
        }
        System.out.println("Total a pagar por salarios: $" + total);
    }
}
    

