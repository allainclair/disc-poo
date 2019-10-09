import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Forma circulo = new Circulo(10.0f);
        Forma quadrado = new Quadrado(10.0f);
        Forma retangulo = new Retangulo(10.0f, 5.0f);
        Forma forma = new Forma();

        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(circulo);
        formas.add(quadrado);
        formas.add(retangulo);
        formas.add(forma);

        for (Forma f : formas) {
            System.out.println(f.area());
            System.out.println(f.tamanho_borda());
            f.print();
            System.out.println();
            // forma.println();
        }
    }
}
