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

        return false;
   }

    //if there is a chess return true
    public boolean hasChess(Chess chess) {
        for (int i = 0; i < size; i++) {
            if (chess.positionEquals(list[i]))
                return true;
        }

        return false;
    }

    public boolean check(Chess chess) {
        return checkA(chess) || checkB(chess) || checkC(chess) || checkD(chess);
    }

    public boolean checkA(Chess chess) {
        int x = chess.getX();
        int y = chess.getY();
        char color = chess.getColor();
        int num = 1;

        while (--x >= 1 && contains(new Chess(x, y, color)))
            num++;
        if (num >= 5)
            return true;

        x = chess.getX();
        
        while (++x <= MAX && contains(new Chess(x, y, color)))
            num++;
        if (num >= 5)
            return true;
    
        return false;
    }

    public boolean checkB(Chess chess) {
        int x = chess.getX();
        int y = chess.getY();
        char color = chess.getColor();
        int num = 1;

        while (--y >= 1 && contains(new Chess(x, y, color)))
            num++;
        if (num >= 5)
            return true;

        y = chess.getY();

        while (++y <= MAX && contains(new Chess(x, y, color)))
            num++;
        if (num >= 5)
            return true;

        return false;
    }

    public boolean checkC(Chess chess) {
        int x = chess.getX();
        int y = chess.getY();
        char color = chess.getColor();
        int num = 1;

        while (--x >= 1 && --y >= 1 && contains(new Chess(x, y, color)))
            num++;
        if (num >= 5)
            return true;

        x = chess.getX();
        y = chess.getY();

        while (++x <= MAX && ++y <= MAX && contains(new Chess(x, y, color)))
            num++;
        if (num >= 5)
            return true;

        return false;
    }

    public boolean checkD(Chess chess) {
        int x = chess.getX();
        int y = chess.getY();
        char color = chess.getColor();
        int num = 1;

        while (--x >= 1 && ++y <= MAX && contains(new Chess(x, y, color)))
            num++;
        if (num >= 5)
            return true;

        x = chess.getX();
        y = chess.getY();

        while (++x <= MAX && --y >= 1 && contains(new Chess(x, y, color)))
            num++;
        if (num >= 5)
            return true;

        return false;
    }
}
