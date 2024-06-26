import java.util.Scanner;

public class Test {
    static void testMethod() {
        System.out.println("This is just a test");
        String testTwo = "but is it really a test?";
        System.out.println(testTwo);
    }
    static void fuckAround(){
        System.out.println("Input your calculation below.");
    }
     static void calculator() {
         Scanner scanner = new Scanner(System.in);
         int number;
         number = scanner.nextInt();
      scanner.close();
    }
    public static void main(String[] args) {
         fuckAround();
         testMethod();
         testMethod();
         testMethod();
         calculator();
    }
}