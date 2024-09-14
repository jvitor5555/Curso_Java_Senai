
package primeiro_projeto;

import java.util.Scanner;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;


public class CotacaoReal {
    
    public static void main(String[] args) throws UnsupportedEncodingException {
        
     System.setOut(new PrintStream(System.out,true,"UTF-8"));
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o valor da cotação do Dollar: ");
        double cotacao = sc.nextDouble();
        
        System.out.println("Informe a quantidade de dollares que deseja converter: ");
        double dollar = sc.nextDouble();
        
        sc.close();
        
        //Processamento dos dados
        
        double reais = dollar*cotacao;
        
        String teste = String.format("%.2f",reais);
        
        System.out.println("Você possui: " + dollar + " dollares, que são equivalentes a: " + teste + " reais");
        
        
        
    }
           
}
