package primeiro_projeto;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String nome = "";

        while (nome.isEmpty()) {
            nome = JOptionPane.showInputDialog(null, "Digite seu nome:", "Informe seu nome", JOptionPane.PLAIN_MESSAGE);

            if (nome == null) {
                // Caso o usuário clique em cancelar ou feche a janela
                JOptionPane.showMessageDialog(null, "Você deve preencher o nome!", "Nome não informado", JOptionPane.ERROR_MESSAGE);
               // nome = ""; // Reinicia o loop
                
            } else if (nome.trim().isEmpty()) {
                // Caso o usuário deixe o campo em branco e clique em OK
                JOptionPane.showMessageDialog(null, "Você deve preencher o nome!", "Nome não informado", JOptionPane.ERROR_MESSAGE);
            }
        }

        JOptionPane.showMessageDialog(null, "Olá, " + nome + "!");
    }
}