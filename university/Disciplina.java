import java.util.ArrayList;


public class Disciplina {
    private int ch;
    private int cod;
    private String nome;
    private ArrayList<Aluno> alunos;

    public Disciplina(int ch, int cod, String nome) {
        this.ch = ch;
        this.cod = cod;
        this.nome = nome;
    }

    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Carga horaria: " + this.ch);
        System.out.println("Codigo: " + this.cod);
    }

    // public static Disciplina criarDisciplina(int ch, int cod, String nome) {
    //     Disciplina nova_disciplina = new Disciplina(ch, cod, nome);
    //     return nova_disciplina;
    // }

    public static void main(String[] args) {
        Disciplina disciplina = new Disciplina(60, 1010, "Prog. Funcional");
        // Disciplina disciplina = criarDisciplina(60, 1010, "Prog. Funcional");
        disciplina.print();
    }
}
