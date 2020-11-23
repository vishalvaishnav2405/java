public class Commandlineadd 
{  
public static void main(String args[])  
{  
int a,b,sum;  
a=Integer.parseInt(args[0]);   //first input number   
b=Integer.parseInt(args[1]);  //second input number 
System.out.println("The first input number is :" +a);
System.out.println("The second input number is :" +b);
sum=a+b; //adding two numbers  
System.out.println("The sum of " + a + " and " + b +" is " +sum);  
}  
}
