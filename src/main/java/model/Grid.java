package model;

public class Grid {

    private Tile[] tiles;

    Grid() {
        tiles = new Tile[16];
    }

    public Tile[] getTiles() {
        return tiles;
    }

    public boolean isEmpty() {
        int countTiles = 0;
        for(int index=0; index<16; index++) {
            if(tiles[index]!=null) {
                countTiles++;
            }
        }
        return countTiles==0;
    }

    public void insert(Tile tile, int index) {
        tiles[index] = tile;
    }
}
