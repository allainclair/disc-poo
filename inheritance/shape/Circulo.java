class Circulo extends Forma {
    private final static float PI = 3.14f;

    private float raio;

    public Circulo(float raio) {
        this.raio = raio;
    }

    public float tamanho_borda() {  // circunferencia.
        return 2 * this.PI * this.raio;
    }

    public float area() {
        return this.PI * this.raio * this.raio;
    }

    public void print() {
        System.out.println("Forma: Circulo");
        System.out.println("Raio: " + this.raio);
        System.out.println("Circunferencia: " + this.tamanho_borda());
        System.out.println("Area: " + this.area());
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo(10.0f);
        circulo.print();
    }
}
