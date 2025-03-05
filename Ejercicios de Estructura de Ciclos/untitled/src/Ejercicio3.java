import javax.swing.*;

public class Ejercicio3 {

    public static void main(String [] args){

        double descuento = 0, bonificacion=0;


        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        JOptionPane.showMessageDialog(null, "Hola: " + nombre);

        int documento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cédula"));
        JOptionPane.showMessageDialog(null, "Hola: " + nombre + "\ncon cédula: " + documento);

        int salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario"));

        int categoria = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su categoria"));

        if (categoria == 1) {
            descuento = salario * 0.02;
            bonificacion=salario*0.15;
        } else if (categoria == 2) {
            descuento = salario * 0.015;
            bonificacion=salario*0.10;
        } else if (categoria == 3) {
            descuento = salario * 0.01;
            bonificacion=salario*0.08;
        } else if (categoria == 4) {
            descuento = salario * 0.0;
            bonificacion=salario*0.0;
        } else {
            JOptionPane.showMessageDialog(null, "Estrato inválido. Debe ingresar un número entre 1 y 6.");
            return;
        }
        double salarioDescuento = salario - descuento;
        double salarioBonificacion =salario+ bonificacion;
        double salarioFinal=salario+bonificacion-descuento;

        String mensajeNomina= nombre+"\n"+"Con cedula...("+ documento+")" +"\nSu salario base es de: $" + salario;
        mensajeNomina+="\nEl descuento aplicado por categoria(" +categoria+")"+ "es: $" + descuento;
        mensajeNomina+="\nLa bonificacion aplicada por categoria(" +categoria+")"+ "es: $" + bonificacion;
        mensajeNomina+= "\nSu salario final es de: $" + salarioFinal;

        JOptionPane.showMessageDialog(null, mensajeNomina);
    }
}
