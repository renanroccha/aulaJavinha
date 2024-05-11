public class Loja {

    private String nomeLoja;

    private Integer qtdVendas;

    private Integer qtdMetaVendas;

    private Double valorTotalVendas;

    public Loja(String nomeLoja, Integer qtdMetaVendas) {
        this.nomeLoja = nomeLoja;
        this.qtdVendas = 0;
        this.qtdMetaVendas = qtdMetaVendas;
        this.valorTotalVendas = 0.0;
    }

   // public void totalDeTudo(Integer qtdVendas, Double valorTotalVendas){
     //   this.qtdVendas = qtdVendas;
       // this.valorTotalVendas = valorTotalVendas;

  //  }



    public Double getValorTotalVendas() {
        return valorTotalVendas;
    }

    public void setValorTotalVendas(Double valorTotalVendas) {
        this.valorTotalVendas = valorTotalVendas;
    }



   public void realizarVenda(Double valorVenda){
     realizarVenda(valorVenda, 0.0);
    }

   public void realizarVenda(Double valorVenda , Double valorDesconto){
      Double valorDescontado = valorVenda - valorDesconto;
      valorTotalVendas += valorDescontado;
      qtdVendas ++;
    }


   public Boolean verificarMeta(){

//        if (qtdVendas < qtdMetaVendas){
//            System.out.println("""
//                    A sua meta é %s
//                    Você atingiu %s
//                    Você não chegou lá falta: %d vendas
//                    """.formatted(qtdMetaVendas , qtdVendas , (qtdMetaVendas - qtdVendas)));
//
//        } else if (qtdVendas > qtdMetaVendas) {
//            System.out.println("""
//                     A sua meta é %s
//                     Você atingiu %s
//                     Parábens você passou do seu objetivo: %d vendas a mais
//                    """.formatted(qtdMetaVendas, qtdVendas , (qtdVendas - qtdMetaVendas)));
//
//        }else {
//            System.out.println("""
//                    Você atigiu a meta exata!
//                    """);
//        }


        if (valorTotalVendas >= qtdMetaVendas){
            return true;
        }else{
            return false;
        }
   }

    @Override
    public String toString() {
        if (verificarMeta()) {
            return """
                    A sua meta era: %d
                    Você atingiu: %.2f
                    Parábens você passou do seu objetivo: %.2f vendas a mais
                    """.formatted(qtdMetaVendas, valorTotalVendas, (valorTotalVendas - qtdMetaVendas));
        }else {
            return """
                    A sua meta era: %d
                    Você atingiu: %.2f
                    Você não atingiu a meta faltou %.2f
                    """.formatted(qtdMetaVendas , valorTotalVendas , (qtdMetaVendas - valorTotalVendas));
        }
    }
}
