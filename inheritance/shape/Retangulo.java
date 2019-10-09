class Retangulo extends Forma {
    private float base;
    private float altura;

    public Retangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float tamanho_borda() {  // perimetro
        return 2*this.base + 2*this.altura;
    }

    public float area() {
        return this.base * this.altura;
    }

    public void print() {
        System.out.println("Forma: Retangulo");
        System.out.println("Base: " + this.base);
        System.out.println("Altura: " + this.altura);
        System.out.println("Perimetro: " + this.tamanho_borda());
        System.out.println("Area: " + this.area());
    }

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(10.0f, 5.0f);
        retangulo.print();
    }
}
