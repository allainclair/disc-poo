import java.util.ArrayList;


public class Professor {
    private String email;
    private String nome;
    private int id;
    private String senha;
    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public Professor(String email, String nome, int id, String senha) {
        this.email = email;
        this.nome = nome;
        this.id = id;
        this.senha = senha;
    }

    // public String raString() {
    //     return "RA" + Integer.toString(this.ra_numero);
    // }

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
        System.out.println("ID: " + Integer.toString(this.id));
        System.out.println("Senha: " + this.senha);
    }

    public void printDisciplinas() {
        for (Disciplina disciplina : this.disciplinas)
            disciplina.print();
    }

    public void printAlunos() {
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        for (Disciplina disciplina : this.disciplinas)
            for (Aluno aluno : disciplina.getAlunos())
                if (!alunos.contains(aluno)) {
                    alunos.add(aluno);
                    aluno.print();
            }
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("email@g.com", "Joao", 123456, "joao123");
        Aluno aluno2 = new Aluno("maria@g.gmail.com", "Maria", 323356, "maria123");
        Aluno aluno3 = new Aluno("jose@g.gmail.com", "Jose", 921356, "jose123");
        Aluno aluno4 = new Aluno("marcos@g.gmail.com", "Marcos", 921556, "marcos123");

        Disciplina disciplina1 = new Disciplina(60, 1010, "Prog. Funcional");
        Disciplina disciplina2 = new Disciplina(55, 2010, "Prog. Logica");
        Disciplina disciplina3 = new Disciplina(50, 1234, "Sist. Operacionais");

        Professor professor = new Professor("allain@g.com", "Allain", 1000, "allain123");
        Professor professor2 = new Professor("anderson@g.com", "Anderson", 1200, "anderson123");

        disciplina1.adicionarAluno(aluno1);
        disciplina1.adicionarAluno(aluno2);
        disciplina1.adicionarAluno(aluno3);

        disciplina2.adicionarAluno(aluno2);
        disciplina2.adicionarAluno(aluno3);
        disciplina2.adicionarAluno(aluno4);

        disciplina3.adicionarAluno(aluno1);
        disciplina3.adicionarAluno(aluno3);
        disciplina3.adicionarAluno(aluno4);

        professor.adicionarDisciplina(disciplina1);
        professor.adicionarDisciplina(disciplina2);

        professor2.adicionarDisciplina(disciplina3);


        professor.print();
        professor.printAlunos();
        System.out.println();
        professor2.print();
        professor2.printAlunos();
    }
}
