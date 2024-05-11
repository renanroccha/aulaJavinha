public class TesteContato {
    public static void main(String[] args) {



        Contato contato01 = new Contato("Manoel" , "123");
        Contato contato02 = new Contato("Renan" , "127");
        Contato contato03 = new Contato("Mih" , "002");
        Contato contato04 = new Contato("Micha" , "003");
        Contato contato05 = new Contato("Mucha" , "005");
        Grupo grupoDoZap = new Grupo("Grupo da Família");
        Grupo trampo = new Grupo("Grupo da ViaTech");

        System.out.println(contato01.toString());

        grupoDoZap.adicionarContato(contato01);
        grupoDoZap.adicionarContato(contato02);
        grupoDoZap.adicionarContato(contato04);
        grupoDoZap.adicionarContato(contato05);

     //   System.out.println(grupoDoZap);


        trampo.adicionarContato(contato01);
        trampo.adicionarContato(contato03);

    //    System.out.println(trampo);


        System.out.println(grupoDoZap.buscarContatoNome("Mi"));



    }
}
