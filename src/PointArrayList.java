public class PointArrayList {
    public static final int CAPACITY = 225;
    public static final int MAX = 15;

    private int size = 0;
    private Point[] list = new Point[CAPACITY];

    //todo
    public void add(Point point) {
    }

    //todo
    public void clean() {
    }

    //todo
    public boolean contains(Point point) {
    }

    //todo
    public boolean check(Point point) {
    }

    public class Point {
        private int x, y;
        private char color;

        public Point(int x, int y, char color) {
            this.x = x;
            this.y = y;
            this.color = color;
        }

        //todo
        public boolean equals(Point point) {
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
