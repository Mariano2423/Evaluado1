/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import javax.swing.JOptionPane;

/**
 * 
 * @author Aulas Heredia
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        resultadoImpuestos();
    }
   
    public static void resultadoImpuestos() {
        double cantidadEmpleados = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite la cantidad de empelados "));
        int resultado = 0;
        double totalImpuestos = 0;

        for (int i = 0; i < cantidadEmpleados; i++) {
            double salario;
            //* Mecanismo para pedir el salario de cada empleado
            salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario"));

            //* Mecanismo para agregar los impuestos al salario
            double montoSEM = salario * 0.0925;
            double montoIVM = salario * 0.0508;

            //* Mecasnimo para el total de los impuestos por empleado
            double impuestos = montoSEM + montoIVM;

            //* Mecasnimos para agregar los impuestos al total
            totalImpuestos = totalImpuestos + impuestos;
        }
        JOptionPane.showMessageDialog(null, "El monto total de impuestos a pagar es: " + totalImpuestos);
        
    }
}