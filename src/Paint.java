//绘制棋盘
public class Paint {
    public static final int MAX = 15;    //棋盘行列最大值
    private char[][] chessBoard = new char[MAX][MAX];    //记录棋盘上各点上棋子颜色

    //初始化
    public Paint(ChessArrayList list) {
        //将储存棋子记录的线性表转化为 chessBoard
        for (int i = 0; i < list.getSize(); i++)
            chessBoard[list.get(i).getX() - 1][list.get(i).getY() - 1] = list.get(i).getColor();
    }

    //绘制
    public void onDraw() {
        //绘制横坐标
        System.out.print(" ");
        for (int i = 1; i <= MAX; i++)
            System.out.format("  %02d", i);
        System.out.println("");

        //绘制棋盘顶部界线
        System.out.print("  +");
        for (int i = 0; i < MAX; i++)
            System.out.print("---+");
        System.out.println("");

        //循环将棋盘其余部分绘制完毕
        for (int i = 1; i <= MAX; i++) {
            System.out.format("%02d|", i);
            for (int j = 1; j <= MAX; j++) {
                switch(chessBoard[j - 1][i - 1]) {
                    case 'b':
                        System.out.print(" O |");
                        break;
                    case 'w':
                        System.out.print(" @ |");
                        break;
                    default:
                        System.out.print("   |");
                        break;
                }
            }
            System.out.println("");

            System.out.print("  +");
            for (int k = 0; k < MAX; k++)
                System.out.print("---+");
            System.out.println("");
        }
    }
}
