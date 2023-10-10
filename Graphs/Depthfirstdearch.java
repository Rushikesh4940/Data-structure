import java.util.*;
class Depthfirstdearch {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
    int n=sc.nextInt();
    int m=sc.nextInt();
    ArrayList<ArrayList<Integer>>ls= new ArrayList<ArrayList<Integer>>();
    for(int i=0; i<n; i++){
        ls.add(new ArrayList<Integer>());
    }
    for(int i=0; i<n; i++){
        int u=sc.nextInt();
        int v=sc.nextInt();
        ls.get(u).add(v);
    }
    boolean[]vis= new boolean[n];
    Arrays.fill(vis,false);
    vis[0]=true;
    ArrayList<Integer> l=new ArrayList<Integer>();
    dfs(ls,1,vis,l);
  for(Integer i: l){
    System.out.print(i+"");
  }
    }
   
   public static void dfs(ArrayList<ArrayList<Integer>>ls,int node,boolean vis[],ArrayList<Integer> l){
        vis[node]=true;
        l.add(node);
       // System.out.print(node+"");
        for(Integer i:ls.get(node)){
            if(vis[i]==false){
               // System.out.print(node+"hi");
             dfs(ls,i,vis,l);
            }
        }

   }
}
