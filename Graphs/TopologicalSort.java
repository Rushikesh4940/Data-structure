import java.util.*;
public class TopologicalSort {
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
    boolean vis[]= new boolean[n];
    Stack<Integer> st= new Stack<Integer>();
    for(int i=0; i<n; i++){
        if(vis[i]==false){
            dfs(i,ls, st, vis);
        }
    }
    while(!st.isEmpty()){
        System.out.print(st.pop()+" ");
    }
    }
    public static void dfs(int node,ArrayList<ArrayList<Integer>> ls, Stack<Integer> st, boolean[]vis){
        vis[node]=true;
        for(Integer i:ls.get(node)){
            if(vis[i]==false){
                dfs(i,ls,st,vis);
            }
        }
        st.add(node);
    }
}
