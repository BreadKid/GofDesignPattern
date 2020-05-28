package com.breadykid.design_pattern.commandPattern.drawer;


import com.breadykid.design_pattern.commandPattern.command.MacroCommand;

import java.awt.*;

/**
 * @description: drawable的实现
 * @author: Joyce Liu
 * @create: 2020-05-27 16:04
 */
public class DrawCanvas extends Canvas implements Drawable {

    private Color color = Color.BLUE;
    private int radius = 5;
    private MacroCommand history;

    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.orange);
        this.history = history;
    }

    public void paint(Graphics graphics) {
        history.execute();
    }

    @Override
    public void draw(int x, int y) {
        Graphics graphics = getGraphics();
        graphics.setColor(color);
        graphics.fillOval(x-radius,y-radius,radius*2,radius*2);
    }
}
