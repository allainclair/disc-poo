import java.util.ArrayList;


public class Aluno {
    private String email;
    private String nome;
    private int ra_numero;
    private String senha;
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public Aluno(String email, String nome, int ra_numero, String senha) {
        this.email = email;
        this.nome = nome;
        this.ra_numero = ra_numero;
        this.senha = senha;
    }

    public String raString() {
        return "RA" + Integer.toString(this.ra_numero);
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
        System.out.println("Disciplina '" + disciplina.getNome() + "' adcionada.");
    }

    public String getNome() {
        return this.nome;
    }

    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("email: " + this.email);
        System.out.println("RA: " + this.raString());
        System.out.println("Senha: " + this.senha);
    }

    public void printDisciplinas() {
        for (Disciplina disciplina : this.disciplinas)
            disciplina.print();
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("email@g.com", "Joao", 123456, "joao123");
        Disciplina disciplina1 = new Disciplina(60, 1010, "Prog. Funcional");
        Disciplina disciplina2 = new Disciplina(55, 2010, "Prog. Logica");
        Disciplina disciplina3 = new Disciplina(50, 1234, "Sist. Operacionais");
        aluno1.adicionarDisciplina(disciplina1);
        aluno1.adicionarDisciplina(disciplina2);
        aluno1.adicionarDisciplina(disciplina3);
        aluno1.print();
        aluno1.printDisciplinas();
    }
}
