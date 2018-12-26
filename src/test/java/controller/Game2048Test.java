package controller;

import model.Grid;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class Game2048Test {

    private Grid grid = mock(Grid.class);
    private Game2048 game2048 = new Game2048(grid);

    @Test
    void shouldCreateANewTile() {
        game2048.play();
        verify(grid).createTile();
    }
}
