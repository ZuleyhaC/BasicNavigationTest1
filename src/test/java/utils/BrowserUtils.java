package utils;

public class BrowserUtils {

//It will be used


    public static void wait(int seconds){
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e){
            e.printStackTrace();
        }


    }
}
