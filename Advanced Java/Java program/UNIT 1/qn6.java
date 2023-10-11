public class qn6 {
    
    public static int AddArray(int[] numbers){
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            sum+=numbers[i];
        }
        return sum;
    }
    public static void main(String args[])
    {
        int[] numbers={2,3,5,6,8};
        System.out.println("Sum of the array = "+qn6.AddArray(numbers));
    }
}
