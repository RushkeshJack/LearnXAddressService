package com.springboot.LearnXAddressService.Controller;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.LearnXAddressService.DTO.AddressDTO;
import com.springboot.LearnXAddressService.Service.LearnXServiceService;

@RestController
public class LearnXServiceController {

	@Autowired
	public LearnXServiceService learnXServiceService;

	@GetMapping(value = "/api/v1/addresses/{id}")
	public ResponseEntity<AddressDTO> getAddresses(@PathVariable("id") int id) {
		return new ResponseEntity<AddressDTO>(this.learnXServiceService.getAddressOfEmployee(id), HttpStatus.OK);
	}

}
