package br.com.dgobrito.userapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.dgobrito.userapi.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}