class Vehicle {  // Super classe
    // Atributos "protected" indicam que sub classes podem acessa-los.
    protected String brand = "Ford";        // Vehicle attribute

    public void honk() {                    // Vehicle method
        System.out.println("Tuut, tuut!");
    }
}
