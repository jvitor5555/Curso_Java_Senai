
package primeiro_projeto;

import javax.swing.JOptionPane;


public class Produto {
    
    public static void main(String[] args) {
        
        String nome_produto = JOptionPane.showInputDialog("Insira o nome do produto: ");
        
        int  quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto: "));
        
        double  preco_unitario = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto: "));
        
        double total = quantidade*preco_unitario;
        
        if (quantidade<5){
            double desconto = total*0.02;
            double preco_total = total - desconto;
            JOptionPane.showConfirmDialog(null,"O preço do produto é " + preco_total);
            
        }
        
        else if (quantidade>5 && quantidade<=10){
            double desconto = total*0.03;
            double preco_total = total - desconto;
            JOptionPane.showConfirmDialog(null,"O preço do produto é " + preco_total);
        
    }
        else if (quantidade>10){
            double desconto = total*0.05;
            double preco_total = total - desconto;
            JOptionPane.showConfirmDialog(null,"O preço do produto é " + preco_total);
        }
    }
}
