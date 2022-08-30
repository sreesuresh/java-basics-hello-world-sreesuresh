import java.util.Scanner;
//Creating a class for variables.
class HealthyHeartsVariables {
    static int heartRateMax = 220;
    static double initialTargetHeartRateZone = 0.5;
    static double finalTargetHeartRateZone = 0.85;
    private int age;

    public HealthyHeartsVariables(int age) {
        setAge(age);
    }

    public void setAge(int age) {
        this.age = age;
    }
    //Creating a function to calculate the maximum heart rate.
    public int getMaxHeartRate() {
        return (heartRateMax - age);
    }
    //Creating a function to calculate Target Heart Rate
    public String getTargetHeartRate() {
        return String.format("%.0f - %.0f", getMaxHeartRate() * initialTargetHeartRateZone, getMaxHeartRate() * finalTargetHeartRateZone);
    }
}

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