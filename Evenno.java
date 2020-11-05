import java.util.Scanner;

public class Evenno {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int i ,n=10 ,sum=0;

        for(i=1;i<=10;i++){

            if((i%2)==0){

                sum=sum+i;

            }
        }

     System.out.println("Sum of Even no:"+sum);
    }

}