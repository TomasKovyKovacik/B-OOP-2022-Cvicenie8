package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("okno");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Logic logic = new Logic(frame);

        JButton button = new JButton("Ulozit");
        button.setFocusable(false);
        button.addActionListener(logic);

        frame.add(button);
        frame.setVisible(true);
    }
}
