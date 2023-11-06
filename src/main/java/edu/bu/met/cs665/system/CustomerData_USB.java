/**
 * Name: Tianqi Yang
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/06/2023
 * File Name: CustomerData_USB.java
 * Description: The old way to retrieve customer data using USB. This interface
 * indicates the functions that needs to be implemented by the concrete class.
 */

package edu.bu.met.cs665.system;

public interface CustomerData_USB {
    String printCustomer(int customerId);
    String getCustomer_USB(int customerId);
}
