package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class GridTest {

    private Grid grid = new Grid();
    private Tile tile1 = mock(Tile.class);

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

    @Test
    void shouldInsertTile1ToSpecifiedIndex2() {
        grid.insert(tile1,2);

        Tile[] tiles = grid.getTiles();

        assertEquals(tiles[2], tile1);
    }

    @Test
    void shouldNotInsertTile1ToAnyIndexOtherThan2() {
        grid.insert(tile1,2);

        Tile[] tiles = grid.getTiles();

        assertNotEquals(tiles[3],tile1);
    }

}