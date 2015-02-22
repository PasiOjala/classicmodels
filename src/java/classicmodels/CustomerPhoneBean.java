package classicmodels;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Named
@Stateless
public class CustomerPhoneBean {
    @PersistenceContext
    EntityManager em;
    
    public List<CustomerPhone> getCustomerPhones() {
        return em.createNamedQuery(
            "Customers.findCustomerPhones", 
            CustomerPhone.class).getResultList();
    }
}
