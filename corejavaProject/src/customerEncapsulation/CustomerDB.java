package customerEncapsulation;

public class CustomerDB {
	public static Customer getCustomer() {
		Customer customer = new Customer();
		customer.setId(101);
		customer.setName("Ajay");
		customer.setAge(22);
		customer.setEmail("ajay@gmail.com");
		customer.setGender("Male");
		customer.SetMobileNumber(9515636232L);
		customer.setAddress("Nlr");
		customer.setState("AP");
		return customer;
	}
}
