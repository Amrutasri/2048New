package controller;

import model.Grid;
import model.NumberGenerator;
import model.Tile;

public class Game2048 {

    private Grid grid;


    Game2048(Grid grid, NumberGenerator numberGenerator) {
        this.grid = grid;
        initialize(numberGenerator);
    }

    private void initialize(NumberGenerator numberGenerator) {
        int index1 = numberGenerator.generateRandomNumberBetweenRange(0,15);
        int index2 = numberGenerator.generateRandomNumberBetweenRange(0,15);

        Tile tile1 = grid.createTile();
        Tile tile2 = grid.createTile();

        grid.update(tile1,index1);
        grid.update(tile2,index2);
    }

    public Grid play() {
        Tile tile = grid.createTile();
        return grid;
    }
}
