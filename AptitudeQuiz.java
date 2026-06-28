import java.util.Scanner;

public class AptitudeQuiz {

    static String[] questions = {
        "1. A train travels 60 km in 1 hour. How far will it travel in 3.5 hours?",
        "2. What is 15% of 200?",
        "3. If A can do a job in 10 days and B in 15 days, how many days together?",
        "4. The ratio of 3:4 = ? : 20",
        "5. A shopkeeper buys an item for Rs.80 and sells for Rs.100. Profit %?",
        "6. Simple Interest on Rs.1000 at 5% per year for 2 years?",
        "7. Find the next number: 2, 4, 8, 16, ?",
        "8. If 6 workers complete a job in 12 days, how many days for 9 workers?",
        "9. A man walks 4 km north, then 3 km east. Distance from start?",
        "10. What is the LCM of 4 and 6?"
    };

    static String[][] options = {
        {"A) 200 km", "B) 210 km", "C) 220 km", "D) 180 km"},
        {"A) 20",     "B) 30",     "C) 25",     "D) 35"},
        {"A) 5 days", "B) 6 days", "C) 7 days", "D) 8 days"},
        {"A) 12",     "B) 15",     "C) 16",     "D) 18"},
        {"A) 20%",    "B) 25%",    "C) 30%",    "D) 15%"},
        {"A) Rs.50",  "B) Rs.100", "C) Rs.150", "D) Rs.200"},
        {"A) 30",     "B) 32",     "C) 28",     "D) 34"},
        {"A) 6 days", "B) 8 days", "C) 9 days", "D) 10 days"},
        {"A) 5 km",   "B) 6 km",   "C) 7 km",   "D) 4 km"},
        {"A) 8",      "B) 10",     "C) 12",     "D) 24"}
    };

    static char[] answers = {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'A', 'C'};

    static String[] explanations = {
        "60 km/hr × 3.5 hrs = 210 km",
        "15/100 × 200 = 30",
        "Together = (10×15)/(10+15) = 150/25 = 6 days",
        "3:4 = 15:20, so answer is 15",
        "Profit = 100-80 = 20, Profit% = (20/80)×100 = 25%",
        "SI = (1000×5×2)/100 = Rs.100",
        "Pattern: ×2 each time → 16×2 = 32",
        "Work = 6×12 = 72 man-days, 72/9 = 8 days",
        "Distance = √(4²+3²) = √(16+9) = √25 = 5 km",
        "LCM(4,6) = 12"
    };

    public static void start(Scanner sc) {
        System.out.println("\n==========================================");
        System.out.println("           APTITUDE QUIZ 🧠               ");
        System.out.println("==========================================");
        System.out.println("10 Questions | Choose A, B, C, or D\n");

        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String opt : options[i]) {
                System.out.println("   " + opt);
            }
            System.out.print("Your Answer: ");
            char userAnswer = sc.next().toUpperCase().charAt(0);

            if (userAnswer == answers[i]) {
                System.out.println("✅ Correct!\n");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct Answer: " + answers[i]);
                System.out.println("💡 " + explanations[i] + "\n");
            }
        }

        System.out.println("==========================================");
        System.out.println("   YOUR APTITUDE SCORE: " + score + " / 10");
        System.out.println("==========================================");

        if (score >= 8) {
            System.out.println("🌟 Excellent! You are placement ready!");
        } else if (score >= 5) {
            System.out.println("👍 Good! Keep practicing more!");
        } else {
            System.out.println("💪 Keep going! Practice makes perfect!");
        }

        ScoreTracker.addAptitudeScore(score);
    }
}
