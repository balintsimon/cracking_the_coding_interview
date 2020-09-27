package com.codecool;

/* Question 6.1 - Dominos
    There is an 8x8 chessboard in which two diagonally opposite corners have been cut off. You are given 31 dominos,
    and a single domino can cover exactly two squares. Can you use the 31 dominos to cover the entire board? Prove
    your answer (by providing an example or shoving why it's impossible).
 */

/* Notes
    There are 8*8 = 64 squares on a chessboard, 32 of each color. If we take off two opposite corners, we are left
    with 30 squares of one of the colors (as the opposite corners match in color).

    We know that a domino covers two squares, so one of each color.

    Given that we have 31 dominos, it will take up 31 of one of the colors, but as we only have 30 of the other,
    we cannot cover the whole board. It's impossible to cover the board with dominos like this.
 */

public class Main {
}
