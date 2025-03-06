import javax.swing.*;

public class Ejercicio4 {

    public static void main(String[] args){
        int caraDado =0;

        while (caraDado<=0){
            caraDado=Integer.parseInt(JOptionPane.showInputDialog("Ingrese una cara del dado"));
        }

        switch (caraDado){
            case 1:
                JOptionPane.showMessageDialog(null,"Sacaste el valor mas bajo");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Sacaste el segundo valor mas bajo");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Sacaste el valor bajo del medio");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"Sacaste el valor mas alto del medio");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"Sacaste el segundo valor mas alto");
                break;
            case 6:
                JOptionPane.showMessageDialog(null,"Sacaste el valor mas alto");
                break;
            default:
                JOptionPane.showMessageDialog(null,"No es un cara del dado");
                break;
        }

    }
}
