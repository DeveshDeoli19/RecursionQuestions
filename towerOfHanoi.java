public class towerOfHanoi{
    static void solve(int n,String src,String help, String dest){

        if(n==1){
            System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
            return;
        }

        solve(n-1,src,dest,help);
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
        solve(n-1,help,src,dest);
    }
    public static void main(String[] args){
        int n=3;
        solve(n,"Source","Help","Destination");
    }
}

/*

 |    |    |
src  help  dest 

*/