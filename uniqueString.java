public class uniqueString{

    static boolean map[] = new boolean[26];

    static void removeDups(String str, int idx,String newStr){

        if(idx == str.length()){
            System.out.print(newStr);
            return;
        }

        char currentChar = str.charAt(idx);

        if(map[currentChar - 'a']){
            removeDups(str,idx+1,newStr);
        }
        else{

            newStr+= currentChar;
            map[currentChar - 'a'] = true;
            removeDups(str,idx+1,newStr);
        }
    }

    public static void main(String[] args)
    {
        
        String s = "abbcddca";
        removeDups(s,0,"");
    }
}