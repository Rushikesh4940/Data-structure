import java.util.*;
class BreathFirstSearch{
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
        ///BFS STARTS HERE
        ArrayList<Integer> l=new ArrayList<Integer>();
        boolean vis[]= new boolean[n];
        Queue<Integer>q= new LinkedList<>();
        q.add(0);
        vis[0]=true;
        while (!q.isEmpty()) {
            int node=q.poll();
            l.add(node);
            for(Integer i:ls.get(node)){
                if(vis[i]==false){
                    vis[i]=true;
                    q.add(i);
                }            
        }
    }
        for(Integer i:l){
            System.out.print(i+" ");
        }

    
}
}