package service;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class ScreenshotService {
    public static final String FORMAT_NAME = "jpg";
    public static final String FOLDER_NAME = "./files/";

    public void createScreenshot() {
        try {
            BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            ImageIO.write(image, FORMAT_NAME, new File(getFileName()));
        } catch (AWTException | IOException e) {
            e.printStackTrace();
        }
    }

    private String getFileName() {
        return FOLDER_NAME + new Date().getTime() + "." + FORMAT_NAME;
    }
}
