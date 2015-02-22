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

@Named
@Stateless
public class CustomerInfoBean {
    @PersistenceContext
    EntityManager em;
    private String searchString=new String();

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }
    
    
    public List<CustomerInfo> getCustomerInfoFromPartial(){
    List<CustomerInfo> rl=em.createNamedQuery("Customers.findByPartialString", CustomerInfo.class)
            .setParameter("contactPartial", "%"+searchString.toLowerCase()+"%")
            .getResultList();
    
    if (rl!=null){return rl;}
    else return new ArrayList<>();
}

}
