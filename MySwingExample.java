import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MySwingExample extends JFrame implements ActionListener {

    JTextField textField;
    JLabel label;
    JButton button1, button2;

    public MySwingExample() {
        // Frame title
        super("Swing Example");

        // Create components
        label = new JLabel("Enter text and click a button:");
        textField = new JTextField(15);

        button1 = new JButton("Show Text");
        button2 = new JButton("Clear");

        // Add ActionListeners
        button1.addActionListener(this);
        button2.addActionListener(this);

        // Layout
        setLayout(new FlowLayout());

        // Add components to frame
        add(label);
        add(textField);
        add(button1);
        add(button2);

        // Frame settings
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // ActionListener method
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            // Show text in label
            label.setText("You typed: " + textField.getText());
        } else if (e.getSource() == button2) {
            // Clear text
            textField.setText("");
            label.setText("Enter text and click a button:");
        }
    }

    public static void main(String[] args) {
        new MySwingExample();
    }
}
