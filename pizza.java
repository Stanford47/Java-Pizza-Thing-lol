import java.awt.*;
import javax.swing.*;

public class pizza {
    public static void main(String args[]) {
        JFrame frame = new JFrame();

        frame.setBounds(10, 10, 500, 500);

        frame.setDefaultCloseOperation(3);

        int x[] = {80*2, 60*2, 100*2};
        int y[] = {150*2, 100*2, 100*2};
        int sides = 3;

        JPanel panel = new JPanel() {
            @Override
            public void paint(Graphics g) {
                Graphics2D graphics2d = (Graphics2D) g.create();

                graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                g.setColor(Color.GRAY);

                g.fillPolygon(x, y, sides);
                g.fillArc(120, 191, 79, 20, 10, 180);
            }
        };

        frame.setBackground(Color.BLACK);
        frame.add(panel);
        frame.setVisible(true);
    }
} //lol