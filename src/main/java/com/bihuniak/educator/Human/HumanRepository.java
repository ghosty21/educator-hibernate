package com.bihuniak.educator.Human;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepositoryExtensionsKt;
import org.springframework.stereotype.Repository;

@Repository
public interface HumanRepository extends CrudRepository<Human, Long> {
}
