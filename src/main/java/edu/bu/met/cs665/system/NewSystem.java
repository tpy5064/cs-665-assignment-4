/**
 * Name: Tianqi Yang
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/06/2023
 * File Name: NewSystem.java
 * Description: The concrete implementation of CustomerData_HTTPS. the getCustomer_HTTPS function
 * indicates that the data is retrieved via REST, which differs from the OldSystem class.
 */


package edu.bu.met.cs665.system;

public class NewSystem implements CustomerData_HTTPS{
    /**
     * This is the NewSystem class.
     * This class is responsible for representing the new system.
     */
    public String printCustomer(int customerId) {
        /**
         * Returns the customer id.
         *
         * @param customerId the customer's id
         */
        return "Customer ID is: " + customerId;
    }

    public String getCustomer_HTTPS(int customerId) {
        /**
         * Returns the customer via HTTPS.
         *
         * @param customerId the customer's id
         */
        return "Retrieved Customer with ID: " + customerId + " via REST API & HTTPS.";
    }
}
