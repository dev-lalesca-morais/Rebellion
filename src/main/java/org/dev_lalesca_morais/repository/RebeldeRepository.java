package org.dev_lalesca_morais.repository;


import org.dev_lalesca_morais.model.Rebelde;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RebeldeRepository extends JpaRepository<Rebelde, Long> {
}
