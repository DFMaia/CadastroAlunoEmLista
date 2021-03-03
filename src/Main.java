public class Main {

    public static void main(String[] args) {


        CadastroAlunos c = new CadastroAlunos();
        c.cadastrarAluno("Diego Maia", 80, "6");
        c.cadastrarAluno("Iago Henrique", 70, "6");

        c.listaDeAlunos();
        c.listaOrdenadaPelaMaiorNota();
        System.out.println(c.mediaDasNotas());

    }

}
