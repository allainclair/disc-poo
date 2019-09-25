public class Person {
    // private Age age;
    // private Email email;
    // private Cpf cpf;
    // private Name name;
    // private Smartphone smartphone;

    private int age;
    private String cpf;
    private String email;
    private String name;
    private Smartphone smartphone;

    public Person(int age, String cpf, String email, String name, Smartphone smartphone) {
        this.age = age;
        this.cpf = cpf;
        this.email = email;
        this.name = name;
        this.smartphone = smartphone;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int new_age) {
        this.age = new_age;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String new_cpf) {
        this.cpf = new_cpf;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String new_email) {
        this.email = new_email;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String new_name) {
        this.name = new_name;
    }

    public Smartphone getSmartphone() {
        return this.smartphone;
    }

    public void setSmartphone(Smartphone new_smartphone) {
        this.smartphone = new_smartphone;
    }

    public int size() { // Proxy or Adapter Design Pattern.
        return this.name.length();
    }

    public void print() {
        System.out.println("Age: " + this.age);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Email: " + this.email);
        System.out.println("Name: " + this.name);
        System.out.println(
            "Smartphone:"
            + " " + this.smartphone.getCountryNumber()
            + " " + this.smartphone.getAreaNumber()
            + " " + this.smartphone.getNumber());
    }
}
