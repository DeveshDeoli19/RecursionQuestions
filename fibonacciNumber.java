public class fibonacciNumber{

    static int fib(int n){
        if(n==0)
        {
            return 0;
        }
        if(n==1){
            return 1;
        }

        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args){
        int result=0,n=3;
        result = fib(n);
        System.out.print(result);
    }
}