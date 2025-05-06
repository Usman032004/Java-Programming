//  Armstrong Number ::
//                 An Armstrong Number is a Number That is Equal to the Sum of Cubes of its Digits...
//                 Example: 153 :: (1*3 + 5*3 + 3*3) = (1*1*1 + 5*5*5 + 3*3*3) = (1 + 125 + 27) = 153..

public class ArmstrongNumbers 
{
   public static void main (String args[])
   {
   int sum = 0,res,temp;  
// 'sum' is initialized to 0. This will be used to store the sum of the cubes of the digits.
// 'res' is declared to store the remainder when a digit is extracted.
// 'temp' is declared to store the original value of num.

   int num = 153; // 'num' is initialized to 153, which is the number to be checked if it's an Armstrong number.
   temp = num;  
   while (num>0)
   {
      res = num % 10;
      num = num / 10;
      sum = sum + (res * res * res);
// Inside the loop:
// res = num % 10 <"extracts the last digit of num">.
// num = num / 10 <"removes the last digit from num">.
// sum = sum + (res * res * res) <"calculates the cube of the extracted digit (res * res * res) and adds it to sum">.
   }

   if (temp == sum)
   System.out.println(temp + " Is Armstrong Number");
   else
   System.out.println(temp + " Is Not Armstrong Number");
   }
}
