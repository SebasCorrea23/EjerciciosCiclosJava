import javax.swing.*;

public class Main {
    /**
     * Algoritmo que solicite e indique cual mes del año es*/

    public static void main(String[] args) {
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese que mes desea conocer"));

        if (mes == 1) {
            System.out.println("El mes es enero");
        } else {
            if (mes == 2) {
                System.out.println("El mes es febrero");
            } else {
                if (mes == 3) {
                    System.out.println("El mes es marzo");
                } else {
                    if (mes == 4) {
                        System.out.println("El mes es abril");
                    } else {
                        if (mes == 5) {
                            System.out.println("El mes es mayo");
                        } else {
                            if (mes == 6) {
                                System.out.println("El mes es junio");
                            } else {
                                if (mes == 7) {
                                    System.out.println("El mes es julio");
                                }else{
                                    if (mes == 8) {
                                        System.out.println("El mes es agosto");
                                    } else {
                                        if (mes == 9) {
                                            System.out.println("El mes es septiembre");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    }}}