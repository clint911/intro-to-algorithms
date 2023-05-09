package learningRecursion;

public class ClintonTriedRecursion {
    public  static  void main(String[] args)  {
        System.out.println(fibonacciCalculator(10));
    }
    public static long fibonacciCalculator(int index) {
        //set up the base case
        if (index == 1) {
            return 0;
        } else if (index == 2) {
            return  1;
        }
        return  fibonacciCalculator(index - 1) + fibonacciCalculator(index - 2);
    }
}
