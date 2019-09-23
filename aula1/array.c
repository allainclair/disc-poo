#include <stdio.h>

#define MAX 1000

typedef struct Array {
    int values[MAX];
    int length;
} Array;


Array array_create() {
    Array array;

    array.length = 0;
    return array;
}

int array_append(Array *array, int new_value) {
    if (array->length >= MAX)
        return -1;
    array->values[array->length++] = new_value;
    return array->length - 1;
}


int main() {
    Array array;

    array.create();
    array.append(1);
    array.append(2);
    array.append(3);
    //array [1, 2, 3]

    for (int i=0; i<array.length(); i++) {
        printf("%d ", array.get_value(i));
    }

    // array = array_create();
    // array_append(&array, 1);
    // array_append(&array, 2);
    // array_append(&array, 3);
    //
    // for (int i=0; i<array.length; i++) {
    //     printf("%d ", array.values[i]);
    // }
    // printf("\n");

    // array = {1, 2, 3}
}
