package com.vytrack.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {

    @Before    //must be from i.o cucumber.java
    public void setup(){
        System.out.println("Test setup! ");
    }

    @After  //must be from i.o cucumber.java
    public void teardown(){
        System.out.println("Cleanup!");
        System.out.println("Test completed!");
    }

}
