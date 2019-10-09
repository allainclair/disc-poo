class Quadrado extends Forma {
    private float aresta;

    public Quadrado(float aresta) {
        this.aresta = aresta;
    }

    public float tamanho_borda() {  // perimetro
        return 4 * this.aresta;
    }

    public float area() {
        return this.aresta * this.aresta;
    }

    public void print() {
        System.out.println("Forma: Quadrado");
        System.out.println("Aresta: " + this.aresta);
        System.out.println("Perimetro: " + this.tamanho_borda());
        System.out.println("Area: " + this.area());
    }

    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(10.0f);
        quadrado.print();
    }
}
