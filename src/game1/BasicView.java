package game1;

import javax.swing.*;
import java.awt.*;

public class BasicView extends JComponent {
    public static final Color BG_COLOR = Color.BLACK;

    private BasicGame game;

    public BasicView(BasicGame game) {
        this.game = game;
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        g2D.setColor(BG_COLOR);
        g2D.fillRect(0, 0, getWidth(), getHeight());

        for (BasicAsteroid asteroid: game.asteroids) {
            asteroid.draw(g2D);
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return Constants.FRAME_SIZE;
    }
}
