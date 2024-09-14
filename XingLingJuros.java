
package primeiro_projeto;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class XingLingJuros {
    
    public static void main(String[] args) throws UnsupportedEncodingException {
        
        System.setOut(new PrintStream(System.out,true,"UTF-8"));
        
        //3-	A rede de lojas Xing Ling está vendendo seus produtos em até 5x sem juros, 
        //sendo assim faça um algoritmo que receba o valor de uma compra e mostre o valor das parcelas.
        
        //Entrada de dados
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor da compra: ");
        
        double compra = sc.nextDouble();
        
        System.out.println("Digite o valor das parcelas: ");
        int parcela = sc.nextInt();
        
        sc.close();
       
        //Processamento dos dados
        
        double d = compra/parcela;
        
        if (parcela>5) 
            System.out.println("SERÁ ACRESCIDO JUROS DE 10% !!!");
           
        
        //Se necessario adicione o juros após as cinco parcelas
        
        //Saída dos dados
        
            
        System.out.println("O valor da sua compra é de: " + compra + " reais " + "divididas em: "+ parcela + " parcelas de " + d+ " reais ");  
        
        
        
        
    }
    
}
