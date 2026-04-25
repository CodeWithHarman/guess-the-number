import java.util.Scanner;

class Game {

    public void start() {
        NumberGenerator generator = new NumberGenerator();
        int MIN = 1;
        int MAX = 100;
        int target = generator.generate(MIN, MAX);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Pick a number between " + MIN + " and " + MAX);

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input!");
                scanner.next();
                continue;
            }

            int guess = scanner.nextInt();

            int RANGE = 10;
            if (guess == target) {
                System.out.println("You guessed it right!");
                break;
            } else if (Math.abs(guess - target) <= RANGE) {
                System.out.println("Hot!");
            } else {
                System.out.println("Cold!");
            }
        }

        scanner.close();
    }
}
