package com.springframework.repository;

import com.springframework.model.Owner;
import com.springframework.services.CrudService;

public interface OwnerRepository extends CrudService<Owner, Long> {
}
