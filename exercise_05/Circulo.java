class Circulo {
    /* Atributos: */
    private int raio;

    

    /* Construtor: */
    public Circulo(int raio) {
        setRaio(raio);
    }

    /* Métodos: */
    
    private void setRaio(int raio) {
        this.raio = raio;
    }

    public int getRaio() {
        return this.raio;
    }


    public double area() {
        double area = this.raio * this.raio * 3.1416;
        return area;
    }

    public double circunf() {
        double circunf = 2 * this.raio * 3.1416;
        return circunf;
    }

    
   
    
}