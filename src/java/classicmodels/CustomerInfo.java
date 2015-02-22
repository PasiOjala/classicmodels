/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classicmodels;

/**
 *
 * @author Pasi
 */
public class CustomerInfo {

    private final int customerNumber;
    
    private final String customerName;
    private final String contactFirstName;
    private final String contactLastName;
    public int getCustomerNumber() {
        return customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getContactFirstName() {
        return contactFirstName;
    }

    public String getContactLastName() {
        return contactLastName;
    }

    public CustomerInfo(int customerNumber,
                        String customerName,
                        String contactFirstName,
                        String contactLastName) {
        this.customerNumber = customerNumber;
        this.customerName=customerName;
        this.contactFirstName=contactFirstName;
        this.contactLastName=contactLastName;
    }
    
}
