//import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;
//we are gonna create the data for TicTacToe
public class ThiccTacToeModel{
  // Properties
  // You could actually initialize in here instead of in constructor
  // String strBoard[][] = new String[3][3];
  private String strBoard[][];
  private int intP1Wins;
  private int intP2Wins;
  private String strWhoseTurn;
  private int intTurns;
  
    
  // Methods
  public int getP1Wins(){
    return intP1Wins;
  }
  public int getP2Wins(){
    return intP2Wins;
  }
  public String getTurn(){
    return strWhoseTurn;
  }
  public void placeThePiece(int intRow, int intCol){
    strBoard[intRow][intCol] = strWhoseTurn;
    intTurns++;
    if(strWhoseTurn.equals("X")){
      strWhoseTurn = "O";
    }else{
      strWhoseTurn = "X";
    }
  }
  public String checkWin(){
    if(strBoard[0][0].equals(strBoard[0][1]) && strBoard[0][1].equals(strBoard[0][2])){
      if(strBoard[0][0].equals("X")){
        intP1Wins++;
      }else{
        intP2Wins++;
      }
     return strBoard[0][0]; 
    }else if(strBoard[1][0].equals(strBoard[1][1]) && strBoard[1][1].equals(strBoard[1][2])){
      if(strBoard[1][0].equals("X")){
        intP1Wins++;
      }else{
        intP2Wins++;
      }
     return strBoard[1][0]; 
    }else if(strBoard[2][0].equals(strBoard[2][1]) && strBoard[2][1].equals(strBoard[2][2])){
      if(strBoard[2][0].equals("X")){
        intP1Wins++;
      }else{
        intP2Wins++;
      }
     return strBoard[2][0]; 
    }else if(strBoard[0][0].equals(strBoard[1][0]) && strBoard[1][0].equals(strBoard[2][0])){
      if(strBoard[0][0].equals("X")){
        intP1Wins++;
      }else{
        intP2Wins++;
      }
     return strBoard[0][0];
    }else if(strBoard[0][1].equals(strBoard[1][1]) && strBoard[1][1].equals(strBoard[2][1])){
      if(strBoard[0][1].equals("X")){
        intP1Wins++;
      }else{
        intP2Wins++;
      }
     return strBoard[0][1];
    }else if(strBoard[0][2].equals(strBoard[1][2]) && strBoard[1][2].equals(strBoard[2][2])){
      if(strBoard[0][2].equals("X")){
        intP1Wins++;
      }else{
        intP2Wins++;
      }
     return strBoard[0][2];
    }else if(strBoard[0][0].equals(strBoard[1][1]) && strBoard[1][1].equals(strBoard[2][2])){
      if(strBoard[0][2].equals("X")){
        intP1Wins++;
      }else{
        intP2Wins++;
      }
     return strBoard[0][0];
    }else if(strBoard[0][2].equals(strBoard[1][1]) && strBoard[1][1].equals(strBoard[2][0])){
      if(strBoard[0][0].equals("X")){
        intP1Wins++;
      }else{
        intP2Wins++;
      }
     return strBoard[0][2];
    }else{
      if(intTurns >= 9){
        return "C";
      }else{
        return " ";
      } 
    }
  }
  public void resetBoard(){
    int intR;
    int intC;
    for(intR = 0; intR < 3; intR++){
      for(intC = 0; intC < 3; intC++){
       strBoard[intR][intC] = "";
      }
      }
    intTurns = 0;
    strWhoseTurn = "X";
    }

  // Constructor
  public ThiccTacToeModel(){
    strBoard = new String[3][3];
    intP1Wins = 0;
    intP2Wins = 0;
    strWhoseTurn = "X";
    intTurns = 0;
    
  }
  // main method
  public static void main(String[] args){
    try {
      // Set System L&F
      UIManager.setLookAndFeel(
                               UIManager.getSystemLookAndFeelClassName());
    } 
    catch (UnsupportedLookAndFeelException e) {
      // handle exception
    }
    catch (ClassNotFoundException e) {
      // handle exception
    }
    catch (InstantiationException e) {
      // handle exception
    }
    catch (IllegalAccessException e) {
      // handle exception
    }
    
    //ThiccTacToeModel areaGUI = new ThiccTacToeModel();
    new ThiccTacToeModel();
  }
}