import javax.swing.*;

public class Ejercicio2 {

    public static void main(String [] args){
        int base=0, altura=0;

        do {
            base =Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de la base"));
        } while (base<=0);
        JOptionPane.showMessageDialog(null, "La base de tu tirangulo rectangulo es....("+ base+")");

        do {
            altura =Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de la altura"));
        } while (altura<=0);
        JOptionPane.showMessageDialog(null, "La altura de tu tirangulo rectangulo es....("+ altura+")");

        double area= (base*altura)/2;

        String mensaje="";



        mensaje+="Tu triangulo de base...("+base+")";
        mensaje+="\nY de altura...("+altura+")";
        mensaje+="\nUsando la formula del area de un triangulo rectangulo...(Area=(base*altura)/2)";
        mensaje+="\nTiene como resultado un area de...("+area+")";

        if (area>=200){
            mensaje+="\nTu triangulo tiene una Gran Area";
        }

        JOptionPane.showMessageDialog(null, mensaje);

    }
}
