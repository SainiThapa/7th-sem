public class qn1{
    public int balancedornot(int[] numbers)
    {
        for(int i=0;i<numbers.length;i++){
            if(i%2==0 && numbers[i]%2==0){
                continue;
            }
            else if(i%2==1 && numbers[i]%2==1){
                continue;
            }
            else
            return 0;
        }
        return 1;
    }
    public static void main(String args[]){
        qn1 n = new qn1();
        int[] numbers={3,4,5,6,7,8};
        System.out.println(n.balancedornot(numbers));
    }
}