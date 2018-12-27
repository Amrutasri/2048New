package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GridTest {

    private Grid grid = new Grid();

    @Test
    void shouldReturnTileOnlyWhenCreateTileIsCalled() {
        Tile tile = grid.createTile();

        assertEquals(tile.getClass(), Tile.class);
    }

    @Test
    void shouldNotReturnAnyOtherThanTileClassWhenCreateTileIsCalled() {
        Tile tile = grid.createTile();

        assertNotEquals(tile.getClass(),Grid.class);
    }

}