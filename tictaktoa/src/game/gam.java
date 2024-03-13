package game;
import player.play;
import board.b;
import java.util.Scanner;

public class gam {
    play[] players;
    b b1;
    int turn;
    int nofplay;
    boolean gameover;
    String zero;
    String cross;

    public gam() {
        StringBuilder z = new StringBuilder();
        StringBuilder c = new StringBuilder();
        for (int i = 0; i < b1.size; i++) {
            c.append('X');
            z.append('0');
        }
        this.zero = z.toString();
        this.cross = c.toString();
    }

    public int getindex() {
        int pos;
        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.println("Player " + players[turn].getname() + ", enter your position:");
            int sz = b1.size;
            pos = scn.nextInt() - 1;
            int row = pos / sz;
            int col = pos % sz;

            if (row < 0 || row >= sz || col < 0 || col >= sz) {
                System.out.println("Invalid position, please try again.");
                continue;
            }
            if (b1.mat[row][col] != '-') {
                System.out.println("Position already filled, please try again.");
                continue;
            }
            break; // Break out of the loop when a valid input is received
        }
        return pos;
    }

    public boolean check() {
        int sz = b1.size;
        // Check rows
        for (int i = 0; i < sz; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < sz; j++) {
                sb.append(b1.mat[i][j]);
            }
            if (sb.toString().equals(cross) || sb.toString().equals(zero)) {
                return true;
            }
        }

        // Check columns
        for (int i = 0; i < sz; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < sz; j++) {
                sb.append(b1.mat[j][i]);
            }
            if (sb.toString().equals(cross) || sb.toString().equals(zero)) {
                return true;
            }
        }

        // Check main diagonal
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sz; i++) {
            sb.append(b1.mat[i][i]);
        }
        if (sb.toString().equals(cross) || sb.toString().equals(zero)) {
            return true;
        }

        // Check secondary diagonal
        sb = new StringBuilder();
        for (int i = 0; i < sz; i++) {
            sb.append(b1.mat[i][sz - i - 1]);
        }
        if (sb.toString().equals(cross) || sb.toString().equals(zero)) {
            return true;
        }

        return false;
    }

    public void getconfigu() {
        int sz = b1.size;
        for (int i = 0; i < sz; i++) {
            for (int j = 0; j < sz; j++) {
                System.out.print(b1.mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
