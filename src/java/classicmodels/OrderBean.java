/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classicmodels;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Pasi
 */
@Named
@Stateless

public class OrderBean {
    
    @PersistenceContext
    EntityManager em;
    
    private int custNum=0;

    public int getCustNum() {
        return custNum;
    }

    public void setCustNum(int custNum) {
        this.custNum = custNum;
    }
    
    public List<Order> getOrderByCustomerNumber(){
      List<Order> rl=em.createNamedQuery("Orders.findByCustomerNumber", Order.class)
            .setParameter("customerNumber", custNum)
            .getResultList();
    
    if (rl!=null){return rl;}
    else return new ArrayList<>();      
        
        
    }
}
