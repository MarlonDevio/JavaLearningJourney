package controlFlow;

public class Loops {
    public static void main(String[] args) {
        boolean notFound = true;
        while (notFound) {
            int randomNr = (int) (Math.random() * 5);
            System.out.println("Value: " + randomNr);
            if (randomNr == 4) {
                notFound = false;
            }
        }
        int count = 0;
        do {
            count++;
            System.out.println("Count is: " + count);
        } while (count < 10);

        int[] nrs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int search = 8;
        int index = -1;
        for (int i = 0; i < nrs.length; i++) {
            if (nrs[i] == search) {
                index = i;
                System.out.println(index);
            }
        }
        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <= 10; col++) {
                System.out.printf("%4d", row * col);
            }
            System.out.println();
        }

        for (int row = 1; row <= 5; row++) {
            for (int col = 2; col <= 20; col++) {
                System.out.printf("%4d", row * col);
            }
            System.out.println();
        }

        String[] names = {"Marlon", "Patty", "Karin"};
        for (String name : names){
            System.out.println(name);
        }

        int[] numbers = {2,5,6,7,9};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);

    }


}
