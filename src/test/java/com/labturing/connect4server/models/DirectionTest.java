package com.labturing.connect4server.models;

import org.junit.jupiter.api.Test;

public class DirectionTest {

    private Direction direction;

    @Test
    public void givenDirectionWhenGetOppositeThenReturnOpposite(){
        this.direction = Direction.NORTH;
        assertEquals(Direction.SOUTH, this.direction.getOpposite());
    }
}