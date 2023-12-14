package com.example.Loads.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Loads.Model.Load;
@Repository
public interface LoadRepository extends JpaRepository<Load, Long>{
	List<Load> findByShipperId(Long shipperId);
}
