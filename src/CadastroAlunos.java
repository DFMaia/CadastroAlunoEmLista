import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CadastroAlunos {

    List<Aluno> alunos = new ArrayList<>();

    //Cadastra um aluno por vez no vetor.
    public void cadastrarAluno(String nome, Integer nota, String periodo){
        alunos.add(new Aluno(nome, nota, periodo));
    }

    //Mostra a lista de aluno com todas as características da classe
    public void listaDeAlunos(){
        for(Aluno alunoss : alunos){
            System.out.println("O nome do aluno é: " + alunoss.getNome() +
                                " a nota é: " + alunoss.getNota() +
                                " e o período é " + alunoss.getPeriodo());
        }
    }

    //Lista ordenada pela maior nota
    public void listaOrdenadaPelaMaiorNota(){
        Comparator<Aluno> compareByNota = (Aluno oo1, Aluno o2) -> oo1.getNota().compareTo(o2.getNota());
        Collections.sort(alunos, compareByNota.reversed());
        alunos.forEach(aluno -> System.out.println(aluno.getNome() + " " + aluno.getNota()));
    }


    //Média das notas
    public Double mediaDasNotas(){
        Double resultado = 0.0;
        int tamanho = alunos.size();
        for(Aluno alunoss : alunos){
            resultado += alunoss.getNota();
        }
        return resultado / tamanho;
    }

}
