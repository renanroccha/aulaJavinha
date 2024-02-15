import java.util.concurrent.ThreadLocalRandom;

public class newProject {
    public static void main(String[] args) {

        Integer numero1 = 10;

        Integer numero2 = 10;

        if (numero1 < numero2) {

            System.out.println("numero1 é menor que numero2");
        } else if (numero1.equals(numero2)) {
            System.out.println("iguais");
        } else {
            System.out.println("numero2 é menor que numero1");
        }

        String nome1 = "Renan";
        String nome2 = "Rena";

        // não use == e sim equals
        // && || eles continuam funcionando aqui
        // ! serve para negar usar começo não use

        if (!nome1.equals(nome2)) {
            System.out.println("nome igual");
        } else {
            System.out.println("nome diferente");


        }

        Integer numero01 = ThreadLocalRandom.current().nextInt(-500, 80);
        System.out.println(numero01);

        Double sorteioQuebrado = ThreadLocalRandom.current().nextDouble(0, 88.8);{
            System.out.println(sorteioQuebrado);
    }



    }

}

