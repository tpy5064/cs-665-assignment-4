package edu.bu.met.cs665.system;

public class LegacySystem implements CustomerData_USB{
    public String printCustomer(int customerId) {
        return "Customer ID is: " + customerId;
    }

    public String getCustomer_USB(int customerId) {
        return "Retrieved Customer with ID: " + customerId + " via USB.";
    }
}
