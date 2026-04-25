import java.util.Random;

class NumberGenerator {
    public int generate(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }
}
