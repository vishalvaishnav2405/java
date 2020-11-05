import java.util.Scanner;

public class Multiplication{

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        int n = 15,range;
        System.out.println("Enter the range:");
        range = s.nextInt();
        for(int i=1;i<=range;i++){
            System.out.println(n+"x"+i+"="+n*i);
        }
    }
}