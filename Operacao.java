
package primeiro_projeto;

import javax.swing.JOptionPane;


public class Operacao {
    public static void main(String[] args) {
        
       String a =  JOptionPane.showInputDialog(null,"Digite um número: ");
        
       String b = JOptionPane.showInputDialog(null,"Digite outro número: ");
     
       double n1 = Double.parseDouble(a);
       double n2 = Double.parseDouble(b);
       
       JOptionPane.showConfirmDialog(null,"Digite um número de acordo com a operação que deseja realizar: ");
       int soma = Integer.parseInt(JOptionPane.showInputDialog(" 1-soma, 2-Subtração, 3-Multiplicacão e 4-Divisão"));
       
       if (soma==1){
           double valor = n1+n2;
           JOptionPane.showConfirmDialog(null,"A soma dos números é: " + valor);
       }
       
      else if(soma==2){
           double valor = n1-n2;
           JOptionPane.showConfirmDialog(null,"A subtração dos números é: " + valor);
       }
       
       if(soma==3){
           double valor = n1*n2;
           JOptionPane.showConfirmDialog(null,"A multiplicação dos números é: " + valor);
       }
       
       else if (soma==4){
           double valor = n1/n2;
           JOptionPane.showConfirmDialog(null,"A divisão dos números é: " + valor);
       }
       else{
           
       }
       
       
       
       
        
        
    }
}
