import java.util.Scanner;

public class Evenno {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
       int n=0,sum=0;
      do{
       sum+=n;
      
       n=n+2;
      }
       while(n<=20)
     System.out.println("Sum of Even no:"+sum);
    }

}