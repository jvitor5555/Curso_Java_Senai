package primeiro_projeto;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class ResultadoDaMultiplicacao {
    
    public static void main(String[] args) throws UnsupportedEncodingException {
        
        System.setOut(new PrintStream(System.out,true,"UTF-8"));
        
        //1-	Faça um algoritmo e um programa em Java receba dois números digitados pelo usuário, e ao final exibia qual é o resultado da multiplicação destes números.
        
        Scanner sc = new Scanner(System.in);
        
        //Entrada de dados
        
        System.out.print("Digite o primeiro número: ");
        
        int n1 = sc.nextInt();
        
        System.out.print("Digite o segundo número: ");
        
        int n2 = sc.nextInt();
        
       sc.close();
       
       //Processamento dos dados
       
       int m = n1*n2;
       
       //Saída dos dados
       
        System.out.println("O resultado da multiplicação de " + n1 + " x " + n2 + "é" + " = " + m);
               
       
       
        
        
        
        
        
        
        
        
    }
    
}
