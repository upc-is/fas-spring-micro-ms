package pe.edu.upc.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.customer.entity.Customer;
import pe.edu.upc.customer.entity.Region;

import java.util.List;

public interface CustomerRepository  extends JpaRepository<Customer,Long> {
    public Customer findByNumberID(String numberID);
    public List<Customer> findByLastName(String lastName);
    public List<Customer> findByRegion(Region region);
}