package com.cg.App.Tata.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.App.Tata.Module.Account;
import com.cg.App.Tata.Module.Pack;
import com.cg.App.Tata.Module.User;
import com.cg.App.Tata.Repository.IPackRepository;
@Service
public class IPackServiceImpl implements IPackService{
	@Autowired
	IPackRepository packrepo;
	@Override
	public Pack add(Pack pack) {
		
		Pack thepack= packrepo.save(pack);
		return thepack;
		
	}

	@Override
	public Pack update(Pack pack) {
		
		Optional<Pack> updatepack =packrepo.findById(pack.getId());
		if(updatepack.isPresent()) {
			packrepo.saveAndFlush(pack);
			
		}
		return pack;
		
	}

	@Override
	public Pack findPackById(Long id) {
	
		Optional<Pack> byid = packrepo.findPackById(id);
		Pack sp = byid.get();
		return sp;
		
	}

	@Override
	public List<Pack> findPacksGreaterThanAmount(double amount) {
	
		List<Pack> findbyamount =  packrepo.findPacksGreaterThanAmount(amount);
		return findbyamount;
		
		
	}

	@Override
	public List<Pack> findPacksInAscendingOrderByDaysValidity() {
		List<Pack> findbydays =  packrepo.findPacksInAscendingOrderByDaysValidity();
		return findbydays;
		
	}

	@Override
	public List<Pack> findPacksInAscendingOrderByCost() {
		List<Pack> findbycost =  packrepo.findPacksInAscendingOrderByCost();
		return findbycost;
	
	}

	@Override
	public List<Pack> popularPacks() {
		
		return packrepo.findAll();
	
	}

	@Override
	public String deleteByPackId(Long id) {

		Optional<Pack> packContainer  = packrepo.findById(id);
		if(packContainer.isPresent()) {
			
			packrepo.deleteById(id);

				

				 return " Pack deleted successfully";

				}
		return "";
		
		
	}
		
}


