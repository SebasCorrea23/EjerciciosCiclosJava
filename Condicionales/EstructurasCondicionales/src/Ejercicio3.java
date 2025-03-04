import javax.swing.*;

public class Ejercicio3 {

    /**
     * Algoritmo que calcule lo que gana un empleado con base a las horas
     * trabajadas teniendo en cuenta que cada hora se paga a 2000, adicionalmente
     * se le realiza unos descuentos con respecto a un impuesto de seguridad del
     * 10% sobre su salario.*/

    public static void main(String [] args){

        String nombre= JOptionPane.showInputDialog("Ingrese su nombre");
        JOptionPane.showMessageDialog(null,"Hola: "+nombre);

        int documento= Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cedula"));
        JOptionPane.showMessageDialog(null,"Hola: "+nombre+ "\ncon cedula: "+ documento);

        int horas=Integer.parseInt(JOptionPane.showInputDialog("ingrese las horas trabajadas"));

        double hora=2000;

        double salario= horas*hora;

        double impuesto= salario*0.10;

        double salarioFinal= salario-impuesto;

        JOptionPane.showMessageDialog(null,"Su salario sin prestaciones es de: "+salario);

        JOptionPane.showMessageDialog(null,"Sus prestaciones son de: "+impuesto);

        JOptionPane.showMessageDialog(null,nombre+ "\ncon cedula: "+ documento+"\nsu salario total es de: "+salarioFinal);

    }
}
