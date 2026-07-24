package customerEncapsulation;

public class Main {

	public static void main(String[] args) {
		Customer customer = CustomerDB.getCustomer();
		System.out.println("POJO Object ...........");
		System.out.println(customer);
		System.out.println();
//		CustomerDTO dto = new CustomerDTO();
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setId(customer.getId());
		customerDTO.setName(customer.getName());
		customerDTO.setAge(customer.getAge());
		customerDTO.setEmail(customer.getEmail());
		System.out.println("DTO Object : ");
		System.out.println(customerDTO);


	}

}
