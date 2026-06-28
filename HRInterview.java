import java.util.Scanner;

public class HRInterview {

    static String[][] qa = {
        {
            "Tell me about yourself.",
            "Start with your name, education, skills, and a brief about your projects.\n" +
            "   Example: 'I am [Name], a final year Computer Science student from [College].\n" +
            "   I have strong knowledge in Java and DSA. I have built a Placement Helper\n" +
            "   project that helps students prepare for campus placements.'"
        },
        {
            "What are your strengths?",
            "Pick 2-3 real strengths with examples.\n" +
            "   Example: 'My strengths are problem-solving, quick learning, and teamwork.\n" +
            "   I solved 100+ DSA problems on LeetCode and always help teammates debug code.'"
        },
        {
            "What are your weaknesses?",
            "Mention a real weakness but show how you are improving it.\n" +
            "   Example: 'I used to struggle with time management, but I now use a daily\n" +
            "   schedule and task list to stay productive and meet deadlines.'"
        },
        {
            "Why do you want to join our company?",
            "Research the company and connect it to your goals.\n" +
            "   Example: 'I admire [Company]'s focus on innovation and learning culture.\n" +
            "   I want to grow as a developer and contribute to real-world impactful products.'"
        },
        {
            "Where do you see yourself in 5 years?",
            "Show ambition but be realistic.\n" +
            "   Example: 'In 5 years, I see myself as a skilled software engineer, possibly\n" +
            "   leading a team. I want to master full-stack development and system design.'"
        },
        {
            "Why should we hire you?",
            "Highlight your unique value.\n" +
            "   Example: 'I have strong Java and DSA skills, I learn quickly, and I am\n" +
            "   passionate about building useful software. I bring dedication and a\n" +
            "   problem-solving mindset to every task.'"
        },
        {
            "Tell me about a challenge you faced and how you solved it.",
            "Use the STAR method: Situation, Task, Action, Result.\n" +
            "   Example: 'During my project, the database was slow. I identified the issue,\n" +
            "   optimized the queries, and reduced load time by 40%. This taught me the\n" +
            "   importance of performance testing.'"
        },
        {
            "Are you a team player or prefer working alone?",
            "Show flexibility.\n" +
            "   Example: 'I enjoy both. In team projects, I collaborate and communicate well.\n" +
            "   For focused coding tasks, I work independently. I adapt based on the need.'"
        },
        {
            "Do you have any questions for us?",
            "Always ask 1-2 smart questions.\n" +
            "   Example: 'What does a typical day look like for a developer here?\n" +
            "   What technologies does your team currently use?' — This shows genuine interest."
        },
        {
            "What is your expected salary?",
            "Research market standards and be confident.\n" +
            "   Example: 'Based on my skills and market research, I am expecting around\n" +
            "   [X] LPA. However, I am open to discussing based on your company structure.'"
        }
    };

    public static void start(Scanner sc) {
        System.out.println("\n==========================================");
        System.out.println("       HR INTERVIEW PREPARATION 🎤        ");
        System.out.println("==========================================");
        System.out.println("1. View All HR Questions & Sample Answers");
        System.out.println("2. Back to Main Menu");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();
        if (choice == 1) {
            showAll();
        }
    }

    public static void showAll() {
        System.out.println("\n📋 TOP 10 HR INTERVIEW QUESTIONS\n");
        for (int i = 0; i < qa.length; i++) {
            System.out.println("Q" + (i + 1) + ": " + qa[i][0]);
            System.out.println("   💬 Sample Answer:\n   " + qa[i][1]);
            System.out.println("------------------------------------------");
        }
    }
}
