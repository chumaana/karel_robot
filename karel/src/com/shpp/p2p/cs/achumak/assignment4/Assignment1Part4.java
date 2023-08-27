package com.shpp.p2p.cs.achumak.assignment4;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part4 extends KarelTheRobot {

// this is method where Karel exits the house, picks the beeper
// and returns to the start position

    public void run() throws Exception {
        while (frontIsClear()) {
            fillFirstLine();
            returnToSouthBorder();
            goToNextRow();
            fillSecondLine();
            returnToSouthBorder();
            goToNextRow();

        }


    }

    private void returnToSouthBorder() throws Exception {
        turnAround();
        while (frontIsClear()) {
            move();
        }
    }

    private void fillFirstLine() throws Exception {
        turnLeft();
        putBeeper();
        while (frontIsClear()) {
            putNextBeeper();
        }


    }

    private void fillSecondLine() throws Exception {
        turnLeft();
        if (frontIsClear()) {
            move();
            putBeeper();
        }
        while (frontIsClear()) {

            putNextBeeper();
        }


    }

    private void putNextBeeper() throws Exception {
        move();
        if (frontIsClear()) {
            move();
            putBeeper();
        }
    }

    private void goToNextRow() throws Exception {
        turnLeft();
        if (frontIsClear()) {

            move();
        }
    }


    private void turnAround() throws Exception {
        turnLeft();
        turnLeft();
    }


}
