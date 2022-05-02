package com.example.banking.repository;

//import com.example.banking.model.AccountResponse;
import com.example.banking.model.CustomerResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

/*@Service
public class CustomerRepository {



    List<CustomerResponse> customers = new ArrayList<>();


    public List<CustomerResponse> findAll() {
        return customers;
    }

    public Optional<CustomerResponse> findByKNr(Integer kNr) {
        Optional<CustomerResponse> customer = customers.stream()
                .filter(c -> c.getkNr().equals(kNr))
                .findFirst();
        return customer;
    }


    public ResponseEntity<Object> save(CustomerCreateRequest request) {

        customers.add(
                new CustomerResponse(
                UUID.randomUUID().hashCode() & Integer.MAX_VALUE,
                request.getPassNr(),
                request.getGbDate(),
                request.getvName(),
                request.getnName(),
                request.getStraße(),
                request.gethNr(),
                request.getOrt()
                ));
        return ResponseEntity.ok().build();
    }

    public void deleteBykNr(Integer kNr) {
        this.customers = customers.stream()
                .filter(p -> !p.getkNr().equals(kNr))
                .collect(Collectors.toList());

    }



}*/
@Repository
public interface CustomerRepository extends CrudRepository<CustomerResponse, Integer>, JpaRepository<CustomerResponse, Integer> {


    @Query("select customerNo from CustomerResponse")
    List<Integer> findAllCustomerNo();

    @Query("select firstName from CustomerResponse where customerNo = ?1")
    String findCustomerFirstName(Integer customerNo);

    @Query("select lastName from CustomerResponse where customerNo = ?1")
    String findCustomerLastName(Integer customerNo);

    @Query("select birthDate from CustomerResponse where customerNo = ?1")
    LocalDate findCustomerBirthDate(Integer customerNo);

    /*@Query("select c from CustomerResponse c where c.searchP = ?1 && c.searchW = ?2")
    Optional<CustomerResponse> findCustomerByX(String searchW);*/


}
