package com.bridgelabz.greetingapp.repository;

import com.bridgelabz.greetingapp.model.Greeting;
import org.springframework.data.repository.CrudRepository;

public interface GreetingRepository extends CrudRepository<Greeting, Long> {
}
