

package primeiro_projeto;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 *
 * @author caio.alunos
 */
public class PrimeiroProjeto {

    /**
     * @param args the command line arguments
     * 
     */
    
    public static void main(String[] args) throws UnsupportedEncodingException {
        
        System.setOut(new PrintStream(System.out,true,"UTF-8"));
        
        // Programa que lê quatro notas do usúario e informa a média final.
        
        // Entrada de dados
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        
        System.out.print("Digite o pimeiro número: ");
        int n1 = sc.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();
        
        System.out.print("Digite o terceiro número:");
        int n3 = sc.nextInt();
        
        System.out.print("Digite o quarto número: ");
        int n4 = sc.nextInt();
        
        sc.close();
        
        //Processamento dos dados
       
        int media = (n1 + n2 + n3 + n4)/4;
        
        // Saída dos dados
        
        System.out.println("Seu nome é: " + nome + " e sua média final é de: " + media);
        
        
        
        
        
        
        
         
         
         
         
         
         
         
        
        
        
        
       
              
    }
    
}
