package com.projects.teamallocations.data.repository;

import com.projects.teamallocations.data.entity.TeamAllocation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamAllocationsRepository extends CrudRepository<TeamAllocation, Long> {
}
