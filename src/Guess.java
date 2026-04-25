import java.util.Random;

public class Guess {
    public Guess(){
    }

    public int randomGuess(){
        int min =1;
        int max = 100;
        Random random = new Random();
        return random.nextInt(max) + 1;
    }
}
