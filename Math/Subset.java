import java.util.*;
public class Subset{
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        List<List<Integer>> ans= new ArrayList<List<Integer>>();
        ans=allsubset(arr,n);
        for(List<Integer> i: ans){
            for(int j:i){
                System.out.print(j+"");
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> allsubset(int arr[], int n){
        int count=1<<n;
        List<List<Integer>> ans =  new ArrayList<List<Integer>>();
        for(int i=0 ; i<count ; i++){
            List<Integer> ls=new ArrayList<Integer>();
            for(int j=0;j<n;j++){
                if((i &(1<<j))!=0){
                    ls.add(arr[j]);
                }
            }
            ans.add(ls);
        }
        return ans;
}
}