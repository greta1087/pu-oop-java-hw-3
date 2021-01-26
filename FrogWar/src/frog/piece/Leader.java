package frog.piece;

import java.awt.*;

public class Leader {

    private int leaderSize = 50;

    public Leader() {

    }
    /**
     * Визуализира лидерите
     *
     */
    public void render(Graphics g) {

        //Жълт лидер
        g.setColor(Color.yellow);
        g.fillRect(425,25,this.leaderSize, this.leaderSize);

        //Зелен лидер
        g.setColor(Color.green);
        g.fillRect(25,425,this.leaderSize, this.leaderSize);

    }
}
