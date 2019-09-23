import java.util.ArrayList;


public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("Joao");
        names.add("Maria");
        names.add("Jose");

        System.out.println(names.get(1));
        names.set(0, "Jonas");
        names.remove(0);
        System.out.println(names.size());

        for (String name : names)
            System.out.println(name);
    }
}
