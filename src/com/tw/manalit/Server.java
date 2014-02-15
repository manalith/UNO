package com.tw.manalit;

import javax.swing.*;

public class Server extends JFrame{
    private JPanel server;
    private JScrollPane player;
    private JTextArea samikshaTextArea;
    private JTextArea status;

    public Server(){
        super("Hello world");
        setContentPane(server);
//        pack();
        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
