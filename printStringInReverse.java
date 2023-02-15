public class printStringInReverse{

    static void rev(String str, int idx){

        if(idx == 0){
        System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        rev(str, idx-1);
    }
    public static void main(String[] args){

        String s = "abcd";

        rev(s, s.length()-1);
    }
}