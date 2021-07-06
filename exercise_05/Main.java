import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int raio0;
        System.out.println("Digite o valor do raio: ");
        raio0 = sc.nextInt();

        Circulo a1 = new Circulo(raio0);

        System.out.println("Raio: " + a1.getRaio());
        System.out.println("Area: " + a1.area());
        System.out.println("Circunferencia: " + a1.circunf());

    }
    
}
