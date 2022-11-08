package task;

import service.ScreenshotService;

import java.util.TimerTask;

public class ScreenshotTimerTask extends TimerTask {
    private final ScreenshotService service;

    public ScreenshotTimerTask() {
        service = new ScreenshotService();
    }

    @Override
    public void run() {
        service.createScreenshot();
        System.exit(0);
    }
}
