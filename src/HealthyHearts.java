import java.util.Scanner;
public class HealthyHearts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age = input.nextInt();
        HealthyHeartsVariables result = new HealthyHeartsVariables(age);
        System.out.printf("Your maximum heart rate should be %d beats per minute\n", result.getMaxHeartRate());
        System.out.printf("Your target HR zone is %s beats per minute\n", result.getTargetHeartRate());
    }
}