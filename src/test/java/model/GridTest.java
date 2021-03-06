package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class GridTest {

    private Grid grid = new Grid();
    private Tile tile1 = mock(Tile.class);

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

    @Test
    void shouldReturnTrueAsGridIsEmpty() {
        assertTrue(grid.isEmpty());
    }

    @Test
    void shouldReturnFalseAfterInsertingTile1AsGridIsNotEmpty() {
        grid.insert(tile1,2);
        
        assertFalse(grid.isEmpty());
    }

}