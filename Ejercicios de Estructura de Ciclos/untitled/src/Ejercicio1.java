import javax.swing.*;


public class Ejercicio1 {

    public static void main(String [] args){
        int ingreso = 0;

        do {
            ingreso = JOptionPane.showConfirmDialog(null, "Hola\n ¿Deseas ingresar al menu?", "Confirmar", JOptionPane.YES_NO_OPTION);
        } while (ingreso == JOptionPane.NO_OPTION);
        JOptionPane.showMessageDialog(null, "Ingresaste al menú.");

        int codMenuPpal = 0, codMenuTipico = 0, codMenuCarta = 0, codMenuInter = 0;
        String Usuario = JOptionPane.showInputDialog("Ingrese el nombre del comensal");
        double factura = 0;
        int platos = 0;


        int cantidadFrijoles = 0, cantidadSopaVerduras = 0;
        int cantidadBandejaPaisa = 0, cantidadSpaghettiCarbonara = 0;
        int cantidadCeviche = 0, cantidadPaella = 0;

        do {
            String menu = "MENU RESTAURANTE\n\n";
            menu += "1. Plato Tipico\n";
            menu += "2. Plato a la carta\n";
            menu += "3. Plato internacional\n";
            menu += "4. Salir\n\n";
            menu += "Por favor seleccione una opcion\n";
            codMenuPpal = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (codMenuPpal) {
                case 1:
                    do {
                        String menuTipico = "MENU TIPICO\n\n";
                        menuTipico += "1.Frijoles\n";
                        menuTipico += "2. Sopa de verduras\n";
                        menuTipico += "3. Regresar\n\n";
                        menuTipico += "Por favor seleccione una opcion\n";
                        codMenuTipico = Integer.parseInt(JOptionPane.showInputDialog(menuTipico));

                        switch (codMenuTipico) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de frijoles, el costo es de $" + 12000);
                                factura += 12000;
                                platos++;
                                cantidadFrijoles++;
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado una Sopa de Verduras, el costo es de $" + 8000);
                                factura += 8000;
                                platos++;
                                cantidadSopaVerduras++;
                                break;
                            case 3:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No corresponde a un codigo valido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                                break;
                        }
                        codMenuTipico = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea repetir el menu tipico, de lo contrario regresara al menu principal"));
                        if (codMenuTipico != 1) {
                            codMenuTipico = 3;
                        }
                    } while (codMenuTipico != 3);
                    break;

                case 2:
                    do {
                        String menuCarta = "MENU A LA CARTA\n\n";
                        menuCarta += "1. Bandeja Paisa\n";
                        menuCarta += "2. Spaghetti a la Carbonara\n";
                        menuCarta += "3. Regresar\n\n";
                        menuCarta += "Por favor seleccione una opcion\n";
                        codMenuCarta = Integer.parseInt(JOptionPane.showInputDialog(menuCarta));

                        switch (codMenuCarta) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Bandeja Paisa, el costo es de $" + 32000);
                                factura += 32000;
                                platos++;
                                cantidadBandejaPaisa++;
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado una Spaghetti a la Carbonara, el costo es de $" + 38000);
                                factura += 38000;
                                platos++;
                                cantidadSpaghettiCarbonara++;
                                break;
                            case 3:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No corresponde a un codigo valido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                                break;
                        }
                        codMenuCarta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea repetir el menu a la carta, de lo contrario regresara al menu principal"));
                        if (codMenuCarta != 1) {
                            codMenuCarta = 3;
                        }
                    } while (codMenuCarta != 3);
                    break;

                case 3:
                    do {
                        String menuInter = "MENU INTERNACIONAL\n\n";
                        menuInter += "1. Ceviche peruano\n";
                        menuInter += "2. Paella Española\n";
                        menuInter += "3. Regresar\n\n";
                        menuInter += "Por favor seleccione una opcion\n";
                        codMenuInter = Integer.parseInt(JOptionPane.showInputDialog(menuInter));

                        switch (codMenuInter) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Ceviche peruano, el costo es de $" + 20000);
                                factura += 20000;
                                platos++;
                                cantidadCeviche++;
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado una Paella Española, el costo es de $" + 18000);
                                factura += 18000;
                                platos++;
                                cantidadPaella++;
                                break;
                            case 3:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No corresponde a un codigo valido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                                break;
                        }
                        codMenuInter = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea repetir el menu internacional, de lo contrario regresara al menu principal"));
                        if (codMenuInter != 1) {
                            codMenuInter = 3;
                        }
                    } while (codMenuInter != 3);
                    break;

                case 4:

                    String facturaCompra = "Factura de compra\n";
                    facturaCompra+=Usuario+"\n\n";


                    if (cantidadFrijoles > 0) {
                        facturaCompra += "Frijoles (" + cantidadFrijoles + ").......$" + (cantidadFrijoles * 12000) + "\n";
                    }
                    if (cantidadSopaVerduras > 0) {
                        facturaCompra += "Sopa de Verduras (" + cantidadSopaVerduras + ").......$" + (cantidadSopaVerduras * 8000) + "\n";
                    }
                    if (cantidadBandejaPaisa > 0) {
                        facturaCompra += "Bandeja Paisa (" + cantidadBandejaPaisa + ").......$" + (cantidadBandejaPaisa * 32000) + "\n";
                    }
                    if (cantidadSpaghettiCarbonara > 0) {
                        facturaCompra += "Spaghetti a la Carbonara (" + cantidadSpaghettiCarbonara + ").......$" + (cantidadSpaghettiCarbonara * 38000) + "\n";
                    }
                    if (cantidadCeviche > 0) {
                        facturaCompra += "Ceviche peruano (" + cantidadCeviche + ").......$" + (cantidadCeviche * 20000) + "\n";
                    }
                    if (cantidadPaella > 0) {
                        facturaCompra += "Paella Española (" + cantidadPaella + ").......$" + (cantidadPaella * 18000) + "\n";
                    }

                    facturaCompra += "\nTotal factura: $" + factura;
                    JOptionPane.showMessageDialog(null, facturaCompra);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "No corresponde a un codigo valido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        } while (codMenuPpal != 4);
    }
}



