import java.util.Random;

public class GuessGame {
    public static final int MAX = 10;
    Player p1;
    Player p2;
    Player p3;

    void start () {
        Random random = new Random();
        System.out.println("Я загадываю число от 0 до " + MAX);
        int number = random.nextInt(MAX);

        while (true) {
            p1.guess(MAX);
            p2.guess(MAX);
            p3.guess(MAX);

            System.out.println("Первый игрок думает, что это " + p1.number);
            System.out.println("Второй игрок думает, что это " + p2.number);
            System.out.println("Третий игрок думает, что это " + p3.number);

            if (p1.number == number || p2.number == number || p3.number == number) {
                System.out.println("У нас есть победитель!");

                if (p1.number == number) {
                    System.out.println("Первый игрок угадал!");
                }
                if (p2.number == number) {
                    System.out.println("Второй игрок угадал!");
                }
                if (p3.number == number) {
                    System.out.println("Третий игрок угадал!");
                }
                break;
            }

            System.out.println("Никто не угадал.");
            System.out.println("Игроки пробуют еще раз.");
        }

        System.out.println("Конец игры.");
        System.exit(-1);
    }
}
