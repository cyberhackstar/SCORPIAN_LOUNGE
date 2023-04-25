import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MultiPageExample extends JFrame {

    private JPanel cardPanel;
    private CardLayout cardLayout;
    private JButton page1Button, page2Button;

    public MultiPageExample() {
        setTitle("Multi-Page Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create the card panel and layout
        cardPanel = new JPanel();
        cardLayout = new CardLayout();
        cardPanel.setLayout(cardLayout);

        // Create the first page and add it to the card panel
        JPanel page1 = new JPanel();
        page1Button = new JButton("Go to page 2");
        page1Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "page2");
            }
        });
        page1.add(new JLabel("Page 1"));
        page1.add(page1Button);
        cardPanel.add(page1, "page1");

        // Create the second page and add it to the card panel
        JPanel page2 = new JPanel();
        page2Button = new JButton("Go to page 1");
        page2Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "page1");
            }
        });
        page2.add(new JLabel("Page 2"));
        page2.add(page2Button);
        cardPanel.add(page2, "page2");

        // Add the card panel to the frame
        add(cardPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MultiPageExample();
    }

}
