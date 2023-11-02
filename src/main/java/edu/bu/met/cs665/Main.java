/**
 * Name: FIRST_NAME LAST_NAME
 * Course: CS-665 Software Designs & Patterns
 * Date: MM/DD/YYYY
 * File Name: Main.java
 * Description: Write a description for this class
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.system.*;

/**
 * This is the Main class.
 */
public class Main {


  public static void main(String[] args) {
    //The legacy way to retrieve customer via ID:
    CustomerData_USB legacySystem = new LegacySystem();
    System.out.println(legacySystem.printCustomer(1));
    System.out.println(legacySystem.getCustomer_USB(1));

    //The new system to retrieve customer info:
    CustomerData_HTTPS newSystem = new NewSystem();

    //The adapter to merge the new system's functionality with the legacy system's API:
    CustomerData_USB adapter = new LegacyToNewSystemAdapter(newSystem);

    //System.out.println("From adapter:") to indicate it is called from the adapter.
    System.out.println(adapter.printCustomer(1));

    //Despite calling the same named method, the REST API of the new system is called.
    System.out.println(adapter.getCustomer_USB(1));
  }


}
