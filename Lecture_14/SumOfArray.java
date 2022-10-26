package DataStructure.Lecture_14;

public class SumOfArray {
    public static int sum_x(int input[],int n){
        if(n==0){
            return 0;
        }
        else{
            return (sum_x(input,n-1)+input[n-1]);
        }
    }

    public static int sum(int input[]){
        int n = input.length;
        int x = sum_x(input,n);
        return x;
    }
    public static void main(String[] args) {
        int input[]={1,2,3,4,5};
        int x= sum(input);
        System.out.print(x);
    }
}
