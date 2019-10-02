import java.util.ArrayList;


public class Disciplina {
    private int ch;
    private int cod;
    private String nome;
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    public Disciplina(int ch, int cod, String nome) {
        this.ch = ch;
        this.cod = cod;
        this.nome = nome;
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
        System.out.println("Aluno '" + aluno.getNome() + "' adcionado(a).");
    }

    public String getNome() {
        return this.nome;
    }

    public ArrayList<Aluno> getAlunos() {
        return this.alunos;
    }

    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Carga horaria: " + this.ch);
        System.out.println("Codigo: " + this.cod);
    }

    public void printAlunos() {
        for (Aluno aluno : this.alunos)
            aluno.print();
    }

    public static void main(String[] args) {
        Disciplina disciplina = new Disciplina(60, 1010, "Prog. Funcional");
        Aluno aluno1 = new Aluno("email@g.com", "Joao", 123456, "joao123");
        Aluno aluno2 = new Aluno("maria@g.gmail.com", "Maria", 323356, "maria123");
        Aluno aluno3 = new Aluno("jose@g.gmail.com", "Jose", 921356, "jose123");
        // Disciplina disciplina = criarDisciplina(60, 1010, "Prog. Funcional");
        disciplina.adicionarAluno(aluno1);
        disciplina.adicionarAluno(aluno2);
        disciplina.adicionarAluno(aluno3);
        disciplina.print();
        disciplina.printAlunos();
    }
}
