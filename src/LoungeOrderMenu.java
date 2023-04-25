import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoungeOrderMenu extends JFrame {

    private JLabel titleLabel, drinksLabel, foodLabel;
    private JComboBox<String> drinksCombo, foodCombo;
    private JButton submitButton;

    public LoungeOrderMenu() {
        setTitle("Lounge Order Menu");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 10, 10));

        // Create and add the title label
        titleLabel = new JLabel("Welcome to the Lounge Order Menu!");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        add(titleLabel);
        add(new JLabel());

        // Create and add the drinks label and combo box
        drinksLabel = new JLabel("Drinks:");
        drinksCombo = new JComboBox<>(new String[]{"Water", "Soda", "Juice", "Coffee"});
        add(drinksLabel);
        add(drinksCombo);

        // Create and add the food label and combo box
        foodLabel = new JLabel("Food:");
        foodCombo = new JComboBox<>(new String[]{"Sandwich", "Salad", "Pizza", "Pasta"});
        add(foodLabel);
        add(foodCombo);

        // Create and add the submit button
        submitButton = new JButton("Submit Order");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the selected drinks and food items
                String selectedDrink = (String) drinksCombo.getSelectedItem();
                String selectedFood = (String) foodCombo.getSelectedItem();

                // Show a confirmation dialog
                JOptionPane.showMessageDialog(null, "Order submitted:\n" + selectedDrink + "\n" + selectedFood);
            }
        });
        add(submitButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        new LoungeOrderMenu();
    }

}
