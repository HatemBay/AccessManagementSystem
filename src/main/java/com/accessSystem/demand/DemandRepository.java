package com.accessSystem.demand;

import com.accessSystem.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DemandRepository extends JpaRepository<Demand, Integer> {
    public List<Demand> findByUser_Id(int userId);

}
