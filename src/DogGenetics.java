import java.util.Random;
import java.util.Scanner;

public class DogGenetics {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your dog's name?");
// Entering name of dog
        String name = input.nextLine();
        System.out.println("Well then, I have this highly reliable report on " + name + "'s prestigious background right here.");
        System.out.println("\n" + name + " is\n");
//Generating random numbers
        Random ran = new Random();
        int sum = 0;
        int dog1 = 0;
        int dog2 = 0;
        int dog3 = 0;
        int dog4 = 0;
        int dog5 = 0;
        while (sum != 100) {
            dog1 = ran.nextInt(100);
            dog2 = ran.nextInt(100 - dog1);
            dog3 = ran.nextInt(100 - dog2);
            dog4 = ran.nextInt(100 - dog3);
            dog5 = ran.nextInt(100 - dog4);
            sum = dog1 + dog2 + dog3 + dog4 + dog5;
        }

        System.out.println(dog1 + "% St. Bernard");
        System.out.println(dog2 + "% Chihuahua");
        System.out.println(dog3 + "% Dramatic RedNosed Asian Pug");
        System.out.println(dog4 + "% Common Cur");
        System.out.println(dog5 + "% King Doberman");
        System.out.println("\nWow, that's QUITE the dog!");
    }
}