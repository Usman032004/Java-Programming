// Swaping of two Numbers:

public class SwapingOfNumbers
{
// 1) Swaping Using Three Variable ::
   public static void main (String args[])
   {
      int a = 10;
      int b = 20;
      int temp = a;
      a = b;
      b = temp;
      System.out.println("After Swaping: a=" + a + " and b=" + b);
   }  
}


// 2) Swaping Using Two Variable ::
//    public static void main (String args[])
//    {
//       int a = 100;
//       int b = 200;
//       a = a + b;
//       b = a - b;
//       a = a - b;
//       System.out.println("After Swaping: a=" + a + " and b=" + b);
//    }
// }


// 3) Swaping a and b Using XOR ::
//    public static void main(String args[])
//    {
//       int a = 1000;
//       int b = 2000;
//       a = a ^ b;
//       b = a ^ b;
//       a = a ^ b;
//       System.out.println("After Swaping: a=" + a + " and b=" + b);
//    }
// }