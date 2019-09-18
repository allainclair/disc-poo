## POO

### Análogias C → Java (Procedural → OO):

* `typedef struct` → `Classe`;
* `variável` → `objeto`;
* `função` → `método (ou operação)`: que é definido dentro de uma classe e usado
  pelo objeto instanciado.

O objeto é análogo a uma varivável, porém ele tem operações (métodos) associados.

```C tab=
// array.c

typedef struct Array {
    int values[100];
    int length;
} Array;

Array array;

array_append(array, 1);
array_append(array, 2);
array_append(array, 3);

// array = {1, 2, 3}
```

```Java tab=
//Array.java

public class Array {

    int values[100];
    int length;

    public void append(value) {
        this.values[this.length] = value;
        this.length++;
    }

    public static void main(String[] args) {
        Array array = new Array();
        array.append(1);
        array.append(2);
        array.append(3);
    }
}
```

## Exercícios

### Criar duas classes chamada `Triangulo` e `Retangulo` (dois arquivos .java);

#### Atributos privados

    * Triângulo: base, altura;

    * Retângulo: lado1, lado2;

#### Métodos

  * Construtor Triângulo: base, altura;

  * Construtor Retângulo: lado1, lado2;

  * Perimetro;

  * Área.
