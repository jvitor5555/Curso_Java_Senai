
package primeiro_projeto;

import javax.swing.JOptionPane;


public class Entradas_java {
    public static void main(String[] args) {
        
        
        //Comando utilizado no lugar do (System.out.print)
        JOptionPane.showMessageDialog(null," Seja bem-vindo!!!! ");
        
        //Comando utilizado no lugar do (sc.nextline)
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        
        JOptionPane.showMessageDialog(null, nome);
        
        //Comando para converter uma variavel do tipo String em double
        double teste = Double.parseDouble(JOptionPane.showInputDialog("Digite um número; "));
        
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite outro número; "));
        
        double soma = teste+numero;
        
        JOptionPane.showMessageDialog(null, soma);
        
        
        
        
        
        
        
        
    }
}
