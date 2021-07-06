import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String nome;
        int idade;
        float peso;

        Pessoa b1 = new Pessoa();

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        b1.setNome(nome);
        
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        b1.setIdade(idade);

        System.out.println("Digite seu peso: ");
        peso = sc.nextFloat();
        b1.setPeso(peso);

        b1.imprimeDados();
    }
}
