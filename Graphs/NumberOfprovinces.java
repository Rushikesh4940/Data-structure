import java.util.*;
public class NumberOfprovinces {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
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
        int cnt=0;
        boolean vis[]= new boolean[n];
        for(int i=0; i<n; i++){
            if(vis[i]==false){
            dfs(i,ls,vis);
            cnt++;
            }
        }
        System.out.println(cnt);
    }
    public static void dfs(int node,ArrayList<ArrayList<Integer>> ls,boolean vis[]){
        vis[node] = true;
        for(Integer i:ls.get(node)){
            if(vis[i]==false)dfs(i,ls,vis);
        }

    }
}
