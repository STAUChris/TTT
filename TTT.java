import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TTT implements ActionListener{
  //Properties
  JButton button1;
  JButton button2;
  JButton button3;
  JButton button4;
  JButton button5;
  JButton button6;
  JButton button7;
  JButton button8;
  JButton button9;
  JButton resultbut;
  JButton resetbut;
  JFrame theframe;
  JPanel thepanel;
  JLabel p1label;
  JLabel p2label;
  JLabel message;
  ThiccTacToeModel tttmodel;
  
  //Methods
  //two sections: first section is:
  //Local Methods for the GUI View
  
  //Controller Methods that link the view to the model
  int intWhoseTurnisit;
  
  public void actionPerformed(ActionEvent evt){
    if(evt.getSource() == button1){
      intWhoseTurnisit++;
      button1.setText(tttmodel.getTurn());
      tttmodel.placeThePiece(0, 0);
      button1.setEnabled(false);
      String strWinner = tttmodel.checkWin();
      if(strWinner.equals("X")){
        message.setText("Player 1 wins");
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
      }else if(strWinner.equals("O")){
        message.setText("Player 2 wins");
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
      }else if(strWinner.equals("C")){
        message.setText("Cat's Game");
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
      }
    }else if(evt.getSource() == button2){
      intWhoseTurnisit++;
      button2.setText(tttmodel.getTurn());
      tttmodel.placeThePiece(0, 1);
      button2.setEnabled(false);
      String strWinner = tttmodel.checkWin();
      if(strWinner.equals("X")){
        message.setText("Player 1 wins");
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
      }else if(strWinner.equals("O")){
        message.setText("Player 2 wins");
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
      }else if(strWinner.equals("C")){
        message.setText("Cat's Game");
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
      }
    }else if(evt.getSource() == button3){
      intWhoseTurnisit++;
      button3.setText(tttmodel.getTurn());
      tttmodel.placeThePiece(0, 2);
      button3.setEnabled(false);
      String strWinner = tttmodel.checkWin();
      if(strWinner.equals("X")){
        message.setText("Player 1 wins");
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
      }else if(strWinner.equals("O")){
        message.setText("Player 2 wins");
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
      }else if(strWinner.equals("C")){
        message.setText("Cat's Game");
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
      }
    }else if(evt.getSource() == button4){
      intWhoseTurnisit++;
      button4.setText(tttmodel.getTurn());
      tttmodel.placeThePiece(1, 0);
      button4.setEnabled(false);
      String strWinner = tttmodel.checkWin();
      if(strWinner.equals("X")){
        message.setText("Player 1 wins");
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
      }else if(strWinner.equals("O")){
        message.setText("Player 2 wins");
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
      }else if(strWinner.equals("C")){
        message.setText("Cat's Game");
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
      }
    }else if(evt.getSource() == button5){
      intWhoseTurnisit++;
      button5.setText(tttmodel.getTurn());
      tttmodel.placeThePiece(1, 1);
      button5.setEnabled(false);
      String strWinner = tttmodel.checkWin();
      if(strWinner.equals("X")){
        message.setText("Player 1 wins");
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
      }else if(strWinner.equals("O")){
        message.setText("Player 2 wins");
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
      }else if(strWinner.equals("C")){
        message.setText("Cat's Game");
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
      }
    }else if(evt.getSource() == button6){
      intWhoseTurnisit++;
      button6.setText(tttmodel.getTurn());
      tttmodel.placeThePiece(1, 2);
      button6.setEnabled(false);
      String strWinner = tttmodel.checkWin();
      if(strWinner.equals("X")){
        message.setText("Player 1 wins");
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
      }else if(strWinner.equals("O")){
        message.setText("Player 2 wins");
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
      }else if(strWinner.equals("C")){
        message.setText("Cat's Game");
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
      }
    }else if(evt.getSource() == button7){
      intWhoseTurnisit++;
      button7.setText(tttmodel.getTurn());
      tttmodel.placeThePiece(2, 0);
      button7.setEnabled(false);
      String strWinner = tttmodel.checkWin();
      if(strWinner.equals("X")){
        message.setText("Player 1 wins");
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
      }else if(strWinner.equals("O")){
        message.setText("Player 2 wins");
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
      }else if(strWinner.equals("C")){
        message.setText("Cat's Game");
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
      }
    }else if(evt.getSource() == button8){
      intWhoseTurnisit++;
      button8.setText(tttmodel.getTurn());
      tttmodel.placeThePiece(2, 1);
      button8.setEnabled(false);
      String strWinner = tttmodel.checkWin();
      if(strWinner.equals("X")){
        message.setText("Player 1 wins");
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
      }else if(strWinner.equals("O")){
        message.setText("Player 2 wins");
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
      }else if(strWinner.equals("C")){
        message.setText("Cat's Game");
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
      }
    }else if(evt.getSource() == button9){
      intWhoseTurnisit++;
      button9.setText(tttmodel.getTurn());
      tttmodel.placeThePiece(2, 2);
      button9.setEnabled(false);
      String strWinner = tttmodel.checkWin();
      if(strWinner.equals("X")){
        message.setText("Player 1 wins");
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
      }else if(strWinner.equals("O")){
        message.setText("Player 2 wins");
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
      }else if(strWinner.equals("C")){
        message.setText("Cat's Game");
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
      }
    }
    if(evt.getSource() == resetbut){
      intWhoseTurnisit = 0;
      button1.setEnabled(true);
      button1.setText("");
      button2.setEnabled(true);
      button2.setText("");
      button3.setEnabled(true);
      button3.setText("");
      button4.setEnabled(true);
      button4.setText("");
      button5.setEnabled(true);
      button5.setText("");
      button6.setEnabled(true);
      button6.setText("");
      button7.setEnabled(true);
      button7.setText("");
      button8.setEnabled(true);
      button8.setText("");
      button9.setEnabled(true);
      button9.setText("");
      tttmodel.resetBoard();
      message.setText("Let's Play");
    }
    if(intWhoseTurnisit % 2 == 0){
      p1label.setText("P1's Turn");
      p2label.setText("P1's Turn");
    }else{
      p1label.setText("P2's Turn");
      p2label.setText("P2's Turn");
    }
    
  }
  
  
  
  //Constructor
  public TTT(){
    //Construct the model
    tttmodel = new ThiccTacToeModel();
    tttmodel.resetBoard();
    //Setting up our VIEW of the Model View Controller
    thepanel = new JPanel();
    thepanel.setPreferredSize(new Dimension(300, 500));
    thepanel.setLayout(null);
    
    button1 = new JButton("");
    button1.setSize(100, 100);
    button1.setLocation(0, 0);
    button1.addActionListener(this);
    thepanel.add(button1);
    
    button2 = new JButton("");
    button2.setSize(100, 100);
    button2.setLocation(100, 0);
    button2.addActionListener(this);
    thepanel.add(button2);
    
    button3 = new JButton("");
    button3.setSize(100, 100);
    button3.setLocation(200, 0);
    button3.addActionListener(this);
    thepanel.add(button3);
    
    button4 = new JButton("");
    button4.setSize(100, 100);
    button4.setLocation(0, 100);
    button4.addActionListener(this);
    thepanel.add(button4);
    
    button5 = new JButton("");
    button5.setSize(100, 100);
    button5.setLocation(100, 100);
    button5.addActionListener(this);
    thepanel.add(button5);
    
    button6 = new JButton("");
    button6.setSize(100, 100);
    button6.setLocation(200, 100);
    button6.addActionListener(this);
    thepanel.add(button6);
    
    button7 = new JButton("");
    button7.setSize(100, 100);
    button7.setLocation(0, 200);
    button7.addActionListener(this);
    thepanel.add(button7);
    
    button8 = new JButton("");
    button8.setSize(100, 100);
    button8.setLocation(100, 200);
    button8.addActionListener(this);
    thepanel.add(button8);
    
    button9 = new JButton("");
    button9.setSize(100, 100);
    button9.setLocation(200, 200);
    button9.addActionListener(this);
    thepanel.add(button9);
    
    //p1label = new JLabel("P1 Wins: ");
    p1label = new JLabel("P1's Turn");
    p1label.setSize(100, 100);
    p1label.setLocation(0, 300);
    p1label.setHorizontalAlignment(JLabel.CENTER);
    thepanel.add(p1label);
    
    //p2label = new JLabel("P2 Wins: ");
    p2label = new JLabel("P1's Turn");
    p2label.setSize(100, 100);
    p2label.setLocation(200, 300);
    p2label.setHorizontalAlignment(JLabel.CENTER);
    thepanel.add(p2label);
    
    message = new JLabel("Let's Play");
    message.setSize(100, 100);
    message.setLocation(100, 300);
    message.setHorizontalAlignment(JLabel.CENTER);
    thepanel.add(message);
    
    resetbut = new JButton("Reset");
    resetbut.setSize(300, 100);
    resetbut.setLocation(0, 400);
    resetbut.addActionListener(this);
    thepanel.add(resetbut);
    
    theframe = new JFrame("Thicc Tac Toe");
    theframe.setContentPane(thepanel);
    theframe.pack();
    theframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    theframe.setVisible(true);
  }
  
  //Main program
  public static void main(String[] args){
    TTT tictac = new TTT();
    
  }
  
  
}