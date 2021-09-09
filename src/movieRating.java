import java.util.Scanner;

public class movieRating {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the movie name");
        String movieName = userInput.nextLine();

        System.out.println("Please enter the running time in minutes.");
        int movieMinutes = userInput.nextInt();

        System.out.println("Please enter ratings from the movie review website.");
        int movieRating_1 = userInput.nextInt();
        int movieRating_2 = userInput.nextInt();
        int movieRating_3 = userInput.nextInt();

        System.out.println("Please enter ratings from the focus group.");
        double focusRating_1 = userInput.nextDouble();
        double focusRating_2 = userInput.nextDouble();

        System.out.println("Please enter the average movie critic rating.");
        double criticRating = userInput.nextDouble();

        System.out.println("Title: " + movieName);
        System.out.println("Running Time: ");

    }
}
