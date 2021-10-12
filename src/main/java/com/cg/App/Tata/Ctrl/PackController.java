package com.cg.App.Tata.Ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.App.Tata.Module.Pack;
import com.cg.App.Tata.Service.IPackService;

@RestController
@RequestMapping("/api/Pack")
public class PackController {
	@Autowired
	IPackService pservice;
	
	@PostMapping("/addPack")
	public Pack add(@RequestBody Pack pack) {
	
		return pservice.add(pack);
	}
    
	@PostMapping("/updatePack")
	public Pack update(@RequestBody Pack pack) {
	
		return pservice.update(pack);
		}

	@GetMapping("/findpackbyId/{id}")
	public Pack findPackById(@PathVariable Long id) {
	
		return pservice.findPackById(id);
	}

	@GetMapping("/packsGreaterthanAmount/{amount}")
	public List<Pack> findPacksGreaterThanAmount(@PathVariable double amount) {
		
		return pservice.findPacksGreaterThanAmount(amount);
	}
   
	@GetMapping("/findPackValidity")
	public List<Pack> findPacksInAscendingOrderByDaysValidity() {
		
		return pservice.findPacksInAscendingOrderByDaysValidity();
	}

	@GetMapping("/findPackCost")
	public List<Pack> findPacksInAscendingOrderByCost() {
		
		return pservice.findPacksInAscendingOrderByCost();
	}

	@GetMapping("/popularPacks")
	public List<Pack> popularPacks() {
		
		return pservice.popularPacks();
	}

	@DeleteMapping("/deletePackbyId/{id}")
	public String deleteByPackId(@PathVariable Long id) {
		
		
		return pservice.deleteByPackId(id);
	}
	
	
	

}
