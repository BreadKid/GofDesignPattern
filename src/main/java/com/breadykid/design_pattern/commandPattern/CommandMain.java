package com.breadykid.design_pattern.commandPattern;
import com.breadykid.design_pattern.commandPattern.command.Command;
import com.breadykid.design_pattern.commandPattern.command.MacroCommand;
import com.breadykid.design_pattern.commandPattern.drawer.DrawCanvas;
import com.breadykid.design_pattern.commandPattern.drawer.DrawCommand;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CommandMain extends JFrame implements ActionListener, MouseMotionListener, WindowListener {

    private MacroCommand history = new MacroCommand();
    private DrawCanvas canvas = new DrawCanvas(400,400,history);
    private JButton clear = new JButton("清除");
    private JButton undo = new JButton("撤回");

    public CommandMain(String title) throws HeadlessException {
        super(title);
        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);
        clear.addActionListener(this);
        undo.addActionListener(this);

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clear);
        buttonBox.add(undo);

        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);

        pack();
        show();
    }

    public static void main(String[] args) {
        new CommandMain("Let's start");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clear) {
            history.clear();
            canvas.repaint();
        }
        if (e.getSource() == undo) {
            history.undo();
            canvas.repaint();
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Command cmd = new DrawCommand(canvas,e.getPoint());
        history.append(cmd);
        cmd.execute();
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
