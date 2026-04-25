//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Guess guessNumber = new Guess();
    int randomNum = guessNumber.randomGuess();
    Scanner scanner = new Scanner(System.in);
    while(true){
        System.out.println("Pick a number in between 1 and 100");
        int number = scanner.nextInt();
        if(number == randomNum){
            System.out.println("You have guessed it right!!");
            break;
        }else if(number <= randomNum + 10 && number >= randomNum-10){
            System.out.println("Hot!");
        }else{
            System.out.println("Cold!");
        }
    }

    scanner.close();
}
