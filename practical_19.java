import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class practical_19 extends JFrame {
    private Color circleColor;

    public practical_19() {
        setTitle("Circle Color Change");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLocationRelativeTo(null);

        circleColor = Color.BLUE;

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(circleColor);
                int circleSize = Math.min(getWidth(), getHeight()) / 2;
                int circleX = getWidth() / 2 - circleSize / 2;
                int circleY = getHeight() / 2 - circleSize / 2;
                g.fillOval(circleX, circleY, circleSize, circleSize);
            }
        };

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                circleColor = Color.RED;
                panel.repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                circleColor = Color.BLUE;
                panel.repaint();
            }
        });

        setContentPane(panel);
        setFocusable(true);
        requestFocus();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            practical_19 colorChange = new practical_19();
            colorChange.setVisible(true);
        });
    }
}
