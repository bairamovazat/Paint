package ru.ivmiit;

import javax.swing.*;
import java.awt.*;

public class PaintForm {

    private JPanel panel1;
    private JButton func1;
    private JButton func2;
    private JButton event1;
    private JButton func3;
    private JButton func4;
    private JButton event2;
    private JButton event3;
    private JButton event4;

    public static void main(String[] args) {
        new PaintForm();
    }

    public PaintForm() {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel1 = new JPanel();
        panel1.setLayout(new BorderLayout(5, 5));
        panel1.setEnabled(false);
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        panel1.add(panel2, BorderLayout.NORTH);
        panel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), null));
        func1 = new JButton();
        func1.setActionCommand("func1");
        func1.setBackground(new Color(-1842206));
        func1.setText("Функция1");
        panel2.add(func1);
        func2 = new JButton();
        func2.setActionCommand("func2");
        func2.setHorizontalAlignment(0);
        func2.setText("Функция2");
        panel2.add(func2);
        func3 = new JButton();
        func3.setActionCommand("func3");
        func3.setLabel("Функция3");
        func3.setText("Функция3");
        panel2.add(func3);
        func4 = new JButton();
        func4.setActionCommand("func4");
        func4.setText("Фунция4");
        panel2.add(func4);
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        panel3.setPreferredSize(new Dimension(80, 40));
        panel1.add(panel3, BorderLayout.WEST);
        event1 = new JButton();
        event1.setActionCommand("event1");
        event1.setMargin(new Insets(0, 0, 0, 0));
        event1.setMaximumSize(new Dimension(-1, -1));
        event1.setMinimumSize(new Dimension(-1, -1));
        event1.setPreferredSize(new Dimension(30, 30));
        event1.setText("");
        panel3.add(event1);
        event2 = new JButton();
        event2.setActionCommand("event2");
        event2.setIcon(new ImageIcon(getClass().getResource("/icons/circle.png")));
        event2.setMargin(new Insets(0, 0, 0, 0));
        event2.setMaximumSize(new Dimension(-1, -1));
        event2.setMinimumSize(new Dimension(-1, -1));
        event2.setPreferredSize(new Dimension(30, 30));
        event2.setText("");
        panel3.add(event2);
        event3 = new JButton();
        event3.setActionCommand("event3");
        event3.setMargin(new Insets(0, 0, 0, 0));
        event3.setMaximumSize(new Dimension(-1, -1));
        event3.setMinimumSize(new Dimension(-1, -1));
        event3.setPreferredSize(new Dimension(30, 30));
        event3.setText("");
        panel3.add(event3);
        event4 = new JButton();
        event4.setActionCommand("event4");
        event4.setMargin(new Insets(0, 0, 0, 0));
        event4.setMaximumSize(new Dimension(-1, -1));
        event4.setMinimumSize(new Dimension(-1, -1));
        event4.setPreferredSize(new Dimension(30, 30));
        event4.setText("");
        panel3.add(event4);
        final JPanel panel4 = new JPanel();
        panel4.setLayout(new CardLayout(5, 5));
        panel4.setAutoscrolls(true);
        panel4.setEnabled(true);
        panel4.setMaximumSize(new Dimension(200, 200));
        panel4.setMinimumSize(new Dimension(200, 200));
        panel4.setPreferredSize(new Dimension(200, 200));
        panel1.add(panel4, BorderLayout.CENTER);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel1;
    }
}
