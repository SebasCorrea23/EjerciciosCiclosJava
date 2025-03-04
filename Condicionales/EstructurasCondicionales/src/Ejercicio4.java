import javax.swing.*;

public class Ejercicio4 {

    /**Calcular el nuevo salario de un obrero si obtuvo un incremento del 25%
     sobre su salario anterior.*/

    public static void main(String [] args){
        String nombre= JOptionPane.showInputDialog("Ingrese su nombre");
        JOptionPane.showMessageDialog(null,"Hola: "+nombre);

        int documento= Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cedula"));
        JOptionPane.showMessageDialog(null,"Hola: "+nombre+ "\ncon cedula: "+ documento);

        int horas=Integer.parseInt(JOptionPane.showInputDialog("ingrese las horas trabajadas"));

        boolean recibeAumento =Boolean.parseBoolean(JOptionPane.showInputDialog("¿Recibe aumento?"));

        double hora=2000;

        double salario= horas*hora;

        double aumento= salario*0.25;

        double aumentoSalario = salario + aumento;

        double impuesto= salario*0.10;

        double salarioFinal= salario-impuesto;



        JOptionPane.showMessageDialog(null,"Su salario sin prestaciones es de: "+salario);

        JOptionPane.showMessageDialog(null,"Sus prestaciones son de: "+impuesto);

        JOptionPane.showMessageDialog(null, nombre + "\ncon cedula: " + documento + "\nsu salario total es de: " + salarioFinal);


    }
}
