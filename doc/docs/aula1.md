## POO

Baseado no coneceito de **objetos** o qual contem dados em forma de **campos**
geralmente chamado de **propriedades** ou **atributos**; e também código em forma
de operações (procedimentos) geralmente chamados de métodos.

Uma característica do objeto é que ele pode acessar e modificar os dados dados
que eles são associados, ou seja, suas **propriedades** ou **atributos**. Geralmente
usa-se a notação "this" ou "self" para isso dentro da definição de sua classe.

Logo é necessário definir uma classe antes de cria-se um objeto (ou instanciar-se)
pois objetos são oriundos dessa classe, que é uma espécie de modelo para o objeto.

Uma classe é análoga a uma **estrutura (`struct`) em `C`**, porém com maior
poder de expressividade pois podemos definir métodos dentro dela. Métodos são
análogos a funções em `C`.

É como se estruturas tivem dentro delas já suas funções associadas (métodos),
e só objetos dessa classe podem utilizar essas funções de maneira direta, na maioria
dos casos.

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

* Abstração: é um TAD (Tipo Abstrato de Dado);
* Encapsulamento.

Posteriormente

* Herança e Polimorfismo.
