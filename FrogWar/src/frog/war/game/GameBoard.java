package frog.war.game;

import frog.piece.Guard;
import frog.piece.Leader;
import frog.piece.Turtles;

import javax.swing.*;
import java.awt.*;

/**
 * Клас, който наследява характеристиките на JFrame и създава рамката,
 * в която се визуализират всички елементи
 */
public class GameBoard extends JFrame {

    public GameBoard() {

        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.setTitle("Frog War Game");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Popup прозорец, който известява, че играта е приключила
        //Понеже не съм имплементирала логика за приключване на играта, съобщението изкача при стартиране на приложението
        GameOver.gameOverMessage("Поздравления! Вие спечелихте! :-)");

    }

    /**
     * Визуализира игралната дъска и фигурите
     *
     */
    @Override
    public void paint(Graphics g) {

        for (int row = 0; row < 5; row++) {
             for (int col = 0; col < 5; col++) {

                GameTile gameTile = new GameTile(row, col);
                gameTile.render(g);

             }
        }

        //Гардовете
        Guard guardY = new Guard();
        guardY.renderYellow(g);

        Guard guardG = new Guard();
        guardG.renderGreen(g);

        //Лидерите
        Leader leader = new Leader();
        leader.render(g);

        //Костенурките
        Turtles turtle = new Turtles();
        turtle.render(g);

    }
}