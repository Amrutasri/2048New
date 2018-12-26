package controller;

import model.Grid;
import model.NumberGenerator;
import model.Tile;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class Game2048Test {

    private NumberGenerator numberGenerator = mock(NumberGenerator.class);
    private Grid grid = mock(Grid.class);
    private Game2048 game2048 = new Game2048(grid,numberGenerator);

    @Test
    void shouldCallUpdateMethod2Times() {
        verify(grid,times(2)).update(null, 0);
    }

    @Test
    void shouldCreateANewTile() {
        game2048.play();

        verify(grid, times(3)).createTile();
    }

    @Test
    void shouldReturnNonEmptyGrid() {
        Grid newGrid = game2048.play();

        assertFalse(newGrid.isEmpty());
    }

}
