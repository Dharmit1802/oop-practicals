import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class practical_17 extends JFrame {
    private JLabel[][] cells;

    public practical_17() {
        setTitle("Tic-Tac-Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the grid layout for the cells
        setLayout(new GridLayout(3, 3));

        // Create the array of JLabels to represent the cells
        cells = new JLabel[3][3];

        // Load the X and O images
        ImageIcon xImage = new ImageIcon("x.jpeg");
        ImageIcon oImage = new ImageIcon("0.jpeg");

        // Create a random object to determine the cell content
        Random random = new Random();

        // Populate the cells with random X, O, or empty
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                // Create a new JLabel
                JLabel cell = new JLabel();

                // Randomly assign X, O, or empty
                int randomInt = random.nextInt(3);
                if (randomInt == 0) {
                    cell.setIcon(xImage);
                } else if (randomInt == 1) {
                    cell.setIcon(oImage);
                }

                // Add the cell to the grid layout
                cells[row][col] = cell;
                add(cell);
            }
        }

        // Adjust the size of the window to fit the cells
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(practical_17::new);
    }
}
 
