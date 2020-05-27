package com.breadykid.commandPattern.command;

import java.util.Iterator;
import java.util.Optional;
import java.util.Stack;

/**
 * @description: 命令整合实现类
 * @author: Joyce Liu
 * @create: 2020-05-23 11:00
 */
public class MacroCommand implements Command {

    // 命令集合
    private Stack commands = new Stack();

    /**
     * 执行命令
     */
    @Override
    public void execute() {
        Iterator iterator = commands.iterator();
        while (iterator.hasNext()) {
            ((Command)iterator.next()).execute();
        }
    }

    /**
     * 添加命令
     * @param cmd
     */
    public void append(Command cmd) {
        if (Optional.of(cmd).isPresent()) {
            commands.push(cmd);
        }
    }

    /**
     * 删除最后一条命令
     */
    public void undo() {
        if (!commands.isEmpty()) {
            commands.pop();
        }
    }

    /**
     * 删除所有命令
     */
    public void clear() {
        commands.clear();
    }

}
