/**
 * Name: Tianqi Yang
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/06/2023
 * File Name: LegacySystem.java
 * Description: The concrete implementation of CustomerData_USB. the getCustomer_USB function
 * indicates that the data is retrieved via USB, which differs from the NewSystem class.
 */

package edu.bu.met.cs665.system;

public class LegacySystem implements CustomerData_USB{
    /**
     * This is the LegacySystem class.
     * This class is responsible for representing the old legacy system.
     */
    public String printCustomer(int customerId) {
        /**
         * Returns the customer id.
         *
         * @param customerId the customer's id
         */
        return "Customer ID is: " + customerId;
    }

    public String getCustomer_USB(int customerId) {
        /**
         * Returns the customer via USB.
         *
         * @param customerId the customer's id
         */
        return "Retrieved Customer with ID: " + customerId + " via USB.";
    }
}
