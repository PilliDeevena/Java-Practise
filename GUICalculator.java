package packagecalc;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUICalculator implements ActionListener {
    private JFrame frame;
    private JTextField textField;
    private JPanel panel;
    private String operator;
    private double num1, num2, result;

    public GUICalculator() {
        frame = new JFrame("Calculator");
        textField = new JTextField();
        panel = new JPanel();

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);
        frame.setBounds(100, 100, 400, 600);

        // Set text field properties
        textField.setFont(new Font("Arial", Font.PLAIN, 40));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setEditable(false);

        // Set panel properties
        panel.setLayout(new GridLayout(5, 4, 10, 10));

        // Add buttons to the panel
        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
            "C"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 40));
            button.addActionListener(this);
            panel.add(button);
        }

        // Add components to frame
        frame.add(textField, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        // Make frame visible
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.charAt(0) >= '0' && command.charAt(0) <= '9' || command.equals(".")) {
            textField.setText(textField.getText() + command);
        } else if (command.equals("C")) {
            textField.setText("");
            operator = "";
            num1 = num2 = result = 0;
        } else if (command.equals("=")) {
            num2 = Double.parseDouble(textField.getText());
            switch (operator) {
                case "+":
                    
