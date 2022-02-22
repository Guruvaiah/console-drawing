/*
 * Copyright (c) 2022. Guruvaiah .. All rights reserved.
 */

package com.consoledrawing.command;

public class InvalidCommandParams extends RuntimeException {

    private final String help;

    public InvalidCommandParams(String message, String _help) {
        super(message);
        help = _help;
    }

    public String getHelpMessage() {
        return help;
    }
}