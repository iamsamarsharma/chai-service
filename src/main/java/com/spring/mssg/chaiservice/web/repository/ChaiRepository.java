package com.spring.mssg.chaiservice.web.repository;

import com.spring.mssg.chaiservice.web.domain.Chai;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface ChaiRepository extends PagingAndSortingRepository<Chai, UUID> {
}
