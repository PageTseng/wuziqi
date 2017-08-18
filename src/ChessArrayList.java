public class ChessArrayList {
    public static final int CAPACITY = 225;
    public static final int MAX = 15;

    private int size = 0;
    private Chess[] list = new Chess[CAPACITY];

    //todo
    public void add(Chess chess) {
    }

    //clean the chess board
    public void clean() {
        for (int i = 0; i < CAPACITY; i++)
            list[i] = null;

        size = 0;
    }

    //todo
    public boolean contains(Chess chess) {
    }

    //todo
    public boolean check(Chess chess) {
    }

    public class Chess {
        private int x, y;
        private char color;

        public Chess(int x, int y, char color) {
            this.x = x;
            this.y = y;
            this.color = color;
        }

        public boolean equals(Chess chess) {
            return chess.getX() == x && chess.getY() == y && chess.getColor() == color;
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
}
