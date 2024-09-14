
package primeiro_projeto;

import javax.swing.JOptionPane;


public class PositivoNegativo {
    public static void main(String[] args) {
        
         String n = JOptionPane.showInputDialog("Digite um número: ");
        
        double numero = Double.parseDouble(n);
        
        
        
        if (numero==0){
            
            JOptionPane.showConfirmDialog(null,"O número digitado é zero ");
            
        }
        
        else if (numero>0) {
            
            JOptionPane.showConfirmDialog(null,"Esse número é positivo ");
        }
        
        else{
            
            JOptionPane.showConfirmDialog(null,"Esse número é negativo ");
        }
    }
    
}
