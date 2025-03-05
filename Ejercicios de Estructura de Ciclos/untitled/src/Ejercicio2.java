import javax.swing.*;

public class Ejercicio2 {

    public static void main(String [] args){

        double descuento = 0;

        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        JOptionPane.showMessageDialog(null, "Hola: " + nombre);

        int documento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cédula"));
        JOptionPane.showMessageDialog(null, "Hola: " + nombre + "\ncon cédula: " + documento);

        int salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario"));

        int estrato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su estrato"));

        if (estrato == 1 || estrato == 2) {
            descuento = salario * 0.02;
        } else if (estrato == 3 || estrato == 4) {
            descuento = salario * 0.04;
        } else if (estrato == 5) {
            descuento = salario * 0.08;
        } else if (estrato == 6) {
            descuento = salario * 0.10;
        } else {
            JOptionPane.showMessageDialog(null, "Estrato inválido. Debe ingresar un número entre 1 y 6.");
            return;
        }
        double salarioFinal = salario - descuento;

        String mensajeNomina= nombre+"\n"+"Con cedula...("+ documento+")" +"\nSu salario base es de: $" + salario;
        mensajeNomina+="\nEl descuento aplicado por estrato (" +estrato+")"+ "es: $" + descuento;
        mensajeNomina+= "\nSu salario final es de: $" + salarioFinal;

        JOptionPane.showMessageDialog(null, mensajeNomina);

    }
}
