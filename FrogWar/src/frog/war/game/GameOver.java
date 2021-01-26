package frog.war.game;

import javax.swing.JOptionPane;

public class GameOver {

    /**
     * Генерира popup прозорец със съобщение
     *
     */
    public static void gameOverMessage(String infoMessage)
    {
        JOptionPane.showMessageDialog(null, infoMessage,"Край на играта", JOptionPane.INFORMATION_MESSAGE);
    }

}
