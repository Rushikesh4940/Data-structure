import java.util.*;
public class matrixrepes {
     public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
      int mat[][]=new int[n][m];
      for (int i=0; i<m; i++){
        int u=sc.nextInt();
        int v=sc.nextInt();
        mat[u][v]=1;
        mat[v][u]=1;
      }
      for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            System.out.print(mat[i][j]+" ") ;
        }
        System.out.println();
    } 
    } 

}
