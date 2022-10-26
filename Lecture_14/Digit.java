package DataStructure.Lecture_14;

public class Digit {

    public static int numOfdigit(int n) {
        if(n/10==0){
            return 1;
           }
           else{
            return 1+numOfdigit(n/10);
           }
           

    }
    public static void main(String[] args) {
        int x=numOfdigit(100);
        System.out.println(x);
    }
    
}
