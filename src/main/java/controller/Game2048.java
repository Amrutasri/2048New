package controller;

import model.Grid;
import model.Tile;

public class Game2048 {

    private Grid grid;


    Game2048(Grid grid) {
        this.grid = grid;
        initialize();
    }

    private void initialize() {

    }

    public Grid play() {
        Tile tile = grid.createTile();
        return grid;
    }
}
