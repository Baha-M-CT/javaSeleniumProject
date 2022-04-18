public class FirstClassForSeleniumProject {

    public static void printStr (String str) {
        System.out.println("---------------");
        System.out.println(str);
        System.out.println("---------------");
    }
     public static String printText (String text) {
        return text;
     }


    public static String equals (String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult)) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static String equals (int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static int getMaxValue (int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        /**
         * Test section
         */

        printStr("Test 1");
        System.out.println(equals("Test 1", printText("Test 1")));
        System.out.println(equals("Slon",printText("ABC")));

        printStr("Test 2");
        int[] arrayInt = new int[]{1,5,7,9,3,2,4,5};
        System.out.println(equals(9,getMaxValue(arrayInt)));


    }
}
