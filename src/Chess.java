public class Chess {
    private int x, y;
    private char color;

    public Chess(int x, int y, char color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public boolean equals(Chess chess) {
        return chess.getX() == x && chess.getY() == y && chess.getColor() == color;
    }

    //if the chess positin is the same return true
    public boolean positionEquals(Chess chess) {
        return chess.getX() == x && chess.getY() == y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getColor() {
        return color;
    }
}

