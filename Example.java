import java.util.Scanner;

class Example{
   public static void main(String args[]) {
      Scanner sc = new Scanner (System.in);
      System.out.println("Enter the First Number:");
      int a = sc.nextInt();
      System.out.println("Enter the Second Number:");
      int b = sc.nextInt();
      System.out.println("Enter the Third Number:");
      int c = sc.nextInt();
      int d = a + b + c;
      System.out.println("After Adding:" +d);
      sc.close();
   }
}

// How the Code Works: (Explaniation)

// 1) The program starts execution at the main method.
// 2) A Scanner object is created to read input from the keyboard.
// 3) The user is prompted to enter three numbers one by one. Each number is read and stored in variables a, b, and c.
// 4) The sum of these three numbers is calculated and stored in variable d.
// 5)The result of the addition is printed to the console.
// 6)The Scanner object is closed