package com.jannedekraker.guessTheNumber;

import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class GameFrame extends JFrame {

    private JPanel mainPanel;
    private JLabel Intro;
    private JLabel quistionOne;
    private JTextField textField1;
public GameFrame() {
    mainPanel.addComponentListener(new ComponentAdapter() {
        @Override
        public void componentResized(ComponentEvent e) {
            super.componentResized(e);
        }
    });
    mainPanel.addComponentListener(new ComponentAdapter() {
        @Override
        public void componentShown(ComponentEvent e) {
            super.componentShown(e);
        }
    });
}
}
