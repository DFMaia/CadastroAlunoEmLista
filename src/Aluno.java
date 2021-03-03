
import java.util.List;

public class Aluno{

    private String nome;
    private Integer nota;
    private String periodo;
    private List Aluno;

    public Aluno(String nome, Integer nota, String periodo){
        this.nome = nome;
        this.nota = nota;
        this.periodo = periodo;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNota() {
        return nota;
    }

    public String getPeriodo() {
        return periodo;
    }
}
