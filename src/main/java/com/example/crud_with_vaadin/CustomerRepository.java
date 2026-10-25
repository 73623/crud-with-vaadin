package com.example.crud_with_vaadin;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByLastNameStartsWithIgnoreCase(String lastName);
}