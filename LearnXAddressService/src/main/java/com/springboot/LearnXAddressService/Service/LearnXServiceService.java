package com.springboot.LearnXAddressService.Service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.LearnXAddressService.DTO.AddressDTO;
import com.springboot.LearnXAddressService.Entity.Address;
import com.springboot.LearnXAddressService.Repository.LearnXServiceRepository;

@Service
public class LearnXServiceService {

	@Autowired
	public LearnXServiceRepository learnXServiceRepository;

	@Autowired
	public ModelMapper modelMapper;

	public AddressDTO getAddressOfEmployee(int id) {
		Optional<Address> optional = this.learnXServiceRepository.findById(id);
		Address address = optional.get();

		return modelMapper.map(address, AddressDTO.class);
	}

}
