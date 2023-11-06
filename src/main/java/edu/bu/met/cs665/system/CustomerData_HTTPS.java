/**
 * Name: Tianqi Yang
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/06/2023
 * File Name: CustomerData_HTTPS.java
 * Description: The new way to retrieve customer data using the REST API. This interface
 * indicates the functions that needs to be implemented by the concrete class.
 */


package edu.bu.met.cs665.system;

public interface CustomerData_HTTPS {
    String printCustomer(int customerId);
    String getCustomer_HTTPS(int customerId);
}
