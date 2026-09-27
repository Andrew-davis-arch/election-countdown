import java.util.Scanner;
public class Easy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the first number");
        a = input.nextInt();
        System.out.println("Enter the second number");
        b = input.nextInt();
        c = a+b;
        System.out.println("Add="+c);
    }
}
