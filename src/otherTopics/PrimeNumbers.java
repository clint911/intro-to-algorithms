package otherTopics;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("please input the limit");
    Scanner scanner = new Scanner(System.in);
    int limit = scanner.nextInt();
        //A Prime number is greater than 1 but only divisible by one or itself
        List<Integer> primeNumbers = new ArrayList<>();
        for (int numberToCheck = 2;numberToCheck <= limit; numberToCheck++ )  {
            boolean isPrime = true;
           for (int factor = 2; factor <= numberToCheck / 2; factor++)      {
                if (numberToCheck % factor == 0)    {
                    isPrime = false;
                    break;
                }
           }

           if (isPrime) {
               primeNumbers.add(numberToCheck);
           }
        }
        System.out.println("Prime numbers from 1 to limit are: ");
        for     (int number: primeNumbers)  {
            System.out.println(number);
        }
    }
}
