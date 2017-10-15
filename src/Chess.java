//棋子类，用于储存棋子的属性：x, y 坐标和颜色
public class Chess implements Constants {
    private int x, y, color;

    public Chess(int x, int y, int color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Chess(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //判断是不是同一颗棋子，x, y 坐标及其颜色相同则返回 true
    public boolean equals(Chess chess) {
        return chess.getX() == x && chess.getY() == y && chess.getColor() == color;
    }

    //判断是否有位置相同的棋子，若有则返回 true
    public boolean positionEquals(Chess chess) {
        return chess.getX() == x && chess.getY() == y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getColor() {
        return color;
    }
}

