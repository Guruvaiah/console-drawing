/*
 * Copyright (c) 2022. Guruvaiah .. All rights reserved.
 */

package com.consoledrawing.model;

import com.consoledrawing.command.BucketFillCommand;
import com.consoledrawing.command.DrawEntityCommand;
import com.consoledrawing.command.DrawLineCommand;
import com.consoledrawing.command.DrawRectangleCommand;

public class EntityFactory {

    public Entity getEntity(DrawEntityCommand command) {
        if (command instanceof DrawLineCommand) {
            DrawLineCommand cmd = (DrawLineCommand) command;
            return new Line(cmd.getX1(), cmd.getY1(), cmd.getX2(), cmd.getY2());
        } else if (command instanceof DrawRectangleCommand) {
            DrawRectangleCommand cmd = (DrawRectangleCommand) command;
            return new Rectangle(cmd.getX1(), cmd.getY1(), cmd.getX2(), cmd.getY2());
        } else if (command instanceof BucketFillCommand) {
            BucketFillCommand cmd = (BucketFillCommand) command;
            return new BucketFill(cmd.getX(), cmd.getY(), cmd.getCharacter());
        }
        return null;
    }
}
