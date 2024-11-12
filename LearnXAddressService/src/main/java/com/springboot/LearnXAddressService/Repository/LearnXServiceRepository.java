package com.springboot.LearnXAddressService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.LearnXAddressService.Entity.Address;

public interface LearnXServiceRepository extends JpaRepository<Address, Integer> {

}
