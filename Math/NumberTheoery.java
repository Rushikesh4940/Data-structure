public class NumberTheoery {
    public static void main(String[] args) {
        printBinary(199);
        printBinary(setittosetbit(199, 4));
        printBinary(setittounset(199, 4));
        oddoreven(28);
        System.out.println(uppertolower('A'));
        System.out.println(lowertoupper('a'));
    }    
    public static void printBinary(int value) {
    while(value>0){
        System.out.print(value&1);
        value=value>>1;
    }
    System.out.println();
    } 
    public static int setittosetbit(int n,int pos) {
        return n|1<<pos;
    }
    public static int setittounset(int n,int pos) {
    return n&~(1<<pos);
    }
    public  static void oddoreven(int n){
        if((n&1)==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd"); 
        }
    }
    public static char lowertoupper(char c){
        return (char)(c&'_') ;
    }
    public static char uppertolower(char c){
             return (char)(c|' ') ;
    }
    public static int addition(int a, int b){
        int carry=0,sum=0;
        while(carry!=0){
            sum=a^b;
            carry=(a&b)<<1;
            a=sum;
            b= carry;
        }
        return sum;
    }
    
}
