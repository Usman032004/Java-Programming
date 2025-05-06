import java.util.*;

class PayoutOfBoundsException extends Exception {
   PayoutOfBoundsException(String msg) {
      super(msg);
   }
}

public class UserDefinedExceptionDemo {
   public static void main(String args[]) {
      System.out.println("Enter the Employee Salary:");
      try (Scanner sc = new Scanner(System.in)) {
            int pay = sc.nextInt();
            if (pay < 1000 || pay > 50000) {
               throw new PayoutOfBoundsException("Salary Not in the Valid Range");
            } else {
               System.out.println("Employee Eligible for 30% Hike");
            }
      } catch (PayoutOfBoundsException e) {
            System.out.println(e.getMessage());
      }
   }
}

