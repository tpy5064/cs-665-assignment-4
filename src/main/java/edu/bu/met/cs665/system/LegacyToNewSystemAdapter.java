package edu.bu.met.cs665.system;

public class LegacyToNewSystemAdapter implements CustomerData_USB{
    private CustomerData_HTTPS newSystem;

    public LegacyToNewSystemAdapter(CustomerData_HTTPS system) {
        this.newSystem = system;
    }

    public String printCustomer(int customerId) {
        System.out.println("From adapter:");
        return newSystem.printCustomer(customerId);
    }

    public String getCustomer_USB(int customerId) {
        System.out.println("Retrieving customer info using adapter...");
        return newSystem.getCustomer_HTTPS(customerId);
    }
}
