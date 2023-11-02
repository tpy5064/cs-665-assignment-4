package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import edu.bu.met.cs665.system.*;
import org.junit.Test;


public class TestAdapter {

    public TestAdapter() {
    }

    //Test the legacy system is working
    @Test
    public void testLegacySystem() {
        CustomerData_USB legacySystem = new LegacySystem();
        assertEquals(legacySystem.printCustomer(1), "Customer ID is: 1");
        assertEquals(legacySystem.getCustomer_USB(1), "Retrieved Customer with ID: 1 via USB.");
    }

    //Test the new system is working
    @Test
    public void testNewSystem() {
        CustomerData_HTTPS newSystem = new NewSystem();
        assertEquals(newSystem.printCustomer(1), "Customer ID is: 1");
        assertEquals(newSystem.getCustomer_HTTPS(1), "Retrieved Customer with ID: 1 " +
                "via REST API & HTTPS.");
    }

    //Test the adapter is working
    @Test
    public void testAdapter() {
        CustomerData_HTTPS newSystem = new NewSystem();
        CustomerData_USB adapter = new LegacyToNewSystemAdapter(newSystem);
        assertEquals(adapter.printCustomer(1), "Customer ID is: 1");
        assertEquals(adapter.getCustomer_USB(1), "Retrieved Customer with ID: 1 " +
                "via REST API & HTTPS.");
    }

}
