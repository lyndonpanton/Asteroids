package game1;

import java.awt.*;

public class Constants {
    public static final int FRAME_WIDTH = 640;
    public static final int FRAME_HEIGHT = 480;
    public static final Dimension FRAME_SIZE = new Dimension(
            Constants.FRAME_WIDTH, Constants.FRAME_HEIGHT
    );

    /*
        (Maximum) FPS Calculation

        1000 / DELAY = FPS ->
        DELAY = 1000 / FPS

        (1 Frame = 1/60 seconds (16.666 milliseconds)
     */
    // milliseconds (50FPS maximum)
    public static final int DELAY = 20;

    // seconds
    public static final double DT = DELAY / 1000.0;
}
