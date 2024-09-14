package primeiro_projeto;

import javax.swing.JOptionPane;

public class Idade {

    public static void main(String[] args) {

        //Entrada
         JOptionPane.showInputDialog("Digite o seu nome: ");

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));

        //Processamento e saída
        if (idade >= 18) {
            JOptionPane.showMessageDialog(null, "Habilitação Oficial");

        } 
        
        else if (idade>=15 && idade<=17){
                JOptionPane.showMessageDialog(null, "permissão");
            }
        
            else{
                JOptionPane.showMessageDialog(null, "Invalída");
            }
    }

}   


