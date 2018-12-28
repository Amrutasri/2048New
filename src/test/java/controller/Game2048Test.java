package controller;

import model.Grid;
import model.NumberGenerator;
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
    void shouldCallInsertMethod2TimesWhenGameIsInitialized() {
        game2048.initialize();

        verify(grid,times(2)).insert(null, 0);
    }

    @Test
    void shouldReturnNonEmptyGridWhenPlayMethodIsCalled() {
        Grid newGrid = game2048.play(Direction.RIGHT);

        assertFalse(newGrid.isEmpty());
    }

    @Test
    void shouldMoveTilesInGridToRight() {
        game2048.initialize();
        game2048.play(Direction.RIGHT);

    }

}
