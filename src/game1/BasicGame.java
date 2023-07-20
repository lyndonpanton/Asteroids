package game1;

import utilities.JEasyFrame;

import java.util.ArrayList;
import java.util.List;

import static game1.Constants.DELAY;

public class BasicGame {
    public static final int N_INITIAL_ASTEROIDS = 5;
    public List<BasicAsteroid> asteroids;

    public BasicGame() {
        asteroids = new ArrayList<>();

        for (int i = 0; i < N_INITIAL_ASTEROIDS; i++) {
            asteroids.add(new BasicAsteroid());
        }
    }
    public static void main(String[] args) throws InterruptedException {
        BasicGame game = new BasicGame();
        BasicView view = new BasicView(game);

        JEasyFrame frame = new JEasyFrame(view, "Asteroids");

        while (true) {
            game.update();
            view.repaint();
            Thread.sleep(DELAY);
        }
    }

    public void update() {
        for (BasicAsteroid asteroid: asteroids) {
            asteroid.update();
        }
    }
}
