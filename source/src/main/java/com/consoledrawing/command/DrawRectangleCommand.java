/*
 * Copyright (c) 2022. Guruvaiah .. All rights reserved.
 */


package com.consoledrawing.command;


import com.consoledrawing.util.Utils;
import lombok.Data;

@Data
public class DrawRectangleCommand implements DrawEntityCommand {
    private static final String helpMessage = "R x1 y1 x2 y2   Should create a new rectangle, whose upper left corner is (x1,y1) and\n" +
            "                lower right corner is (x2,y2). Horizontal and vertical lines will be drawn\n" +
            "                using the 'x' character.";
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public DrawRectangleCommand(String... params) {
        if (params.length < 4)
            throw new InvalidCommandParams("Draw Rectangle command expects 4 params", helpMessage);
        try {
            x1 = Utils.toPositiveInt(params[0]);
            y1 = Utils.toPositiveInt(params[1]);
            x2 = Utils.toPositiveInt(params[2]);
            y2 = Utils.toPositiveInt(params[3]);
        } catch (IllegalArgumentException e) {
            throw new InvalidCommandParams("Number can not be negative", helpMessage);
        }
    }


}
