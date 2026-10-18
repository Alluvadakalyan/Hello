
import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "Which language is used for Android apps?",
            "Which keyword creates a class in Java?",
            "Which is the entry point of Java?",
            "Which data type stores true or false?",
            "Which symbol ends most Java statements?"
        };

        String[][] options = {
            {"A. Python", "B. Java", "C. HTML", "D. SQL"},
            {"A. function", "B. define", "C. class", "D. create"},
            {"A. start()", "B. run()", "C. main()", "D. begin()"},
            {"A. int", "B. String", "C. char", "D. boolean"},
            {"A. .", "B. ,", "C. ;", "D. :"}
        };

        char[] answers = {'B', 'C', 'C', 'D', 'C'};
        int score = 0;

        System.out.println("=== JAVA QUIZ APPLICATION ===");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQ" + (i + 1) + ". " + questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Your answer (A/B/C/D): ");
            String input = sc.nextLine().trim().toUpperCase();

            while (!input.matches("[ABCD]")) {
                System.out.print("Enter A, B, C, or D: ");
                input = sc.nextLine().trim().toUpperCase();
            }

            if (input.charAt(0) == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println(
                    "Wrong! Correct answer: " + answers[i]
                );
            }
        }

        System.out.println("\n=== QUIZ RESULT ===");
        System.out.println("Total Questions: " + questions.length);
        System.out.println("Correct Answers: " + score);
        System.out.println("Wrong Answers: "
                + (questions.length - score));
        System.out.printf("Percentage: %.1f%%%n",
                score * 100.0 / questions.length);

        sc.close();
    }
}
