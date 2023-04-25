import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {
    private JLabel usernameLabel, passwordLabel;
    private JTextField usernameTextField;
    private JPasswordField passwordField;
    private JButton loginButton, cancelButton;

    public Main() {
        super("User Authentication");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create labels
        usernameLabel = new JLabel("Username:");
        passwordLabel = new JLabel("Password:");

        // create text fields and password field
        usernameTextField = new JTextField(20);
        passwordField = new JPasswordField(20);

        // create buttons
        loginButton = new JButton("Login");
        cancelButton = new JButton("Cancel");

        // add action listeners to buttons
        loginButton.addActionListener(this);
        cancelButton.addActionListener(this);

        // create panel for labels and text fields
        JPanel inputPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        inputPanel.add(usernameLabel);
        inputPanel.add(usernameTextField);
        inputPanel.add(passwordLabel);
        inputPanel.add(passwordField);

        // create panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(loginButton);
        buttonPanel.add(cancelButton);

        // add panels to frame
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(inputPanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        // set frame properties
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = usernameTextField.getText();
            String password = new String(passwordField.getPassword());
            if (isValidUser(username, password)) {
                JOptionPane.showMessageDialog(this, "Login successful!");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password.");
            }
        } else if (e.getSource() == cancelButton) {
            dispose();
        }
    }

    private boolean isValidUser(String username, String password) {
        // replace with actual user authentication logic
        return username.equals("admin") && password.equals("password");
    }

    public static void main(String[] args) {
        new Main();
    }
}
