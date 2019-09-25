// Estender para "Person".

public class Name {
    private String name;

    public Name(String name) {
        String str = "string";
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int size() { // Proxy or Adapter Design Pattern.
        return this.name.length();
    }
}
