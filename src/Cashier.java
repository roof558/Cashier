import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Cashier implements ActionListener{
    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JPanel panel;

    Cashier() {
        frame = new JFrame("Cashier");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setEditable(false);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Cashier cash = new Cashier();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}