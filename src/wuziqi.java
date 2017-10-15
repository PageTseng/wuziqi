import java.util.Scanner;

public class wuziqi implements Constants {
    public static void main(String[] aargs) {
        ChessArrayList list = new ChessArrayList();
        Scanner input = new Scanner(System.in);
        int color = BLACK;
        String colorString = null;
        String option = null;
        int x, y;
        int winner = DRAW;
        Chess chess = null;
        (new Paint(list)).onDraw();    //绘制棋盘

        //无限循环双方下棋，直至一方胜利或者棋盘下满
        while (true) {
            while (true) {
                if (color == BLACK)
                    colorString = "black";
                else
                    colorString = "white";

                System.out.print(colorString + ": ");
                option = input.next();
                if (option.equals("retract")) {
                    list.remove();
                    if (color == BLACK)
                        color = WHITE;
                    else
                        color = BLACK;
                    (new Paint(list)).onDraw();
                } else
                    break;
            }

            x = input.nextInt();
            y = input.nextInt();

            //循环输入棋子坐标，直至输入合理（坐标上没有棋子，不超出棋盘）的坐标才退出循环
            while (list.hasChess(new Chess(x, y)) || (x <= 0 || x > MAX) || (y <= 0 || y > MAX)) {
                System.out.print("There is a chess piece or the position over the chess board(15*15)! Please enter a new position\n" + colorString + ": ");
                x = input.nextInt();
                y = input.nextInt();
            }    

            chess = new Chess(x, y, color);
            list.add(chess);
            (new Paint(list)).onDraw();

            //检查是否胜利
            if (list.check(chess)) {
                winner = BLACK;
                break;
            }

            if (list.getSize() >= MAX * MAX)
                break;

            if (color == BLACK)
                color = WHITE;
            else
                color = BLACK;
        }

        //输出游戏结果
        if (winner == BLACK)
            System.out.println("black win!");
        else if (winner == WHITE)
            System.out.println("white win!");
        else
            System.out.println("It ends in a draw!");
    }
}
