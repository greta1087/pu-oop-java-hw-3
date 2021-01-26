package frog.piece;

import java.awt.*;
import java.util.Random;

public class Turtles {

    private int turtleSize = 50;
    private int row = 225;
    private int maxCol = 425;
    private int minCol = 25;
    private int col;

    public Turtles() {

    }

    /**
     * Генерира X координатите на костенурката на случаен принцип
     *
     */
    public int getRandomCol() {

        Random rand = new Random();

        do {
            col = rand.ints(minCol, (maxCol + 1))
                    .findFirst()
                    .getAsInt();

        }
        while (!(col == 25 || col == 125 || col == 325 || col == 425));

        return col;

    }

    /**
     * Визуализира костенурките
     *
     */
    public void render(Graphics g) {

        g.setColor(Color.red);
        g.drawOval(getRandomCol(), row, this.turtleSize, this.turtleSize);
        g.setColor(Color.red);
        g.drawOval(getRandomCol(), row, this.turtleSize, this.turtleSize);

    }
}
