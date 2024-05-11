import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;
import java.util.Scanner;
import java.util.Timer;

public class DataTeste {

    public static void main(String[] args) {


       LocalDate data = LocalDate.now();

        System.out.println(data);

        LocalDateTime time = LocalDateTime.now();

        System.out.println(time);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.forLanguageTag("PT-BR"));

        System.out.println(format.format(data));


        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss", Locale.forLanguageTag("PT-BR"));


        System.out.println(formatTime.format(time));


        System.out.println(data.minusYears(1));
        System.out.println(data.minusMonths(1));
        System.out.println(data.minusWeeks(1));
        System.out.println(data.minusDays(1));
        System.out.println(data.plusYears(1));
        System.out.println(data.plusMonths(1));
        System.out.println(data.plusWeeks(1));
        System.out.println(data.plusDays(1));



  LocalDate dataManipulada = LocalDate.of(2001 , 9 , 11);

  if (dataManipulada.isAfter(data)){
      System.out.println("Vish deu ruim");
  } else if (dataManipulada.isAfter(data)) {
      System.out.println("Deu mais ruim");
  }else System.out.println("pior ainda");


        Scanner in =new Scanner(System.in);

        System.out.println("Qual sua data de nascimento");
        LocalDate dataNascimento = LocalDate.parse(in.nextLine(), format);

        System.out.println("Sua data de nascimento é %s".formatted(dataNascimento.toString()));



    }


}
