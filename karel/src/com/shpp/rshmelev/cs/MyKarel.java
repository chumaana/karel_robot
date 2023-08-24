package com.shpp.rshmelev.cs;

import com.shpp.karel.KarelTheRobot;

public class MyKarel extends KarelTheRobot{

//  this is method where Karel pics beeper
//    and moves it to the destination

////start
//    public void run() throws Exception {
////    find beeper and pick it
//        move();
//        move();
//        move();
//        move();
//       pickBeeper();
//
////       put beeper to final destination
//       turnLeft();
//       move();
//       move();
//       turnLeft();
//       move();
//       move();
//       putBeeper();
//    }

//start2
public void run() throws Exception {
//      go to second row
    move();
   turnLeft();
   move();

    //    find beeper and pick it
    turnRight();
    move();
    pickBeeper();

//       put beeper to final destination
    turnLeft();
    move();
    turnRight();
    move();
    move();
    putBeeper();
}

private void turnRight() throws Exception {
    turnLeft();
    turnLeft();
    turnLeft();
}
}
