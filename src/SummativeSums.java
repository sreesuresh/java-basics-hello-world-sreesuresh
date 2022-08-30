public class SummativeSums {
    // method to add elements of array will return sum of elements of array
    static int addArray(int arrayOfInts[]) {
        int sum = 0;
        for (int i = 0; i < arrayOfInts.length; i++) {
            sum = sum + arrayOfInts[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int arrayOfIntsA[] = {1, 90, -33, -55, 67, -16, 28, -55, 15};
        int arrayOfIntsB[] = {999, -60, -77, 14, 160, 301};
        int arrayOfIntsC[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99};
        // print all array sum
        System.out.println("\n#1 Array Sum: " + addArray(arrayOfIntsA));
        System.out.println("#2 Array Sum: " + addArray(arrayOfIntsB));
        System.out.println("#3 Array Sum: " + addArray(arrayOfIntsC));

    }

}