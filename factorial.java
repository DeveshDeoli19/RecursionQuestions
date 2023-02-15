public class factorial{
    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args){
        int n=4,f=0;
        f=fact(n);
        System.out.print(f);
    }
}