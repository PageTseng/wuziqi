# wuziqi
简易 Java 五子棋实现

# 使用方法
本程序的棋盘大小是 15*15 的，输入坐标时先输 x 坐标，然后空格再输 y 坐标，x, y 坐标范围都在 1——15 ，坐上角为（1，1）点，右下角为（15,15）点。
```
black:1 1
```
black: 表示黑子下棋，1 1表示下在(1，1）点，即左上角。
当输入已经有棋子的坐标时或超过棋盘范围的坐标时会显示
```
There is a chess piece or the position over the chess board(15*15)! Please enter a new position
```

# how to use
This program's chessboard is 15*15. First, you should enter the value of x. Then enter a blank. Finally you should enter the value of y. The value of x and y should between 1 to 15. The position of (1, 1) is in the upper left corner. The position of (15, 15) is in the lower right corner.
```
black:1 1
```
"black:" means that turn black chess, "1 1" means that want to put on (1, 1).
when you enter a position which has a chess piece or the position over the chess board, the program will display
```
There is a chess piece or the position over the chess board(15*15)! Please enter a new position
```
