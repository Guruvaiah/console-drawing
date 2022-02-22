/*
 * Copyright (c) 2022. Guruvaiah .. All rights reserved.
 */


package com.consoledrawing.model;

import org.junit.Test;

public class PointTest {
    @Test
    public void create() throws Exception {
        new Point(1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void create3() throws Exception {
        new Point(-1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void create4() throws Exception {
        new Point(1, -2);
    }
}