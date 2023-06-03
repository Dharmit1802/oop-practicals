import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class practical_20 extends JFrame {
    private JLabel messageLabel;
    private JButton leftButton;
    private JButton rightButton;
    private JRadioButton redRadioButton;
    private JRadioButton greenRadioButton;
    private JRadioButton blueRadioButton;

    public practical_20() {
        setTitle("Message Movement and Color Change");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);

        // Create the message label
        messageLabel = new JLabel("Move me!");
        messageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        messageLabel.setFont(new Font("Arial", Font.BOLD, 18));
        messageLabel.setOpaque(true);
        messageLabel.setBackground(Color.WHITE);

        // Create the buttons
        leftButton = new JButton("Left");
        rightButton = new JButton("Right");

        // Create the radio buttons
        redRadioButton = new JRadioButton("Red");
        greenRadioButton = new JRadioButton("Green");
        blueRadioButton = new JRadioButton("Blue");

        // Group the radio buttons together
        ButtonGroup colorButtonGroup = new ButtonGroup();
        colorButtonGroup.add(redRadioButton);
        colorButtonGroup.add(greenRadioButton);
        colorButtonGroup.add(blueRadioButton);

        // Create a panel for the buttons and radio buttons
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        controlPanel.add(leftButton);
        controlPanel.add(rightButton);
        controlPanel.add(redRadioButton);
        controlPanel.add(greenRadioButton);
        controlPanel.add(blueRadioButton);

        // Add action listeners to the buttons
        leftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int currentX = messageLabel.getX();
                messageLabel.setLocation(currentX - 10, messageLabel.getY());
            }
        });

        rightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int currentX = messageLabel.getX();
                messageLabel.setLocation(currentX + 10, messageLabel.getY());
            }
        });

        // Add action listeners to the radio buttons
        redRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageLabel.setForeground(Color.RED);
            }
        });

        greenRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageLabel.setForeground(Color.GREEN);
            }
        });

        blueRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageLabel.setForeground(Color.BLUE);
            }
        });

        // Set the layout for the frame
        setLayout(new BorderLayout());

        // Add components to the frame
        add(messageLabel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            practical_20 messageMovement = new practical_20();
            messageMovement.setVisible(true);
        });
    }
}

