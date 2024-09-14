
package primeiro_projeto;

import javax.swing.JOptionPane;


public class Numero {
    
    public static void main(String[] args) {
        
      String n = JOptionPane.showInputDialog("Digite um número: ");
        
        double numero = Double.parseDouble(n);
        
        double valor = numero%2;
        
        if (numero==0){
            
            JOptionPane.showConfirmDialog(null,"O número digitado é zero ");
            
        }
        
        else if (valor==0) {
            
            JOptionPane.showConfirmDialog(null,"Esse número é par ");
        }
        
        else{
            
            JOptionPane.showConfirmDialog(null,"Esse número é impar ");
        }
    }
    
}
