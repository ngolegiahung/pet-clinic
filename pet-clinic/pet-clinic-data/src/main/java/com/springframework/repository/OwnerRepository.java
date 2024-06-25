package com.springframework.repository;

import com.springframework.model.Owner;
import com.springframework.services.CrudService;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
