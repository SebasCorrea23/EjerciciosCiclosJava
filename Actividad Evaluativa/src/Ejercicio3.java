import javax.swing.*;

public class Ejercicio3 {

    public static void main(String [] args){
        int cantNumeros=0, pare=0;

        do {
            cantNumeros=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero entero que desea leer"));

            if (cantNumeros<-2){
                JOptionPane.showMessageDialog(null,"el primer numero es menor a (-2)");
            } else if (cantNumeros>=-2 && cantNumeros<2){
                JOptionPane.showMessageDialog(null, "el primer numero es mayor o igual a (-2) pero menor que (2)");
            } else if (cantNumeros>=2 && cantNumeros<5) {
                JOptionPane.showMessageDialog(null, "el primer numero es mayor o igual a (2) pero menor que (5)");
            } else if (cantNumeros>5) {
                JOptionPane.showMessageDialog(null, "el primer numero es mayor o igual a (5)");
            }

            pare=Integer.parseInt(JOptionPane.showInputDialog("desea continuar?\n 1.si\n 2.no"));

        }while(pare==1) ;

//        int numero1=0, numero2=0, numero3=0, numero4=0, numero5=0;

//        do {
//            cantNumeros=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero enteros que desea leer"));
//        }while (cantNumeros<=0);
//
//        switch (cantNumeros){
//            case 1:
//                numero1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero a determinar"));
//                break;
//
//            case 2:
//                numero1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero a determinar"));
//                numero2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero a determinar"));
//                break;
//
//            case 3:
//                numero1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero a determinar"));
//                numero2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero a determinar"));
//                numero3=Integer.parseInt(JOptionPane.showInputDialog("ingrese el tercer numero a determinar"));
//                break;
//
//            case 4:
//                numero1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero a determinar"));
//                numero2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero a determinar"));
//                numero3=Integer.parseInt(JOptionPane.showInputDialog("ingrese el tercer numero a determinar"));
//                numero4=Integer.parseInt(JOptionPane.showInputDialog("ingrese el cuarto numero a determinar"));
//                break;
//
//            case 5:
//                numero1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero a determinar"));
//                numero2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero a determinar"));
//                numero3=Integer.parseInt(JOptionPane.showInputDialog("ingrese el tercer numero a determinar"));
//                numero4=Integer.parseInt(JOptionPane.showInputDialog("ingrese el cuarto numero a determinar"));
//                numero5=Integer.parseInt(JOptionPane.showInputDialog("ingrese el quinto numero a determinar"));
//                break;
//
//            default:
//                JOptionPane.showMessageDialog(null,"tu numero excede la cantidad posible");
//                break;
//        }
//
//
//
//        if (numero1<-2){
//            JOptionPane.showMessageDialog(null,"el primer numero es menor a (-2)");
//        } else if (numero1>=-2 && numero1<2){
//            JOptionPane.showMessageDialog(null, "el primer numero es mayor o igual a (-2) pero menor que (2)");
//        } else if (numero1>=2 && numero1<5) {
//            JOptionPane.showMessageDialog(null, "el primer numero es mayor o igual a (2) pero menor que (5)");
//        } else if (numero1>5) {
//            JOptionPane.showMessageDialog(null, "el primer numero es mayor o igual a (5)");
//        }
//
//        if (numero2<-2){
//            JOptionPane.showMessageDialog(null,"el segundo numero es menor a (-2)");
//        } else if (numero2>=-2 && numero2<2){
//            JOptionPane.showMessageDialog(null, "el segundo numero es mayor o igual a (-2) pero menor que (2)");
//        } else if (numero2>=2 && numero2<5) {
//            JOptionPane.showMessageDialog(null, "el segundo numero es mayor o igual a (2) pero menor que (5)");
//        } else if (numero2>5) {
//            JOptionPane.showMessageDialog(null, "el segundo numero es mayor o igual a (5)");
//        }
//
//        if (numero3<-2){
//            JOptionPane.showMessageDialog(null,"el tercero numero es menor a (-2)");
//        } else if (numero3>=-2 && numero3<2){
//            JOptionPane.showMessageDialog(null, "el tercero numero es mayor o igual a (-2) pero menor que (2)");
//        } else if (numero3>=2 && numero3<5) {
//            JOptionPane.showMessageDialog(null, "el tercero numero es mayor o igual a (2) pero menor que (5)");
//        } else if (numero3>5) {
//            JOptionPane.showMessageDialog(null, "el tercero numero es mayor o igual a (5)");
//        }
//
//        if (numero4<-2){
//            JOptionPane.showMessageDialog(null,"el cuarto numero es menor a (-2)");
//        } else if (numero4>=-2 && numero4<2){
//            JOptionPane.showMessageDialog(null, "el cuarto numero es mayor o igual a (-2) pero menor que (2)");
//        } else if (numero4>=2 && numero4<5) {
//            JOptionPane.showMessageDialog(null, "el cuarto numero es mayor o igual a (2) pero menor que (5)");
//        } else if (numero4>5) {
//            JOptionPane.showMessageDialog(null, "el cuarto numero es mayor o igual a (5)");
//        }
//
//        if (numero5<-2){
//            JOptionPane.showMessageDialog(null,"el quinto numero es menor a (-2)");
//        } else if (numero5>=-2 && numero5<2){
//            JOptionPane.showMessageDialog(null, "el quinto numero es mayor o igual a (-2) pero menor que (2)");
//        } else if (numero5>=2 && numero5<5) {
//            JOptionPane.showMessageDialog(null, "el quinto numero es mayor o igual a (2) pero menor que (5)");
//        } else if (numero5>5) {
//            JOptionPane.showMessageDialog(null, "el quinto numero es mayor o igual a (5)");
//        }




    }
}
