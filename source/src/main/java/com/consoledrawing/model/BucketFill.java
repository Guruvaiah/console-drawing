/*
 * Copyright (c) 2022. Guruvaiah .. All rights reserved.
 */

package com.consoledrawing.model;

import com.consoledrawing.util.Utils;
import lombok.Data;

@Data
public class BucketFill implements Entity {
    private int  x;
    private int  y;
    private char character;

    public BucketFill(int _x1, int _y1, char character) {
        Utils.shouldAllPositive(_x1, _y1);
        this.x = _x1;
        this.y = _y1;
        this.character = character;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BucketFill that = (BucketFill) o;

        if (x != that.x) return false;
        if (y != that.y) return false;
        return character == that.character;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        result = 31 * result + (int) character;
        return result;
    }
}