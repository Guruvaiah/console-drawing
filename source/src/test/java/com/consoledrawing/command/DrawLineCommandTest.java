/*
 * Copyright (c) 2022. Guruvaiah .. All rights reserved.
 */


package com.consoledrawing.command;

import org.junit.Test;

public class DrawLineCommandTest {
    @Test
    public void testCreate() throws Exception {
        new DrawLineCommand("1", "1", "1", "2");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreate1() throws Exception {
        new DrawLineCommand("-1", "1", "1", "2");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreate2() throws Exception {
        new DrawLineCommand("1", "-1", "1", "2");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreate3() throws Exception {
        new DrawLineCommand("1", "1");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreate4() throws Exception {
        new DrawLineCommand("1");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreate6() throws Exception {
        new DrawLineCommand();
    }
}