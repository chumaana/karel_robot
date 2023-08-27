package com.shpp.p2p.cs.achumak.assignment1;
import com.shpp.karel.KarelTheRobot;

public class Assignment1Part1 extends KarelTheRobot{

// this is method where Karel exits the house, picks the beeper
// and returns to the start position

    public void run() throws Exception {
        exitHouse();
        pickBeeper();
        returnToStartPosition();
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
