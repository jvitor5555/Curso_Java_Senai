
package primeiro_projeto;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class AnoUsuario {
    public static void main(String[] args) throws UnsupportedEncodingException {
        
        System.setOut(new PrintStream(System.out,true,"UTF-8"));
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o ano de seu nascimento: ");
        int nascimento = sc.nextInt();
        
        System.out.println("Digite o ano atual: ");
        int ano_atual = sc.nextInt();
        
        sc.close();
        
        int s = ano_atual - nascimento;
        
        System.out.println("Você tem " +s+ " anos");
        
        
        
        
    }
    
}
