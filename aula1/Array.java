//Array.java

// Classes sao publicas, ou seja, qualquer um pode usa-las.
public class Array {
    // Atributos devem ser privados, para apenas o proprio objeto manipula-lo.

    // Esta eh uma forma de definir uma constante, pois eh.
    private static final int MAX = 100;

    // Esta eh uma forma de definir atributos da classe.
    // Temos outros tipos de arrays jah dinamicos.
    private int values[] = new int[this.MAX];
    private int length;

    // Metodos sao a interface de como outros objetos manipulam este objeto.
    // Por isso de forma geral devem ser publicos.

    // Construtor da classe. Quando objeto eh instanciado esse "metodo construtor"
    // eh chamado. Eh possivel passar parametros.
    public Array() {
        this.length = 0;
    }

    public void append(int value) {
        // a palavra "this" referencia o atributo do proprio objeto quando
        // instanciado.
        this.values[this.length] = value;
        this.length++;
    }

    public int getLength() {
        return this.length;
    }

    public static void main(String[] args) {
        Array array = new Array();  // Criacao do objeto (ou instancia).

        for (int i=0;i<10;i++)
            array.append(i*10);

        System.out.println("array.length " + array.getLength());
        for (int i=0;i<10;i++)
            System.out.println("Element " + array.values[i]);
    }
}
