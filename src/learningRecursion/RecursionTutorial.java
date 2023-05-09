package learningRecursion;

public class RecursionTutorial {
    public  static void main(String[] args) {
        sayHi(3);
    }
    private static  void sayHi(int count) {
        System.out.println("Hi!");

        if  (count <= 1)     {//base case
            return;
        }
        sayHi(count - 1);//a way to achieve the base case
    }
}

