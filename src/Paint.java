public class Paint {
    public static final int MAX = 15;
    private char[][] chessBoard = new char[MAX][MAX];

    public Paint(ChessArrayList list) {
        for (int i = 0; i < list.getSize(); i++)
            chessBoard[list.get(i).getX() - 1][list.get(i).getY() - 1] = list.get(i).getColor();
    }

    public void onDraw() {
        System.out.print(" ");
        for (int i = 1; i <= MAX; i++)
            System.out.format("  %02d", i);
        System.out.println("");

        System.out.print("  +");
        for (int i = 0; i < MAX; i++)
            System.out.print("---+");
        System.out.println("");

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
