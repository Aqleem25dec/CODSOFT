import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class quiz {
    private static int score = 0;
    private static int questionNumber = 1;

    public static void main(String[] args) {
        Timer timer = new Timer();
        int timeLimit = 60; // Time limit for the quiz in seconds
        timer.schedule(new TimerTask() {
            public void run() {
                endQuiz();
            }
        }, timeLimit * 1000);

        // Quiz questions and answers
        String[] questions = {
            "1. What is the capital of France?\nA. Paris\nB. London\nC. Berlin\nD. Madrid",
            "2. Which planet is known as the Red Planet?\nA. Mars\nB. Venus\nC. Jupiter\nD. Saturn",
            "3. What is the chemical symbol for gold?\nA. Au\nB. Ag\nC. Fe\nD. Hg"
        };
        char[] correctAnswers = {'A', 'A', 'A'};

        Scanner scanner = new Scanner(System.in);

        for (String question : questions) {
            System.out.println(question);
            char userAnswer = scanner.nextLine().toUpperCase().charAt(0);
            if (userAnswer == correctAnswers[questionNumber - 1]) {
                score++;
            }
            questionNumber++;
        }

        endQuiz();
    }

    private static void endQuiz() {
        System.out.println("Quiz ended! Your score is: " + score);
        System.exit(0);
    }
}