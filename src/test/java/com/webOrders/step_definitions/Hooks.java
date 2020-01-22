package com.webOrders.step_definitions;

import com.webOrders.utilities.Driver;
import io.cucumber.java.After;

public class Hooks {







//will close browser after evry test

@After
public void tearDown(){
    Driver.close();
}


}
