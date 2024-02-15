import java.util.concurrent.ThreadLocalRandom;

public class lacoRepeticao {

    public static void main(String[] args) {

        for (Integer i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        for (Integer i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        Integer contador = 0;
        while (contador <= 10){
            System.out.println(contador);
            contador++;
        }

        Integer numeroAleatorio = 1;
        while (numeroAleatorio != 0) {
            System.out.println(numeroAleatorio);
            numeroAleatorio = ThreadLocalRandom.current().nextInt(0,11);
        }

        Integer numeroAleatorio2 ;
        do {
            numeroAleatorio2 = ThreadLocalRandom.current().nextInt(0,11);
            System.out.println(numeroAleatorio2);
        } while (numeroAleatorio2 != 0);
    }}
