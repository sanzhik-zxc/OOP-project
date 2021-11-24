import java.nio.charset.Charset;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Television TV = new Television(2, 10);
        Channel[] arrChannel = new Channel[TV.maxChannels];

        arrChannel[0] = Channel.addChannel("Первый канал");
        arrChannel[1] = Channel.addChannel("Россия 1");
        arrChannel[2] = Channel.addChannel("СТС");
        arrChannel[3] = Channel.addChannel("ТНТ");
        arrChannel[4] = Channel.addChannel("РЕН ТВ");
        arrChannel[5] = Channel.addChannel("НТВ");
        arrChannel[6] = Channel.addChannel("Россия 24");
        arrChannel[7] = Channel.addChannel("Карусель");
        arrChannel[8] = Channel.addChannel("Disney");
        arrChannel[9] = Channel.addChannel("Nickelodeon");

        System.out.println("+----------------------------------+");
        System.out.println("| Следующий канал (+)              |");
        System.out.println("| Предыдущий канал (-)             |");
        System.out.println("| Переключение по номеру (number)  |");
        System.out.println("| Показать текущий канал (*)       |");
        System.out.println("| Показать канал по его номеру (/) |");
        System.out.println("| Выключить телевизор (off)        |");
        System.out.println("+----------------------------------+");
        TV.outputChannel(arrChannel);

        String ch = " ";
        while (!ch.equals("off")) {
            if (!ch.equals("")) {
                System.out.print("Выберите действие: ");
                ch = scanner.nextLine();
            } else {
                ch = scanner.nextLine();
            }
            choiceMenu(scanner, TV, arrChannel, ch);
        }

        scanner.close();

    }

    public static void choiceMenu(Scanner scanner, Television TV, Channel[] arrChannel, String ch) {
        int n;
        switch (ch) {
            case "+":
                TV.nextChannel();
                TV.outputChannel(arrChannel);
                break;
            case "-":
                TV.prevChannel();
                TV.outputChannel(arrChannel);
                break;

            case "number":
                n = -1;
                while (!(n >= 0 && n <= 9)) {
                    System.out.print("Выберите канал: ");
                    n = scanner.nextInt();
                }
                TV.numberChannel(n);
                TV.outputChannel(arrChannel);
                break;

            case "*":
                TV.outputChannel(arrChannel);
                break;

            case "/":
                n = -1;
                while (!(n >= 0 && n <= 9)) {
                    System.out.print("Введите номер канала: ");
                    n = scanner.nextInt();
                }
                TV.outputChannelNumber(arrChannel, n);
                break;

            case "":
            case "off":
                break;

            default:
                System.out.println("Введите корректные данные");
                break;
        }
    }
}


