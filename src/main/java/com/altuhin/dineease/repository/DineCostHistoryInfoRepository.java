package com.altuhin.dineease.repository;

import com.altuhin.dineease.entity.PurchaseHistoryDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DineCostHistoryInfoRepository extends JpaRepository<PurchaseHistoryDetails, String> {

}
