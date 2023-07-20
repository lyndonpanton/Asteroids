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
        Graphics2D g2d = (Graphics2D) g;

        g.setColor(BG_COLOR);
        g.fillRect(0, 0, getWidth(), getHeight());
    }

    @Override
    public Dimension getPreferredSize() {
        return Constants.FRAME_SIZE;
    }
}
