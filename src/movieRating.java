import java.util.Scanner;
import java.lang.Math;

public class movieRating {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the movie name");
        String movieName = userInput.nextLine();
        System.out.println(System.lineSeparator());
        System.out.println("Please enter the running time in minutes.");
        int movieMinutes = userInput.nextInt();
        System.out.println(System.lineSeparator());
        System.out.println("Please enter ratings from the movie review website.");
        int movieRating_1 = userInput.nextInt();
        int movieRating_2 = userInput.nextInt();
        int movieRating_3 = userInput.nextInt();
        System.out.println(System.lineSeparator());
        System.out.println("Please enter ratings from the focus group.");
        double focusRating_1 = userInput.nextDouble();
        double focusRating_2 = userInput.nextDouble();
        System.out.println(System.lineSeparator());
        System.out.println("Please enter the average movie critic rating.");
        double criticRating = userInput.nextDouble();
        System.out.println(System.lineSeparator());
        // Math for getting the movie's runtime in hours and minutes
        int movieRemainder = movieMinutes % 60;
        int movieHours = (movieMinutes - movieRemainder) / 60;

        // Math for the rating's weighted average
        double ratingAverage = (movieRating_1 + movieRating_2 + movieRating_3) / 3.0;
        double focusAverage = (focusRating_1 + focusRating_2) / 2.0;
        double weightedAverage = (ratingAverage * 0.2) + (focusAverage * 0.3) + (criticRating * 0.5);

        System.out.println("Title: " + movieName);
        System.out.println("Running Time: " + movieHours + "h " + movieRemainder);
        System.out.println("Average website rating: " + ratingAverage);
        System.out.println("Average focus group rating: " + focusAverage);
        System.out.println("Average movie critic rating: " + criticRating);
        System.out.println("Overall movie rating: " + Math.round(weightedAverage));
    }
}
