public class digitsSum{
    static int dSum(int n){
        if(n==0){
            return 0;
        }
        return dSum(n/10)+n%10;
    }
    public static void main(String[] args){
        System.out.print(dSum(101));
    }
}