public class ScoreTracker {

    private static int aptitudeScore = -1;

    public static void addAptitudeScore(int score) {
        aptitudeScore = score;
    }

    public static void showScore() {
        System.out.println("\n==========================================");
        System.out.println("           YOUR SCORE CARD 📊             ");
        System.out.println("==========================================");

        if (aptitudeScore == -1) {
            System.out.println("⚠️  You haven't taken the Aptitude Quiz yet!");
            System.out.println("   Go to Menu → Option 2 to take the quiz.");
        } else {
            System.out.println("📝 Aptitude Quiz Score : " + aptitudeScore + " / 10");

            int percent = aptitudeScore * 10;
            System.out.println("📊 Percentage          : " + percent + "%");

            System.out.print("🏆 Grade               : ");
            if (percent >= 80) {
                System.out.println("A+ (Excellent!)");
            } else if (percent >= 60) {
                System.out.println("B  (Good)");
            } else if (percent >= 40) {
                System.out.println("C  (Average - Keep Practicing)");
            } else {
                System.out.println("D  (Needs Improvement)");
            }

            System.out.println("\n💡 Tip: Practice more DSA and Aptitude daily!");
            System.out.println("   Target: 8+ correct answers before placement.");
        }

        System.out.println("==========================================");
    }
}
