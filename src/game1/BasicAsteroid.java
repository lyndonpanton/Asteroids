package game1;

import static game1.Constants.DT;
import static game1.Constants.FRAME_HEIGHT;
import static game1.Constants.FRAME_WIDTH;
import java.awt.Color;
import java.awt.Graphics2D;

public class BasicAsteroid {
    public static final int RADIUS = 10;
    public static final double MAX_SPEED = 100;

    private double x, y;
    private double vx, vy;

    public BasicAsteroid() {
        BasicAsteroid copyAsteroid = makeRandomAsteroid();

        this.x = copyAsteroid.x;
        this.y = copyAsteroid.y;
        this.vx = copyAsteroid.vx;
        this.vy = copyAsteroid.vy;
    }

    public BasicAsteroid(double x, double y, double vx, double vy) {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
    }

    public static BasicAsteroid makeRandomAsteroid() {
        double x = Math.random() * FRAME_WIDTH;
        double y = Math.random() * FRAME_HEIGHT;

        double vx = Math.random() * MAX_SPEED * (Math.random() < 0.5 ? 1 : -1);
        double vy = Math.random() * MAX_SPEED * (Math.random() < 0.5 ? 1 : -1);

        return new BasicAsteroid(x, y, vx, vy);
    }

    public void update() {
        x += vx * DT;
        y += vy * DT;
        x = (x + FRAME_WIDTH) % FRAME_WIDTH;
        y = (y + FRAME_HEIGHT) % FRAME_HEIGHT;
    }

    public void draw(Graphics2D g) {
        g.setColor(Color.RED);
        g.fillOval(
                (int) x - RADIUS,
                (int) y - RADIUS,
                2 * RADIUS,
                2 * RADIUS
        );
    }
}
