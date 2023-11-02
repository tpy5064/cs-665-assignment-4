package edu.bu.met.cs665.system;

public class NewSystem implements CustomerData_HTTPS{
    public String printCustomer(int customerId) {
        return "Customer ID is: " + customerId;
    }

    public String getCustomer_HTTPS(int customerId) {
        return "Retrieving Customer with ID: " + customerId + "via REST API & HTTPS...";
    }
}
