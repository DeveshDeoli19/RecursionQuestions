import java.util.*;
public class decimalToBinary{

    public static void convert(int n)
    {
        if(n==0){
            return;
        }
        convert(n/2);
        System.out.print(n%2);
    }

    public static void main(String[] args){
        int n = 13;
        convert(n);
    }
}