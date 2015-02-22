/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classicmodels;

import java.util.Collection;
import java.util.Date;

/**
 *
 * @author Pasi
 */
public class Order {
    private final Integer orderNumber;
    private final Date requiredDate;
    private final Date shippedDate;
    private final String status;
    private final String comments;
//    private final Collection<Orderdetails> orderdetailsCollection;
    private final Customers customerNumber;

    public Order(Integer orderNumber, Date requiredDate, Date shippedDate, String status, String comments,  Customers customerNumber) {
        this.orderNumber = orderNumber;
        this.requiredDate = requiredDate;
        this.shippedDate = shippedDate;
        this.status = status;
        this.comments = comments;
//        this.orderdetailsCollection = orderdetailsCollection;
        this.customerNumber = customerNumber;
    }

    
    public Integer getOrderNumber() {
        return orderNumber;
    }

    public Date getRequiredDate() {
        return requiredDate;
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public String getStatus() {
        return status;
    }

    public String getComments() {
        return comments;
    }

//    public Collection<Orderdetails> getOrderdetailsCollection() {
//        return orderdetailsCollection;
//    }

    public Customers getCustomerNumber() {
        return customerNumber;
    }
    
    
}
