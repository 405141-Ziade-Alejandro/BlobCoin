package inHouse;

public class Printer {
    public static void printLn(String str) {
        try{
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i));
                Thread.sleep(1);
            }
            System.out.println();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
