package com.cg.App.Tata.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.App.Tata.Module.Pack;

@Repository
public interface IPackRepository extends JpaRepository<Pack,Long>{

	Optional<Pack> findPackById(Long id);
    
	
	@Query(value= "SELECT * FROM pack_details WHERE cost > ?1", nativeQuery = true)
	List<Pack> findPacksGreaterThanAmount(double amount);


	@Query(value= "SELECT * FROM pack_details ORDER BY days_validity ASC", nativeQuery = true)
	List<Pack> findPacksInAscendingOrderByDaysValidity();
 
	@Query(value= "SELECT * FROM pack_details ORDER BY cost ASC", nativeQuery = true)
	List<Pack> findPacksInAscendingOrderByCost();
}
