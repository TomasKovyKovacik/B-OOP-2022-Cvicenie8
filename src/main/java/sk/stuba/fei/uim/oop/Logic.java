package sk.stuba.fei.uim.oop;

import lombok.Getter;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Logic implements KeyListener, ChangeListener {

    @Getter
    private JLabel label;
    private JFrame frame;

    public Logic(JFrame frame) {
        this.frame = frame;
        this.label = new JLabel("Zaciatocny text");
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Stlacil som " + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void stateChanged(ChangeEvent e) {
        this.label.setText(" Cislo " + ((JSlider) e.getSource()).getValue());
    }
}
