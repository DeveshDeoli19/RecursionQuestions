public class subseqOfString{

    static void subseq(String str, int idx, String seq){

        if(idx == str.length()){
            System.out.println(seq);
            return;
        }

        char currentChar = str.charAt(idx);

        subseq(str,idx+1,seq+currentChar);//include
        subseq(str,idx+1,seq);//not include
    }

    public static void main(String[] args){
        String s = "abc";
        subseq(s,0,"");
    }
}