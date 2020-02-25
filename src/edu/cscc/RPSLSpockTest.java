package edu.cscc;

/**
 * Lab 7
 * Rock, paper, scissors, lizard, spock game
 * @author Orsolya Papp
 */

import org.junit.Assert;
import org.junit.Test;

public class RPSLSpockTest {

    @Test
    public void isValidPick() {
    Assert.assertTrue (RPSLSpock.isValidPick(RPSLSpock.ROCK));
    Assert.assertTrue (RPSLSpock.isValidPick(RPSLSpock.PAPER));
    Assert.assertTrue (RPSLSpock.isValidPick(RPSLSpock.SCISSORS));
    Assert.assertTrue (RPSLSpock.isValidPick(RPSLSpock.LIZARD));
    Assert.assertTrue (RPSLSpock.isValidPick(RPSLSpock.SPOCK));
    Assert.assertFalse (RPSLSpock.isValidPick("banana"));
    }
    @Test
    public void generatePick() {
    for (int i=0; i<100000; i++);
    String pick = RPSLSpock.generatePick();
    Assert.assertNotNull(pick);
    Assert.assertTrue (RPSLSpock.isValidPick(pick));
    }

    @Test
    public void isComputerWin() {
    Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.ROCK,RPSLSpock.SCISSORS));
    Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.PAPER,RPSLSpock.ROCK));
    Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS,RPSLSpock.PAPER));
    Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.PAPER,RPSLSpock.SPOCK));
    Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SPOCK,RPSLSpock.ROCK));
    Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS,RPSLSpock.LIZARD));
    Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.ROCK,RPSLSpock.LIZARD));
    Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.LIZARD,RPSLSpock.SPOCK));
    Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.LIZARD,RPSLSpock.PAPER));
    Assert.assertFalse(RPSLSpock.isComputerWin(RPSLSpock.PAPER,RPSLSpock.LIZARD));
    }
}