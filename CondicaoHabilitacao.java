package primeiro_projeto;

import java.util.Scanner;

public class CondicaoHabilitacao {

    public static void main(String[] args) {

        String nome;

        int idade;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        nome = sc.nextLine();

        System.out.println("Digite a sua idade: ");
        idade = sc.nextInt();

        sc.close();

        if (idade >= 18) {

            System.out.println("VOCÊ PODE TIRAR A CARTA!!!!");
        } else {
            System.out.println("VOCÊ NÃO PODE TIRAR A CARTA!!!!");
        }

    }

}
