/**
 * Name: Tianqi Yang
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/06/2023
 * File Name: LegacyToNewSystemAdapter.java
 * Description: The adapter that re-wires the request from the old system's API
 * to fire the new system's API accordingly.
 */


package edu.bu.met.cs665.system;

public class LegacyToNewSystemAdapter implements CustomerData_USB{
    /**
     * This is the LegacyToNewSystemAdapter class.
     * This class is responsible for representing the adapter
     * that matches the old system to the new system.
     */
    private CustomerData_HTTPS newSystem;

    public LegacyToNewSystemAdapter(CustomerData_HTTPS system) {
        /**
         * Creates the adapter with the new system as the target.
         *
         * @param system The new system to be adapted.
         */
        this.newSystem = system;
    }

    public String printCustomer(int customerId) {
        /**
         * Calls the new system's printCustomer method.
         *
         * @param customerId the customer's id
         */
        //Indicates that the adapter is being used.
        System.out.println("From adapter:");
        return newSystem.printCustomer(customerId);
    }

    public String getCustomer_USB(int customerId) {
        /**
         * Calls the new system's getCustomer_HTTPS method.
         *
         * @param customerId the customer's id
         */
        //Indicate that we are using the adapter to re-wire the request.
        System.out.println("Retrieving customer info using adapter...");
        return newSystem.getCustomer_HTTPS(customerId);
    }
}
