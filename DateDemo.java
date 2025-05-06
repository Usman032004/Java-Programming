// Write a Program to Display the Month of a Year. Months of the a Year should be held in an Array:


// import java.util.Calendar;
// public class DateDemo {
//    public static void main (String args[])
//    {
//       Calendar cal = Calendar.getInstance();
//       String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
//       System.out.println("Current Month =" + month [cal.get(Calendar.MONTH)]);
//    }
// }


//                      Displaying current Date, Day, Month and year:-

import java.util.Calendar;
public class DateDemo{
   public static void main(String args[])
   {
      Calendar cal = Calendar.getInstance();
      String[] Months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
      String[] DAY_OF_WEEK = {"", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
      // Retrieve the current month, day of the month, and day of the week:
      int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
      int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);   // Note: DAY_OF_WEEK starts from 1 for Sunday
      int month = cal.get(Calendar.MONTH);             // Note: MONTH is zero-based
      int year = cal.get(Calendar.YEAR);


      // Display the current date, day, and month
      System.out.println("Current Date: " +  dayOfMonth + " / " + DAY_OF_WEEK[dayOfWeek] + " / " + Months[month] + " / " + year);

   }
}





