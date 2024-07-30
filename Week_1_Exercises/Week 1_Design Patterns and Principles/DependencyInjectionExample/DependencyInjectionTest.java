public class DependencyInjectionTest {
    public static void main(String[] args) {

        CustomerRepository customerRepository = new CustomerRepositoryImpl();


        CustomerService customerService = new CustomerService(customerRepository);


        String customerDetails = customerService.getCustomerDetails("12345");
        System.out.println(customerDetails);
    }
}