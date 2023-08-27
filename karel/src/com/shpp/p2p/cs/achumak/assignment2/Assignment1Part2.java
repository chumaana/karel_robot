package com.shpp.p2p.cs.achumak.assignment2;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part2 extends KarelTheRobot{

// this is method where Karel exits the house, picks the beeper
// and returns to the start position

    public void run() throws Exception {
        goUntilWall();

        pickBeeper();
        returnToStartPosition();
    }

    private void goUntilWall() throws Exception {
        while(frontIsClear()){
            move();
        }

    }

    private void returnToStartPosition() throws Exception {
        turnLeft();
        turnLeft();
        for(int i=0;i<4;i++){
            move();
        }
        turnRight();
        move();
        turnRight();

    }

    private void exitHouse() throws Exception {
        move();
        move();
        turnRight();
        move();
        turnLeft();
        move();
        move();

    }

    private void turnRight() throws Exception {
        turnLeft();
        turnLeft();
        turnLeft();
    }

}
