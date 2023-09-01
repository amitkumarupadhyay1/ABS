package awadh.bakery.models;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CustomerDAOImpl implements CustomerDAO {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Customer getCustomer(final int id) {
		Session session=this.sessionFactory.openSession();
		return(Customer)session.get(Customer.class,id);
		
		
	}

	@Override
	public void save(Customer customer) {
		Session session=this.sessionFactory.openSession();
		Transaction Tx=session.beginTransaction();
		session.persist(customer);
		Tx.commit();
		session.close();
		
	}

}
