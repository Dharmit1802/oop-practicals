import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class practical_18 extends JFrame implements KeyListener {
    private int circleX;
    private int circleY;

    public practical_18() {
        setTitle("Circle Movement");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);

        circleX = 200;  // Initial X position of the circle
        circleY = 200;  // Initial Y position of the circle

        addKeyListener(this);
        setFocusable(true);
        requestFocus();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        g.fillOval(circleX, circleY, 50, 50);  // Draw the circle
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_UP:
                circleY -= 10;  // Move the circle up
                break;
            case KeyEvent.VK_DOWN:
                circleY += 10;  // Move the circle down
                break;
            case KeyEvent.VK_LEFT:
                circleX -= 10;  // Move the circle left
                break;
            case KeyEvent.VK_RIGHT:
                circleX += 10;  // Move the circle right
                break;
        }
        repaint();  // Redraw the circle in the new position
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            practical_18 circleMovement = new practical_18();
            circleMovement.setVisible(true);
        });
    }
}

