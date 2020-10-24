package com.projects.teamallocations.data.repository;

import com.projects.teamallocations.data.entity.Members;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembersRepository extends CrudRepository<Members, Long> {
}
