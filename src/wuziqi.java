import java.util.Scanner;

public class wuziqi {
    public static final int BLACK = 1;
    public static final int WHITE = -1;
    public static final int DRAW = 0;
    public static final int MAX = 15;

    public static void main(String[] aargs) {
        ChessArrayList list = new ChessArrayList();
        Scanner input = new Scanner(System.in);
        int x, y;
        int winner = DRAW;
        (new Paint(list)).onDraw();

        while (true) {
            Chess blackChess, whiteChess;
            System.out.print("black: ");
            x = input.nextInt();
            y = input.nextInt();

            while (list.hasChess(new Chess(x, y)) || (x <= 0 || x > MAX) || (y <= 0 || y > MAX)) {
                System.out.print("There is a chess piece or the position over the chess board(15*15)! Please enter a new position\n" + "black: ");
                x = input.nextInt();
                y = input.nextInt();
            }    

            blackChess = new Chess(x, y, 'b');
            list.add(blackChess);
            (new Paint(list)).onDraw();
            if (list.check(blackChess)) {
                winner = BLACK;
                break;
            }

            System.out.print("white: ");
            x = input.nextInt();
            y = input.nextInt();

            while (list.hasChess(new Chess(x, y)) || (x <= 0 || x > MAX) || (y <= 0 || y > MAX)) {
                System.out.print("There is a chess piece or the position over the chess board(15*15)! Please enter a new position\n" + "black: ");
                x = input.nextInt();
                y = input.nextInt();
            }    

            whiteChess = new Chess(x, y, 'w');
            list.add(whiteChess);
            (new Paint(list)).onDraw();
            if (list.check(whiteChess)) {
                winner = WHITE;
                break;
            }
        }

        if (winner == BLACK)
            System.out.println("black win!");
        else if (winner == WHITE)
            System.out.println("white win!");
        else
            System.out.println("It ends in a draw!");
    }
}
