public class Ex2 {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone(55, 44, 30303030);
        Person person1 = new Person(25, "019.649.111-88", "a@a.com", "Maria", smartphone);
        // Person person2 = new Person(35, "919.649.111-88", "a@ad.com", "Jose", "55 44 9999 3030");
        person1.print();
        // System.out.println(person1.getSmartphone());
        // person1.setEmail("allain@gmail.com");
        // System.out.println("New email: " + person1.getEmail());

        // person2.print();
    }
}
