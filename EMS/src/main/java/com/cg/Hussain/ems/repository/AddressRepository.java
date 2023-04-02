package com.cg.Hussain.ems.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.Hussain.ems.model.Address;

public interface AddressRepository extends MongoRepository<Address, Integer>{

}
