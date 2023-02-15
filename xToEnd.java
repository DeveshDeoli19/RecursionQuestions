public class xToEnd{

    static int count = 0;
    static void moveToEnd(String str, int idx, String newStr){

        if(idx == str.length()){
            for(int i=0;i<count;i++){
                newStr+="x";
            }
            System.out.print("\t"+newStr);
            return;
        }

        char currentChar =str.charAt(idx);
        if(currentChar != 'x'){
            newStr+= currentChar;
        }
        else{
            count++;
        }
        moveToEnd(str,idx+1,newStr);
    }

    public static void main(String[] args){

        String str = "axbcxxd";
        System.out.println("\n\tOriginal String: "+str);
        moveToEnd(str,0,"");
    }
}