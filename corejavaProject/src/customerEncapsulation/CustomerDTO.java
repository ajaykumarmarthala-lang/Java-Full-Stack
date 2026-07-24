package customerEncapsulation;

public class CustomerDTO {
	private int id;
	private String name;
	private int age;
	private String email;
	
	public String toString() {
		return " CustomerDTO Info [ Customer ID : " + id 
				+" , Customer Name : "  + name  
				+" , Customer Age : "  + age
				+" , Customer Email : "  + email + " ]";
	}
	CustomerDTO(){
		System.out.println("No arg constructor called from CustomerDTO");
	}
	CustomerDTO(int id,String name,int age,String email){
		this.id=id;
		this.name=name;
		this.age=age;
		this.email=email;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEmail() {
		return email;
	}
	
}
