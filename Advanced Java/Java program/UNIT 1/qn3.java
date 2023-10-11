import java.util.Scanner;
public class qn3{

    public static int addNum(int a, int b){
        return a+b;
    }
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the value of a and b: ");
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("The sum of two numbers is " + qn3.addNum(a,b));
    }
}