
package primeiro_projeto;

import javax.swing.JOptionPane;


public class SalarioProfessor {
    
    public static void main(String[] args) {
        
        int nivel = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o seu nivel de 1 a 3: "));
        
        double aulas = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de aulas por semana: "));
        
        if (nivel==1){
            double salario = aulas*12;
            JOptionPane.showConfirmDialog(null,"Seu sálario é de: " + salario);
            
        }
        else if (nivel==2){
            double salario = aulas*17;
            JOptionPane.showConfirmDialog(null,"Seu sálario é de: " + salario);
        }
        else if (nivel==3){
            double salario = aulas*25;
            JOptionPane.showConfirmDialog(null,"Seu sálario é de: " + salario);
        }
        else{
            JOptionPane.showConfirmDialog(null,"Comando Inválido");
        }
    }
}
