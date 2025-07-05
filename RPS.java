import java.util.Scanner;
class RPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your choice (rock / paper / scissors): ");
        String user = sc.nextLine();

        String[] options = {"rock", "paper", "scissors"};
        String computer = options[(int) (Math.random() * 3)];

        System.out.println("Computer chose: " + computer);

        if (user.equals(computer)) {
            System.out.println("Draw!");
        } else if ((user.equals("rock")  && computer.equals("scissors")) ||
                (user.equals("paper")    && computer.equals("rock"))     ||
                (user.equals("scissors") && computer.equals("paper"))) {
            System.out.println("🎉🎉🎉Congrats, you win the game");
        } else {
            System.out.println("You lose the game");
        }
    }
}