import java.util.Random;

public class Player {
    static Random random = new Random();

    int number;

    void guess(int bound) {
        number = random.nextInt(bound);
    }
}
