import java.util.Random;

public class Player {
    static Random random = new Random();

    int number = 0;

    void guess(int bound) {
        number = random.nextInt(bound);
    }
}
