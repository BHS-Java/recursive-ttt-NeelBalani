package main.java.edu;
import java.util.Scanner;

public class TicTacToe {
  private char[][] board;
  private char currentPlayer;
  private boolean turn = true;
  private boolean winner = false;

  public TicTacToe() {
    board = new char[3][3];
    currentPlayer = 'X';
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        board[i][j] = ' ';
      }
    }

    playGame();
  }

  public void playGame() {
      playTurn();
  }

  public void playTurn(){
    Scanner s = new Scanner(System.in);
    System.out.println("x input?");
    int x = s.nextInt();
    System.out.println("y input?");
    int y = s.nextInt();

    if(turn){
      board[x][y] = currentPlayer;
      currentPlayer = 'O';
      turn = !turn;
      if(!winner){
        playGame();
      }
    }
    else{
      board[x][y] = currentPlayer;
      currentPlayer = 'X';
      turn = !turn;
      if(!winner){
        playGame();
      }
    }

  };

}
