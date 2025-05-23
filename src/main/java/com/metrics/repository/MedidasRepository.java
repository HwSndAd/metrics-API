package com.metrics.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.metrics.model.Medidas;

@Repository
public interface MedidasRepository extends JpaRepository<Medidas, Long>{
	
	public List<Medidas> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
	public List<Medidas> findAllByEscolaContainingIgnoreCase(@Param("escola") String escola);
	
	public List<Medidas> findByEventoContainingIgnoreCaseAndEscolaContainingIgnoreCase(@Param("evento") String evento, 
																					@Param("escola") String escola);
	
}
