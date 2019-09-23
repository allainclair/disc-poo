// Extnder para "Person".

public class Name {
    String name;

    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int size() { // Proxy or Adapter Design Pattern.
        return this.name.length();
    }
}
