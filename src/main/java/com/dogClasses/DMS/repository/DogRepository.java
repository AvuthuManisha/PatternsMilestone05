package com.dogClasses.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.dogClasses.DMS.Models.Dog;
/**
 * 
 * @author S555655
 *
 */
public interface DogRepository extends CrudRepository<Dog, Integer> {
	
	List<Dog> findByName(String name);

}
