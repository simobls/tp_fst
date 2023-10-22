package tp4_java;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class frames {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(900, 900);
        frame.setTitle("Formes");
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel for drawing
        JPanel panel = new JPanel() {
            public void paint(Graphics g) {
                super.paint(g);

                Font font = new Font("Arial", Font.BOLD, 16);
                g.setFont(font);

                g.setColor(Color.red);
                g.fillRect(100, 100, 150, 100);
                g.drawString("Rectangle", 150, 220);

                g.setColor(Color.GREEN);
                int[] X = {350, 450, 300};
                int[] Y = {100, 150, 200};
                g.fillPolygon(X, Y, 3);
                g.drawString("Triangle", 390, 220);

                int r = 100, x = 500, y = 100;
                g.setColor(Color.blue);
                g.fillOval(x, y, r, r);
                g.drawString("Disque", 520, 220);

                g.setColor(Color.yellow);
                int[] X1 = {100, 250, 300, 150};
                int[] Y1 = {350, 350, 450, 450};
                g.fillPolygon(X1, Y1, 4);
                g.drawString("Parallelogramme", 170, 490);

                g.setColor(Color.cyan);
                int[] X2 = {450, 550, 600, 550, 450, 400};
                int[] Y2 = {350, 350, 400, 450, 450, 400};
                g.fillPolygon(X2, Y2, 6);
                g.drawString("Hexagone", 480, 490);
            }
        };

        frame.add(panel);

        frame.setVisible(true);
    }
}
