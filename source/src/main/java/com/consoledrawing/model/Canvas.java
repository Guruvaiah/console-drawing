/*
 * Copyright (c) 2022. Guruvaiah .. All rights reserved.
 */


package com.consoledrawing.model;

public interface Canvas {

    void addEntity(Entity entity) throws InvalidEntityException;

    String render();
}
