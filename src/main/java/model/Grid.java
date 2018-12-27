package model;

public class Grid {

    private Tile[] tiles;

    Grid() {
        tiles = new Tile[16];
    }

    public Tile[] getTiles() {
        return tiles;
    }

    public Tile createTile() {
        return new Tile();
    }

    public boolean isEmpty() {
        return false;
    }

    public void insert(Tile tile, int index) {
        tiles[index] = tile;
    }
}
