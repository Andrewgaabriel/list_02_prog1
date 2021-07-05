public class Pessoa{
    /* Atributos: */
    private String nome;
    private int idade;
    private float peso;



    /* Construtor: */
    public Pessoa(String nome, int idade, float peso) {
        setNome(nome);
        setIdade(idade);
        setPeso(peso);
    }

    /* Métodos: */
    String getNome() {
        return this.nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    int getIdade() {
        return this.idade;
    }

    void setIdade(int idade) {
        this.idade = idade;
    }

    float getPeso() {
        return this.peso;
    }

    void setPeso(float peso) {
        this.peso = peso;
    } 

    void imprimeDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Peso: " + this.peso);
    }


}