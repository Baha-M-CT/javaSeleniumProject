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

    public static void main(String[] args) {

        /**
         * Test section
         */
        printStr("Test 1");
        System.out.println(equals("Test 1", printText("Test 1")));
        System.out.println(equals("Slon",printText("ABC")));
    }
}
