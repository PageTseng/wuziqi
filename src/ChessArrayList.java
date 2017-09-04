//用来记录下的每颗棋的数组型线性表
public class ChessArrayList {
    //该棋盘为 15 × 15
    public static final int CAPACITY = 225;    //棋盘最多下 225 颗棋
    public static final int MAX = 15;    //棋盘行列的数目

    private int size = 0;    //记录已经下了的棋子的数目也是该线性表的 size
    private Chess[] list = new Chess[CAPACITY];    //该线性表储存数据的数组

    //添加棋子
    public void add(Chess chess) {
        list[size++] = chess;
    }

    //获取第 index 步的棋子对象
    public Chess get(int index) {
        return list[index];
    }

    //获得 size
    public int getSize() {
        return size;
    }

    //清空棋盘
    public void clean() {
        for (int i = 0; i < CAPACITY; i++)
            list[i] = null;

        size = 0;
    }

    //如果棋盘上含有相同的棋子则返回 true
    public boolean contains(Chess chess) {
        for (int i = 0; i < size; i++) {
            if (chess.equals(list[i]))
                return true;
        }

        return false;
   }

    //如果某位置有棋子则返回 true
    public boolean hasChess(Chess chess) {
        for (int i = 0; i < size; i++) {
            if (chess.positionEquals(list[i]))
                return true;
        }

        return false;
    }

    //通过四个方向的 check(A, B, C, D) ，检查是否胜利，胜利则返回 true
    public boolean check(Chess chess) {
        return checkA(chess) || checkB(chess) || checkC(chess) || checkD(chess);
    }

    //检查方向 A （横向）是否胜利，胜利则返回 true
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

    //检查方向 B （纵向）是否胜利，胜利则返回 true
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

    //检查方向 C （左上到右下）是否胜利，胜利则返回 true
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

    //检查方向 D （左下到右上）是否胜利，胜利则返回 true
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
