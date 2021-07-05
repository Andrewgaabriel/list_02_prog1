import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        float peso;

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        
        System.out.println("Digite seu peso: ");
        peso = sc.nextFloat();

        Pessoa b1 = new Pessoa(nome, idade, peso);
        b1.imprimeDados();

        System.out.println("Digite seu novo nome: ");
        nome = sc.nextLine();
        nome = sc.nextLine();
        b1.setNome(nome);

        System.out.println("Digite sua nova idade: ");
        idade = sc.nextInt();
        b1.setIdade(idade);
        
        System.out.println("Digite seu novo peso: ");
        peso = sc.nextFloat();
        b1.setPeso(peso);

        b1.imprimeDados();
    }
}
