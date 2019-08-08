package com.spring.mssg.chaiservice.repository;

import com.spring.mssg.chaiservice.domain.Chai;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface ChaiRepository extends PagingAndSortingRepository<Chai, UUID> {
}
