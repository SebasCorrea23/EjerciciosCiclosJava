package ciclos;

import javax.swing.*;

/**
     * ciclo debe ser finito, garantizar que finalice en algun momento
     * condicion de parada, un ciclo se repite cuandi la condicion da verdad,
     *finaliza cuando hay falsedad */

public class EjercicioCiclos {

    public static void main(String [] args){
        int ingreso = 0;

        do {
            ingreso=JOptionPane.showConfirmDialog(null,"Hola\n ¿Deseas ingresar al menu?","confirmar", JOptionPane.YES_NO_OPTION);
        }while (ingreso==JOptionPane.NO_OPTION);
            JOptionPane.showMessageDialog(null,"Ingresaste al menú.");

        int codMenuPpal=0, codMenuTipico=0, codMenuCarta=0, codMenuInter=0;
        String Usuario=JOptionPane.showInputDialog("Ingrese el nombre del comensal");
        double factura=0;
        int platos=0;

        String facturaCompra="Factura de compra\n \n";
        facturaCompra+= "Cantidad de platos pedidos: "+platos+"\n";
        facturaCompra+= "Valor Factura: "+ factura;

        do{
            String menu="MENU RESTAURANTE\n\n";
            menu+="1. Plato Tipico\n";
            menu+="2. Plato a la carta\n";
            menu+="3. Plato internacional\n";
            menu+="4. Salir\n\n";
            menu+="Por favor seleccione una opcion\n";
            codMenuPpal=Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (codMenuPpal){
                case 1:
                    do{
                        String menuTipico="MENU TIPICO\n\n";
                        menuTipico+="1.Frijoles\n";
                        menuTipico+="2. Sopa de verduras\n";
                        menuTipico+="3. Regresar\n\n";
                        menuTipico+="Por favor seleccione una opcion\n";
                        codMenuTipico=Integer.parseInt(JOptionPane.showInputDialog(menuTipico));

                        switch (codMenuTipico) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de frijoles, el costo es de $" + 12000);
                                factura+=12000;
                                platos++;
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Se ha solciitado una Sopa de Verduras, el costo es de $" + 8000);
                                factura+=8000;
                                platos++;
                                break;
                            case 3:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No corresponde a " + "un codigo valido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                                break;
                        }
                        codMenuTipico=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea repetir "+
                                "el menu tipico, de lo contrario regresara al menu principal"));
                        if(codMenuTipico!=1){
                            codMenuTipico=3;
                        }
                    }while(codMenuTipico!=3);
                    break;
                case 2:
                    do {
                        String menuCarta= "MENU A LA CARTA\n\n";
                        menuCarta+="1. Bandeja Paisa\n";
                        menuCarta+="2. Spaghetti a la Carbonara\n";
                        menuCarta+="3. Regresar\n\n";
                        menuCarta+="Por favor seleccione una opcion\n";
                        codMenuCarta=Integer.parseInt(JOptionPane.showInputDialog(menuCarta));

                        switch (codMenuCarta){
                            case 1:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Bandeja Paisa, el costo es de $" + 32000);
                                factura+=32000;
                                platos++;
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Se ha solciitado una Spaghetti a la Carbonara, el costo es de $" + 38000);
                                factura+=38000;
                                platos++;
                                break;
                            case 3:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No corresponde a " + "un codigo valido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                                break;
                        }
                        codMenuCarta=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea repetir "+
                                "el menu a la carta, de lo contrario regresara al menu principal"));
                        if(codMenuCarta!=1){
                            codMenuCarta=3;
                        }
                    }while(codMenuCarta!=3);
                    break;
                case 3:
                    do {
                        String menuInter= "MENU A LA CARTA\n\n";
                        menuInter+="1. Ceviche peruano\n";
                        menuInter+="2. Paella Española\n";
                        menuInter+="3. Regresar\n\n";
                        menuInter+="Por favor seleccione una opcion\n";
                        codMenuInter=Integer.parseInt(JOptionPane.showInputDialog(menuInter));

                        switch (codMenuInter){
                            case 1:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Ceviche peruano, el costo es de $" + 20000);
                                factura+=20000;
                                platos++;
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Se ha solciitado una Paella Española, el costo es de $" + 18000);
                                factura+=18000;
                                platos++;
                                break;
                            case 3:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No corresponde a " + "un codigo valido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                                break;
                        }
                        codMenuInter=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea repetir "+
                                "el menu internacional, de lo contrario regresara al menu principal"));
                        if(codMenuInter!=1){
                            codMenuInter=3;
                        }
                    }while(codMenuInter!=3);
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, facturaCompra);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No corresponde a un "+"codigo valido","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
                    break;
            }
        }while(codMenuPpal!=4);
    }


    public static class Ejercicio1 {

        /**
         * Haga un algoritmo que para calcular el nuevo salario de un obrero
         * basándose en la siguiente tabla.
         * categoria A 30%
         * categoria B 20%
         * categoria C 10%*/

        public static void main(String [] args){
            double salario= 100000;

            String nombre=JOptionPane.showInputDialog("Ingrese su nombre");
            String categoria=JOptionPane.showInputDialog("Ingrese su categoria");



            if (categoria.equalsIgnoreCase("a")){
                double aumentoA = salario*0.30;
                System.out.println(nombre+"\nSu aumento salarial es de 30% \n "+ "por lo tanto su aumento es de :"+ aumentoA +"\n Su nuevo salario es de: "+ (aumentoA+ salario));
            } else if (categoria.equalsIgnoreCase("b")) {
                double aumentoB = salario*0.20;
                System.out.println(nombre+"\nSu aumento salarial es de 30% \n "+ "por lo tanto su aumento es de :"+ aumentoB +"\n Su nuevo salario es de: "+ (aumentoB+ salario));
            } else if (categoria.equalsIgnoreCase("c")) {
                double aumentoC = salario*0.10;
                System.out.println(nombre+"\nSu aumento salarial es de 30% \n "+ "por lo tanto su aumento es de :"+ aumentoC +"\n Su nuevo salario es de: "+ (aumentoC+ salario));

            }


        }
    }
}

