package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] mat = new int[N][M];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                System.out.print(" " + mat[i][j]);
            }
            System.out.println();
        }

        int X = sc.nextInt();

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(mat[i][j] == X) {
                    System.out.println("Position " + i + "," + j + ":");
                }
            }
        }
    }
}
