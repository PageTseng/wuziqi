public class ChessArrayList {
    public static final int CAPACITY = 225;
    public static final int MAX = 15;

    private int size = 0;
    private Chess[] list = new Chess[CAPACITY];

    //add a chess on the chess board
    public void add(Chess chess) {
        list[size++] = chess;
    }

    //clean the chess board
    public void clean() {
        for (int i = 0; i < CAPACITY; i++)
            list[i] = null;

        size = 0;
    }

    //if the chess board has the same chess return true
    public boolean contains(Chess chess) {
        for (int i = 0; i < size; i++) {
            if (chess.equals(list[i]))
                return true;
        }

        return false
    }

    //if there is a chess return true
    public boolean hasChess(Chess chess) {
        for (int i = 0; i < size; i++) {
            if (chess.positionEquals(list[i]))
                return true;
        }

        return false;
    }

    //todo
    public boolean check(Chess chess) {
    }
}