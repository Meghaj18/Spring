package com.cg.App.Tata.Service;

import java.util.List;

import com.cg.App.Tata.Module.Pack;



public interface IPackService {
  Pack add(Pack pack);
  Pack update(Pack pack);
  Pack findPackById(Long id);
  List<Pack> findPacksGreaterThanAmount(double amount);
  List<Pack> findPacksInAscendingOrderByDaysValidity();
  List<Pack> findPacksInAscendingOrderByCost();
  List<Pack> popularPacks();
  String deleteByPackId(Long id);
}
