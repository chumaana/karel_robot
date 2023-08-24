package com.shpp.rshmelev.cs;

import com.shpp.karel.KarelTheRobot;

public class MyKarel extends KarelTheRobot{

//  this is method where Karel pics beeper
//    and moves it to the destination


    public void run() throws Exception {
//    find beeper and pick it
        move();
        move();
        move();
        move();
       pickBeeper();

//       put beeper to final destination
       turnLeft();
       move();
       move();
       turnLeft();
       move();
       move();
       putBeeper();
    }
}
