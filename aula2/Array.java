//Array.java

// Classes sao publicas, ou seja, qualquer um pode usa-las.
public class Array {
    // Atributos devem ser privados, para apenas o proprio
    // objeto manipula-lo.

    // Esta eh uma forma de definir uma constante, pois eh.
    private static final int MAX = 100;

    // Esta eh uma forma de definir atributos da classe.
    // Temos outros tipos de arrays jah dinamicos.
    private int values[] = new int[this.MAX];
    private int length;
    //private int values[this.MAX];

    // Metodos sao a interface de como outros objetos manipulam este objeto.
    // Por isso de forma geral devem ser publicos.

    // Construtor da classe. Quando objeto eh instanciado esse "metodo construtor"
    // eh chamado. Eh possivel passar parametros.
    public Array() {
        this.length = 0;
    }

    public int append(int value) {
        // a palavra "this" referencia o atributo do proprio objeto quando
        // instanciado.

        // Caso array esteja completo.
        if (this.length >= this.MAX)
            return -1;

        this.values[this.length++] = value;
        return this.length - 1;
    }

    public int getLength() {
        return this.length;
    }

    public static void main(String[] args) {
        Array array1 = new Array();  // Criacao do objeto (ou instancia).
        Array array2 = new Array();

        for (int i=0;i<10;i++) {
            array1.append(i*10);
            array2.append(i*100);
        }

        System.out.println("array1.length " + array1.getLength());
        System.out.println("array2.length " + array2.getLength());

        for (int i=0;i<10;i++) {
            System.out.println("Element array1 " + array1.values[i]);
            System.out.println("Element array2 " + array2.values[i]);
        }
    }
}
