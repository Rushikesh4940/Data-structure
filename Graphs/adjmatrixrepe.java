import java.util.*;
class adjmatrixrepe {
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
    for(int i=0; i<n; i++){
        for(int j=0; j<ls.get(i).size(); j++){
            System.out.print(ls.get(i).get(j));
    }
    System.out.println("");
    }
}
}