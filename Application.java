import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        //apiAntiga();
        //apiNova();
        //formasInstanciar();
        //apiNovaOperacoes();
        //apiNovaCalculos();
        //fusoHorario();
        exemploInstant();
        //ex1CalculaIdade();
    }

    private static void exemploInstant() {
        Instant ininial = Instant.now();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Instant instFinal = Instant.now();
        Duration duration = Duration.between(ininial, instFinal);
        System.out.println("Tempo execução: " + duration.toSeconds());
    }

    private static void fusoHorario() {
        var dataHoraAtual = LocalDateTime.of(2022, Month.JUNE, 20, 22, 00);
        ZoneId fusoSaoPaulo = ZoneId.of("America/Sao_Paulo");
        ZonedDateTime horaSaoPaulo = ZonedDateTime.of(dataHoraAtual, fusoSaoPaulo);
        System.out.println("Hora São Paulo: " + horaSaoPaulo);


        ZoneId fusoParis = ZoneId.of("Europe/Paris");
        LocalDateTime hora2 = LocalDateTime.now(fusoParis);
        System.out.println("Teste hora paris: " + hora2);

        ZonedDateTime horaParis = ZonedDateTime.of(dataHoraAtual, fusoParis);
        System.out.println("Hora Paris: " + horaParis);

        Duration diferencaHoras = Duration.between(hora2, LocalDateTime.now());
        System.out.println("Diferença de fuso SP/Paris: " + diferencaHoras.toHours());
    }

    private static void ex1CalculaIdade() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite a data de seu nascimento (dd/mm/yyyy): ");

        var dataAtual = LocalDate.now();

        LocalDate nascimento = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Period period = Period.between(nascimento, dataAtual);
        System.out.printf("Idade: %d anos %d meses %d dias", period.getYears(), period.getMonths(), period.getDays());
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
        System.out.println("Tempo: " + date.getTime());
    }

}
