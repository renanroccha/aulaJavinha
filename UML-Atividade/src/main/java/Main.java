public class Main {

    public static void main(String[] args) {


        Atividade atividade01 = new Atividade("Dar banho no peixe"
                , "Willian" , 8);


        atividade01.terminarAtividade(8);
        System.out.println(atividade01);

        atividade01.exibirRelatorio();

        System.out.println(atividade01.toString());


    }

}
