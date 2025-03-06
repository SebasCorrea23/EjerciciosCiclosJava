import javax.swing.*;

public class Ejercicio1 {

    public static void main(String [] args){
        int cantPac=0, numDias=0, valorDia=100000, documento=0, finPac=0;
        double costoTrata=0, costoMedi=0, factura=0;
        String paciente="", mensajeFact="";


        do{
            cantPac=JOptionPane.showConfirmDialog(null, "¿Desea cancelar la factura del paciente?", "Ingreso paciente", JOptionPane.YES_NO_OPTION);
            if (cantPac==JOptionPane.YES_OPTION){


                paciente=JOptionPane.showInputDialog("Nombre del paciente");
                documento=Integer.parseInt(JOptionPane.showInputDialog("documento del paciente"));
                numDias=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos dias estuvo el paciente?"));

                factura=numDias*valorDia;

                costoTrata=Double.parseDouble(JOptionPane.showInputDialog("¿Que valor le indico el doctor que tenia el tratatamiento?"));
                costoMedi=Double.parseDouble(JOptionPane.showInputDialog("¿Que costo se le indicó que consumió en medicamentos?"));

                factura+=costoTrata;
                factura+=costoMedi;

                mensajeFact+="Paciente...."+paciente;
                mensajeFact+="\nDocumento....("+documento+")";
                mensajeFact+="\n\nDias de Hospitalizacion....("+numDias+")";
                mensajeFact+="\nValor del Tratamiento....($"+costoTrata+")";
                mensajeFact+="\nValor Medicamentos....($"+costoMedi+")";
                mensajeFact+="\n\n\nValor Total de la factura....$"+factura;
                mensajeFact+="\n\nCantidad de pacientes facturados....("+cantPac+")\n\n";



                finPac=JOptionPane.showConfirmDialog(null,"¡Desea ingresar otro paciente?", "otro paciente", JOptionPane.YES_NO_OPTION);
            }else if(cantPac==JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null, "Sin pacientes ingresados");
            }



        }while (finPac== JOptionPane.YES_OPTION);
        cantPac++;
        JOptionPane.showMessageDialog(null, mensajeFact);
    }
}
