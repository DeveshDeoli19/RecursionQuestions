public class keypadCombination{

    public static String[] keypad= {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"} ;
    static void combination(String str, int idx, String seq){

        if(idx == str.length()){

            System.out.println(seq);
            return;
        }

        char currentNum = str.charAt(idx);
        String mapping = keypad[currentNum - '0'];

        for(int i=0;i<mapping.length();i++){
            combination(str,idx+1,seq+mapping.charAt(i));
        }
    }

    static public void main(String[] args){
        String s = "23";
        combination(s,0,"");
    }
}