package com.shpp.p2p.cs.achumak.assignment2;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part2 extends KarelTheRobot{

// this is method where Karel exits the house, picks the beeper
// and returns to the start position

    public void run() throws Exception {
        while (frontIsClear()) {
            completeTheColumn();
            goToNextColumn();
        }
        completeTheColumn();



    }

    private void goToNextColumn() throws Exception {
        for(int i=0;i<4;i++){
            move();
        }
    }

    private void completeTheColumn() throws Exception {
        turnLeft();
        goUntilWall();
        turnAround();
        putAllBeepersInColumn();
        turnLeft();
    }

    private void putAllBeepersInColumn() throws Exception {
        while(frontIsClear()){
            putBeeperIfNecessary();

         move();
        }
        putBeeperIfNecessary();
    }

    private void putBeeperIfNecessary() throws Exception {
        if(!beepersPresent()){
            putBeeper();
        }
    }


    private void turnAround() throws Exception {
        turnLeft();
        turnLeft();
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
