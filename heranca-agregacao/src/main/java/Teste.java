public class Teste {
    public static void main(String[] args) {

        ContaBancaria contaBancaria01 = new ContaBancaria("Renan");
        ContaCorrente contaCorrente01 = new ContaCorrente("Renan" , 500.0);
        Banco banco01 = new Banco("C6 Bank");

        System.out.println(contaBancaria01);
        System.out.println(banco01);
    }
}
