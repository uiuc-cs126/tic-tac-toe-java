package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by ________
 */
public class TicTacToeTest {

  @Test
  public void testValidBoardNoWinner() {
    assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("O...X.X.."));
  }
}
