import java.util.Random;

public class Player {
    static Random random = new Random();

    int number;

    void guess(int bound) {
        Random r = new Random();
        number = random.nextInt(bound);
    }
}
