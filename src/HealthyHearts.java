import java.util.Scanner;

class HealthyHeart {
    private int age;

    public HealthyHeart(int age) {
        setAge(age);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int getMaxHeartRate() {
        return 220 - getAge();
    }

    public String getTargetHeartRate() {
        return String.format("%.0f - %.0f", getMaxHeartRate() * 0.5, getMaxHeartRate() * 0.85);
    }
}


public class HealthyHearts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age = input.nextInt();
        HealthyHeart p = new HealthyHeart(age);
        System.out.printf("Your maximum heart rate should be %d beats per minute\n", p.getMaxHeartRate());
        System.out.printf("Your target HR zone is %s beats per minute\n", p.getTargetHeartRate());
    }
}