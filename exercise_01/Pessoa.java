class Pessoa{
    /* Atributos: */
    private String nome;
    private int idade;
    private float peso;

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