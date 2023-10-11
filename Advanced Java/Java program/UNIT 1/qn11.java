import java.util.Scanner;

public class qn11 {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a = obj.nextInt();
        System.out.println("Enter the value of b : ");
        int b = obj.nextInt();

        try{
            int res =  a/b;
            String str =  String.format("The quotient is %d",res);
            System.out.println(str);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        finally{
            int sum = a + b;
            System.out.println("The Final result is " + sum);
        }
        
    }
}
