import task.ScreenshotTimerTask;

import java.util.Scanner;
import java.util.Timer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the number of seconds after which the screenshot is taken: ");
        Scanner in = new Scanner(System.in);

        int delay = in.nextInt();

        Timer timer = new Timer();
        timer.schedule(new ScreenshotTimerTask(), delay * 1000L);
    }
}
