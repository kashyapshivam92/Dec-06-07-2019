package com.hughes;

import org.springframework.data.repository.CrudRepository;

public interface PersonDao extends CrudRepository<Person, Integer> {

}
