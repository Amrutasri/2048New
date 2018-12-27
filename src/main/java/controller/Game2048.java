package controller;

import model.Grid;
import model.NumberGenerator;
import model.Tile;

public class Game2048 {

    private Grid grid;
    private NumberGenerator numberGenerator;


    Game2048(Grid grid, NumberGenerator numberGenerator) {
        this.grid = grid;
        this.numberGenerator = numberGenerator;
    }

    public Grid initialize() {
        int index1 = numberGenerator.generateRandomNumberBetweenRange(0,15);
        int index2 = numberGenerator.generateRandomNumberBetweenRange(0,15);

        Tile tile1 = grid.createTile();
        Tile tile2 = grid.createTile();

        grid.insert(tile1,index1);
        grid.insert(tile2,index2);

        return grid;
    }

    public Grid play(Direction direction) {


        Tile tile = grid.createTile();
        return grid;
    }
}
