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
      System.out.println(board[x][y]);
    }
    else{
      board[x][y] = currentPlayer;
      System.out.println(board[x][y]);
    }

    for(int i = 0; i < board.length; i++){
      if(checkRow(i, 0, currentPlayer) || checkCol(0,i,currentPlayer) || checkNDiag(i, currentPlayer) || checkPDiag(i, currentPlayer)){
        winner = true;
      }
    }

    if(!winner){
      playGame();
      turn = !turn;
      if(currentPlayer == 'O'){
        currentPlayer = 'X';
      }
      else{
        currentPlayer = 'O';
      }
    }

  };

  public boolean checkRow(int row, int col, char player){
    if(col == 2){
      return board[row][col] == player;
    }

    if(board[row][col] != player){
      return false;
    }

    return checkRow(row, col+1, player);
  }

  public boolean checkCol(int row, int col, char player){
    if(row == 2){
      return board[row][col] == player;
    }

    if(board[row][col] != player){
      return false;
    }

    return checkCol(row+1, col, player);
  }

  public boolean checkNDiag(int n, char player){
    if(n == 2){
      return board[n][n] == player;
    }

    if(board[n][n] != player){
      return false;
    }

    return checkNDiag(n+1, player);

  }
  public boolean checkPDiag(int n, char player){
    if(n == 2){
      return board[n][2-n] == player;
    }

    if(board[n][2-n] != player){
      return false;
    }

    return checkNDiag(n+1, player);

  }
}
