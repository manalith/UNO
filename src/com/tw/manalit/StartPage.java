package com.tw.manalit;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by manalit on 2/15/14.
 */
public class StartPage extends JFrame {
    private JPanel newPanal;
    private JTextField textField1;
    private JTextField textField2;

    private JButton joinButton;
    public StartPage(){
        super("Hello world");
        setContentPane(newPanal);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        joinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(StartPage.this,"clicked");
            }
        });
        setVisible(true);

    }
}
