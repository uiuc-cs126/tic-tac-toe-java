package com.example;

/**
 * Takes in and evaluates a string representing a tic tac toe board.
 */
public class TicTacToeBoard {

  /**
   * This method should load a string into your TicTacToeBoard class.
   * @param board The string representing the board
   */
  public TicTacToeBoard(String board) {

  }

  /**
   * Checks the state of hte board (unreachable, no winner, or winning)
   * @return an enum value corresponding to the board evaluation
   */
  public Evaluation evaluateBoard() {
    return Evaluation.UnreachableState;
  }
}
