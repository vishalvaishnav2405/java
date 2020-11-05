import java.io.DataInputStream;

public class Addition {
    public static void main(final String args[]) {
       
        final DataInputStream in1 = new DataInputStream(System.in);

          int a,b,c;

         try {
            System.out.println("Please enter the first number:");
            a = Integer.parseInt(in1.readLine());

            System.out.println("please enter second :");
            b = Integer.parseInt(in1.readLine());

            c = a + b;
            System.out.println("result is: " + c);
         } catch (final Exception e) {
          System.out.println("Error: "+e);
       }
    }
}