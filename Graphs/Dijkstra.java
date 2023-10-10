import java.util.*;
public class Dijkstra {
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
        PriorityQueue<Pair>pq= new PriorityQueue<Pair>((x,y) ->x.b-y.b);
        int dis[]= new int[n];
        Arrays.fill(dis,Integer.MAX_VALUE);
        dis[0]=0;
        pq.add(new Pair(0, 0));
        while(!pq.isEmpty()){
            int dist=pq.peek().a;
            int node =pq.peek().b;
            pq.remove();
            for(int i=0;i<ls.get(node).size();i++){
                int weight=ls.get(node).get(i);
                int nextnode=ls.get(node).get(i);
                if(dis[nextnode]<dist + weight){
                    dis[nextnode]=dist+weight;
                    pq.add(new Pair(dis[nextnode],nextnode));
                }
              }
            }
            for(int i=0;i<n;i++){
                System.out.print( dis[i]+"");
            }
    }

    
}
class Pair{
    int a;
    int b;
    Pair(int a, int b) {
        this .a=a;
        this.b=b;
}
}