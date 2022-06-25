import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Application {

    public static void main(String[] args) {
        //apiAntiga();
        //apiNova();
        //formasInstanciar();
        //apiNovaOperacoes();
        apiNovaCalculos();

    }

    public Application() {
    }

    private static void apiNovaCalculos() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate dataFinal = dataAtual.plusYears(14);

        Period period = Period.between(dataAtual, dataFinal);
        System.out.println(dataAtual);
        System.out.println(dataFinal);
        System.out.println("Quantidade Meses: " + period.toTotalMonths());
    }

    private static void formasInstanciar() {
        LocalDate localDate = LocalDate.now();
        System.out.println("Data Atual: " + localDate);

        LocalDate dataManual = LocalDate.of(2022, 12, 30);
        System.out.println("Nome do mês: " + dataManual.getMonth().name());

        LocalDate dateFromString = LocalDate.parse("1988-11-20");
        System.out.println("Nome do mês: " + dateFromString.getMonth().name());

        var formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var dataNascimento = LocalDate.parse("01/02/2022", formatador);
        System.out.println("Nome do mês: " + dataNascimento.getMonth().name());
    }

    private static void apiNovaOperacoes() {
        LocalDate localDate = LocalDate.now();
        System.out.println("Data Atual: " + localDate);
        System.out.println("Dia da semana: " + localDate.getDayOfWeek().name());
        System.out.println("Nome do mês: " + localDate.getMonth().name());
    }

    private static void apiNova() {
        LocalDate dataAtual = LocalDate.now();
        LocalDateTime horaAtual = LocalDateTime.now();
        System.out.println("Data Atual: " + dataAtual);
        System.out.println("Hora atual: " + horaAtual);
    }

    private static void apiAntiga() {
        Date date = new Date(2022-1900, 11, 10, 16, 40);
        System.out.println(date.toString());
    }

}
