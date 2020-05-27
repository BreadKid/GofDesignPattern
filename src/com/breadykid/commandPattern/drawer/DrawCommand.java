package com.breadykid.commandPattern.drawer;

import com.breadykid.commandPattern.command.Command;

import java.awt.*;

/**
 * @description: 绘制命令
 * @author: Joyce Liu
 * @create: 2020-05-27 15:53
 */
public class DrawCommand implements Command {

    protected Drawable drawable;
    protected Point position;

    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }

    @Override
    public void execute() {
        drawable.draw(position.x,position.y);
    }
}
