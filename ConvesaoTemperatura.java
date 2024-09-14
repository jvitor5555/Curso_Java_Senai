package primeiro_projeto;

import javax.swing.JOptionPane;

public class ConvesaoTemperatura {

    public static void main(String[] args) {

        //Entrada 
        double C = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a temperatura em graus C°"));

        //Processamento
        double F = C * 1.8 + 32;

        //Saída
        JOptionPane.showMessageDialog(null, " A conversão de " + C + " graus C° em F° é " + F);

    }

}
