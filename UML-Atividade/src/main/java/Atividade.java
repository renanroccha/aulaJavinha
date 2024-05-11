public class Atividade {


    private String nomeAtividade;
    private String responsavel;
    private Integer diasEstendidas;
    private Integer diasUsados;

    public Atividade(String nomeAtividade, String responsavel, Integer diasEstendidas) {
        this.nomeAtividade = nomeAtividade;
        this.responsavel = responsavel;
        this.diasEstendidas = diasEstendidas;
        this.diasUsados = 0;

    }

    public void terminarAtividade(Integer diasUsados){
        this.diasUsados = diasUsados;

    }

    public Integer getDiasUsados() {
        return diasUsados;
    }

    public void setDiasUsados(Integer diasUsados) {
        this.diasUsados = diasUsados;
    }

    public void exibirRelatorio(){

        if (diasUsados > diasEstendidas){
            System.out.println("""
                    Você estimou %d dias, mas a tarefa foi feita em %d dias
                     (%d dias a mais que o estimado). Melhore a estimativa.
                    """. formatted(diasEstendidas, diasUsados, (diasUsados - diasEstendidas)));
        } else if (diasUsados < diasEstendidas) {
            System.out.println("""
                    Você estimou %d dias, mas a tarefa foi feita em %d dias
                     (%d dias a mais que o estimado). Parabéns!!!!.
                    """.formatted(diasEstendidas, diasUsados, (diasEstendidas - diasUsados)));

        } else {
            System.out.println("""
                    Você estimou %d dias, mas a tarefa foi feita em %d dias
                     atendendo a estimativa com precisão.
                    """.formatted(diasEstendidas, diasUsados));
        }

    }

    @Override
    public String toString() {
        return """
                
               Nome atividade: %s
               Responsável: %s
               Dias Estimados: %d
               Dias Usados: %d
                
                """.formatted(nomeAtividade , responsavel , diasEstendidas , diasUsados);
    }










}