package com.metrics.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.metrics.model.Medidas;
import com.metrics.repository.MedidasRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/medidas")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MedidaController {
	
	@Autowired
	private MedidasRepository medidaRepository;
	
	@GetMapping
	public ResponseEntity<List<Medidas>> getAll(){
		return ResponseEntity.ok(medidaRepository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Medidas> getById(@PathVariable Long id){
		return medidaRepository.findById(id).map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}
	@GetMapping("/{evento}/{escola}")
	public ResponseEntity<List<Medidas>> filter(@PathVariable String evento, @PathVariable String escola){
		return ResponseEntity.ok(medidaRepository.findByEventoAndEscola(evento, escola));
	}
	
	@GetMapping(value = "/nome/{nome}")
	public ResponseEntity<List<Medidas>> getByNome(@PathVariable String nome) {
		return ResponseEntity.ok(medidaRepository.findAllByNomeContainingIgnoreCase(nome));
	}
	
	@GetMapping(value = "/escola/{escola}")
	public ResponseEntity<List<Medidas>> getByEscola(@PathVariable String escola) {
		return ResponseEntity.ok(medidaRepository.findAllByEscolaContainingIgnoreCase(escola));
	}
	
	@PostMapping
	public ResponseEntity<Medidas> post(@Valid @RequestBody Medidas medidas) {
		return ResponseEntity.status(HttpStatus.CREATED).body(medidaRepository.save(medidas));
	}
	
	@PutMapping
	public ResponseEntity<Medidas> put(@Valid @RequestBody Medidas medidas) {
		return medidaRepository.findById(medidas.getId())
				.map(resposta -> ResponseEntity.status(HttpStatus.CREATED).body(medidaRepository.save(medidas)))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		Optional<Medidas> produto = medidaRepository.findById(id);

		if (produto.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}

		medidaRepository.deleteById(id);
	}
}
