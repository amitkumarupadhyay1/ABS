package awadh.bakery.models;

public interface CustomerDAO {
	Customer getCustomer(final int id);
	void save(final Customer customer);
}
