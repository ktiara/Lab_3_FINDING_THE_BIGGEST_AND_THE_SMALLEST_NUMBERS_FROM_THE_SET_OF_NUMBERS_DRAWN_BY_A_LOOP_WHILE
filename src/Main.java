import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int collectionSize = 10;

        int number = random.nextInt(100) + 1;
        int min = number;
        int max = number;

        System.out.print(number + ", ");

        int i = 2;

        while (i <= collectionSize) {
            number = random.nextInt(100) + 1;

            System.out.print(number + ", ");

            if(number < min) min = number;
            if(number > max) max = number;
            i++;
        }

        System.out.println("");
        System.out.println("The largest number in the collection is: " + max);
        System.out.println("The smallest number in the set is: " + min);
    }
}