package com.cg.App.Tata.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.App.Tata.Module.User;

@Repository
public interface IUserRepository extends JpaRepository<User,Long>{

	Optional<User> findByUsername(String username);


}
