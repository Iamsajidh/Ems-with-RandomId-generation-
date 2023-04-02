package com.cg.Hussain.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.Hussain.ems.model.Address;
import com.cg.Hussain.ems.service.AddressService;

@RestController
public class AddressController {

	@Autowired
	AddressService addressService;
	
	@RequestMapping(value="/address", method=RequestMethod.POST)
	public Address createAddress(@RequestBody Address address)
	{
		return addressService.createAddress(address);
	}
	
	@RequestMapping(value="/address", method = RequestMethod.GET)
	public List <Address> readAddress()
	{
		return addressService.getAddress();
	}
	
	@RequestMapping(value="/address/{addressId}", method = RequestMethod.PUT)
	public Address readAddress(@PathVariable(value="addressId") int id, @RequestBody Address addressDetails)
	{
		return addressService.updateAddress(id, addressDetails);
	}
	
	@RequestMapping(value="/address/{addressId}", method = RequestMethod.DELETE)
	public void deleteAddress(@PathVariable(value="addressId")int id)
	{
		addressService.deleteAddress(id);
	}
}
