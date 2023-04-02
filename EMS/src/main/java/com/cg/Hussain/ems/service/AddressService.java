package com.cg.Hussain.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.Hussain.ems.model.Address;
import com.cg.Hussain.ems.repository.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	AddressRepository addressRepo;
	
	public Address createAddress (Address address)
	{
		return addressRepo.save(address);
	}
	
		
	public List <Address> getAddress()
	{
		return addressRepo.findAll();
	}
	
	
	
	public void deleteAddress(int addressid)
	{
		addressRepo.deleteById(addressid);
	}
	
	
	
	public Address updateAddress(int addressid, Address addressDetails)
	{
		Address address = addressRepo.findById(addressid).get();
		address.setId(addressDetails.getId());
		address.setApartmentName(addressDetails.getApartmentName());
		address.setFloor(addressDetails.getFloor());
		address.setCity(addressDetails.getCity());
		address.setPin(addressDetails.getPin());
		return addressRepo.save(address);	
	}

}
