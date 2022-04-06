package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("okno");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.CYAN);
        frame.setLayout(new BorderLayout());

        Logic logic = new Logic(frame);
        frame.addKeyListener(logic);

        JPanel menu = new JPanel();
        menu.setBackground(Color.YELLOW);
        menu.setLayout(new GridLayout(2,1));

        JSlider slider = new JSlider(JSlider.HORIZONTAL, 10, 50, 20);
        slider.setMajorTickSpacing(5);
        slider.setMinorTickSpacing(5);
        slider.setSnapToTicks(true);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.addChangeListener(logic);
        slider.setFocusable(false);

        menu.add(slider);
        menu.add(logic.getLabel());

        frame.add(menu, BorderLayout.PAGE_END);

        frame.setVisible(true);
    }
}
