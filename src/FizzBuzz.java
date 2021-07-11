public class FizzBuzz {

    public static void printFizzBuzz() {

        for (int i = 1; i <=100 ; i++) {
            System.out.println(getFizzBuzz(i));
        }
    }

    public static String getFizzBuzz (int i) {
        if(i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(i);
        }
    }
}

/* other solution:

        int i;
 */

 /*      for (i = 1; i <=100 ; i++) {

            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
         }
               */
