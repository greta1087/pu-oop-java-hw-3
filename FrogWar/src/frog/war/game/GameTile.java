package frog.war.game;

import java.awt.*;

public class GameTile {

    private int row;
    private int col;
    private int tileSize;

    public GameTile(int row, int col) {

        this.row      = row;
        this.col      = col;
        this.tileSize = 100;

    }

    /**
     * Оцветява и визуализира отделните полета на дъската в различни цветове
     *
     */
    public void render(Graphics g) {

        int tileX = this.col * this.tileSize;
        int tileY = this.row * this.tileSize;

        if(this.row == 0 && this.col == 0 || this.row == 0 && this.col == 4 || this.row == 4 && this.col == 1 || this.row == 4 && this.col == 3) {
            g.setColor(new Color(0xFF633B));

        }
        else if(this.row == 0 && this.col == 1 || this.row == 0 && this.col == 3 || this.row == 4 && this.col == 0 || this.row == 4 && this.col == 4) {
            g.setColor(new Color(0x424242));
        }
        else if(this.row == 2 || this.col == 2) {
            g.setColor(Color.white);
        }
        else {
            g.setColor(new Color(0xB2B2B2));
        }

        g.fillRect(tileX,tileY,this.tileSize, this.tileSize);
        g.setColor(new Color(0x424242));
        g.drawRect(tileX,tileY,this.tileSize, this.tileSize);

        g.setColor(new Color(0x767676));
        g.fillOval(225, 225, 50, 50);
        g.setColor(new Color(0x424242));
        g.drawOval(225, 225, 50, 50);

    }
}