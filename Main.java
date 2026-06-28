import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==========================================");
        System.out.println("   WELCOME TO PLACEMENT PREPARATION TOOL ");
        System.out.println("==========================================");

        int choice = 0;
        while (choice != 5) {
            System.out.println("\n📚 MAIN MENU");
            System.out.println("1. DSA Practice Questions");
            System.out.println("2. Aptitude Quiz");
            System.out.println("3. HR Interview Q&A");
            System.out.println("4. View My Score");
            System.out.println("5. Exit");
            System.out.print("\nEnter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    DSAQuestions.start(sc);
                    break;
                case 2:
                    AptitudeQuiz.start(sc);
                    break;
                case 3:
                    HRInterview.start(sc);
                    break;
                case 4:
                    ScoreTracker.showScore();
                    break;
                case 5:
                    System.out.println("\n✅ Thank you! Best of luck for your Placements! 🎯");
                    break;
                default:
                    System.out.println("❌ Invalid choice. Please try again.");
            }
        }
        sc.close();
    }
}
