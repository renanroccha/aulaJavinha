import java.math.BigDecimal;

public class OperadoresMatematicos {
    public static void main(String[] args) {
        // No JS:
        // + (soma)
        // - (subtração)
        // / (divisão)
        // * (multiplicação)
        // % (resto)
        // ++ (soma 1)
        // -- (subtrai 1)
        // += (mais igual)
        // -= (menos igual)
        // No Java, é a mesma coisa, menos a potencia (**), esse não tem no Java

        Double numero01 = 42.0;
        Double numero02 = 2.0;

        System.out.println("Soma: " + (numero01 + numero02));
        System.out.println("Multiplicação: " + (numero01 * numero02));
        System.out.println("Divisão: " + (numero01 / numero02));
        System.out.println("Subtração: " + (numero01 - numero02));

        Double resultadoPotencia = Math.pow(numero01, numero02);
        System.out.println("Potência: " + resultadoPotencia);

        // Sem guardar em variável
        System.out.println("Potência: " + Math.pow(numero01, numero02));
    }
}
