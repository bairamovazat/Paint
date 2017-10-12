package ru.ivmiit;

import models.CentralPanelListener;
import models.FiguresEnum;

import java.awt.*;
import javax.swing.*;

public class PaintGUI extends JFrame{
    private JPanel mainPanel;
    private JPanel topPanel;
    private JPanel leftPanel;
    private JPanel centralPanel;
    private CentralPanelListener centralPanelListener = new CentralPanelListener(this);

    public static void main(String[] args) {
        new PaintGUI();
    }

    public PaintGUI(){
        createBaseInterface();
        createInterface();
        this.add(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private JButton createFunctionalButton(String name, String text){
        JButton button = new JButton();
        button.setActionCommand(name + "was pressed!");
        button.setBackground(new Color(-1842206));
        button.setText(text);
        return button;
    }
    private JButton createActionButton(String name, String text){
        JButton button = new JButton();
        button.setActionCommand(name + "was pressed!");
        button.setMargin(new Insets(0, 0, 0, 0));
        button.setPreferredSize(new Dimension(30, 30));
        button.setBackground(new Color(-1842206));
        button.setText(text);
        return button;
    }
    private JButton createActionButton(String name, String text, Icon icon){
        JButton button = createActionButton(name,text);
        button.setIcon(icon);
        return button;
    }

    private void createBaseInterface(){
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(5, 5));
        mainPanel.setEnabled(false);
        mainPanel.setPreferredSize(new Dimension(600,400));
        topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        topPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), null));
        mainPanel.add(topPanel, BorderLayout.NORTH);

        leftPanel = new JPanel();
        leftPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        leftPanel.setPreferredSize(new Dimension(80, 40));
        leftPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), null));
        mainPanel.add(leftPanel, BorderLayout.WEST);

        centralPanel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                centralPanelListener.paintComponents(g);
            }
        };

        centralPanel.setLayout(new BorderLayout());
        centralPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), null));
        centralPanel.addMouseListener(centralPanelListener);
        centralPanel.addMouseMotionListener(centralPanelListener);
        mainPanel.add(centralPanel, BorderLayout.CENTER);
    }
    private void createInterface(){

        JButton funcButton1 = createFunctionalButton("ClearCentralPanel","Очистить");
        funcButton1.addActionListener(e->{centralPanel.removeAll();centralPanelListener.removeAll();});
        topPanel.add(funcButton1);
        JButton funcButton2 = createFunctionalButton("func2","Типа что-то делает");
        topPanel.add(funcButton2);
        JButton funcButton3 = createFunctionalButton("func3","Она тоже");
        topPanel.add(funcButton3);

        JButton lineButton = createActionButton("actionButton1", "", new ImageIcon(getClass().getResource("/icons/line.png")));
        lineButton.addActionListener(e -> centralPanelListener.setFigureType(FiguresEnum.line));
        leftPanel.add(lineButton);

        JButton squareButton = createActionButton("actionButton1", "", new ImageIcon(getClass().getResource("/icons/square.png")));
        squareButton.addActionListener(e -> centralPanelListener.setFigureType(FiguresEnum.square));
        leftPanel.add(squareButton);


        JButton colorButton = createActionButton("setColor", "");
        colorButton.addActionListener(e -> centralPanelListener.setColor(Color.RED));
        leftPanel.add(colorButton);

        /*
        JButton actionButton2 = createActionButton("actionButton2","");
        leftPanel.add(actionButton2);
        JButton actionButton3 = createActionButton("actionButton3","");
        leftPanel.add(actionButton3);*/
    }


}
