public class Main {
    public static void main(String[] args) {
        String test = "Мир озарим  и разорим";
        String formattedTest = test.replaceAll(" ", "");
        System.out.println(reverse(formattedTest));
        System.out.println(formattedTest);
        System.out.println(formattedTest.equalsIgnoreCase(reverse(formattedTest)));


        StringBuilder str = new StringBuilder(formattedTest);
        str.reverse();
        System.out.println(formattedTest.equalsIgnoreCase(str.toString()));

    }

    public static String reverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0 ; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }


}
