/*
 * Copyright (c) 2022. Guruvaiah .. All rights reserved.
 */

package com.consoledrawing.model;

import com.consoledrawing.util.Utils;
import lombok.Data;

@Data
public class Point {
    public Point(int _x1, int _y1) {
        Utils.shouldAllNonNegative(_x1, _y1);
        this.x = _x1;
        this.y = _y1;
    }

    private int x;
    private int y;

}