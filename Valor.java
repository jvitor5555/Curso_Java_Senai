
package primeiro_projeto;

import javax.swing.JOptionPane;


public class Valor {
    
    public static void main(String[] args) {
        
        // 1 - Entrada de dados
        
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
        
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro número: "));
        
        // 2 - Processamento dos dados
      
        if(n1==n2){
            JOptionPane.showMessageDialog(null,"Os números são iguais");
        }
        
        else if(n1>n2){
            JOptionPane.showMessageDialog(null,"O maior número é: " + n1 + " e o menor número é " + n2);
            
        }
        
        else{
            JOptionPane.showMessageDialog(null,"O maior número é: " + n2 + " e o menor número é " + n1);
        }
        
    }
}
