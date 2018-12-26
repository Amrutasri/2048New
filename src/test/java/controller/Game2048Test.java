package controller;

import model.Grid;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

class Game2048Test {

    private Grid grid = mock(Grid.class);
    private Game2048 game2048 = new Game2048();

    @Test
    void shouldCreateANewTile() {
        game2048.play();
    }
}
