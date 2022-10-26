package DataStructure.Lecture_14;

public class Power {
    public static int power(int m,int n){
        if(n==0){
            return 1;
        }
        else{
            return power(m,(n-1))*m;
        }
        
    }
    public static void main(String args[]) {
        int x=power(5,4);
        System.out.print(x);
        
    }
}
