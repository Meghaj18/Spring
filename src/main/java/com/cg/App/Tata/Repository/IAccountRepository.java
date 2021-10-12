package com.cg.App.Tata.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.App.Tata.Module.Account;
import com.cg.App.Tata.Module.Pack;


@Repository
public interface IAccountRepository extends JpaRepository<Account,Long>  {

	void deleteById(Optional<Pack> byid);

	




	

}
