public class firstAndLastOccurance{

    public static int first = -1;
    public static int last = -1;

    static void occ(String str,int idx,char element){

        if(idx == str.length()){
            System.out.print("First occurance "+first+" \nLast occurance "+last);
            return;
        }

        char currentChar = str.charAt(idx);

        if( currentChar == element){

            if( first == -1){
                first = idx;
            }
            else{
                last = idx;
            }
        }
        occ(str,idx+1,element);

    }

    public static void main(String[] args){

        String s = "aafa";
        occ(s,0,'a');
    }
}