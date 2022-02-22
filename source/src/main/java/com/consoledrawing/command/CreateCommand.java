/*
 * Copyright (c) 2022. Guruvaiah .. All rights reserved.
 */


package com.consoledrawing.command;


import com.consoledrawing.util.Utils;
import lombok.Data;

@Data
public class CreateCommand implements Command {

    private static String helpMessage = "C w h           Should create a new canvas of width w and height h. w, h should be > 0";
    private int height;
    private int width;

    public CreateCommand(String... params) {
        if (params.length < 2)
            throw new InvalidCommandParams("Create command expects 2 params", helpMessage);
        try {
            width = Utils.toPositiveInt(params[0]);
            height = Utils.toPositiveInt(params[1]);
        } catch (IllegalArgumentException e) {
            throw new InvalidCommandParams("Number must >= 0", helpMessage);
        }
    }
}