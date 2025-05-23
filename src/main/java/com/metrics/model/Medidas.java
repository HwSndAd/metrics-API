package com.metrics.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_medidas")
public class Medidas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//Informações
	@NotBlank
	private String nome;
	@NotBlank
	private String manequim;
	@NotNull
	@Positive
	private float altura;
	private String evento;
	
	@NotBlank
	private String escola;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dataAtual;
	
	private String status;
	
	//Comprimento
	@NotNull
	@PositiveOrZero
	private float compBustoFrente;
	@NotNull
	@PositiveOrZero
	private float compOmbro;
	@NotNull
	@PositiveOrZero
	private float compAlturaTronco;
	@NotNull
	@PositiveOrZero
	private float compBraco;
	@NotNull
	@PositiveOrZero
	private float compBusto;
	
	//Circunferencias
	@NotNull
	@PositiveOrZero
	private float circBusto;
	@NotNull
	@PositiveOrZero
	private float circCintura;
	@NotNull
	@PositiveOrZero
	private float circCava;
	@NotNull
	@PositiveOrZero
	private float circBiceps;
	@NotNull
	@PositiveOrZero
	private float circPunhoFechado;
	@NotNull
	@PositiveOrZero
	private float circPunhoAbertura;
	@NotNull
	@PositiveOrZero
	private float circPescoco;
	@NotNull
	@PositiveOrZero
	private float circCinturaMedia;
	@NotNull
	@PositiveOrZero
	private float circCinturaBaixa;
	@NotNull
	@PositiveOrZero
	private float circQuadril;
	
	//Comprimento Inferior
	@NotNull
	@PositiveOrZero
	private float compMeioCoxa;
	@NotNull
	@PositiveOrZero
	private float compJoelho;
	@NotNull
	@PositiveOrZero
	private float compPanturrilha;
	@NotNull
	@PositiveOrZero
	private float compTotalPerna;
	
	//Circunferencia Inferior
	@NotNull
	@PositiveOrZero
	private float circCoxa;
	@NotNull
	@PositiveOrZero
	private float circJoelho;
	@NotNull
	@PositiveOrZero
	private float circPanturrilha;
	@NotNull
	@PositiveOrZero
	private float circTornozelo;
	@NotNull
	@PositiveOrZero
	private float gancho;

	//Comentario
	@Size(max = 5000, message = "Observação deve conter no maximo 5000 caracteres.")
	private String comentario;
	
	
	//Getter && Setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getManequim() {
		return manequim;
	}

	public void setManequim(String manequim) {
		this.manequim = manequim;
	}

	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}

	public LocalDate getDataAtual() {
		return dataAtual;
	}

	public void setDataAtual(LocalDate dataAtual) {
		this.dataAtual = dataAtual;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public float getCompBustoFrente() {
		return compBustoFrente;
	}

	public void setCompBustoFrente(float compBustoFrente) {
		this.compBustoFrente = compBustoFrente;
	}

	public float getCompOmbro() {
		return compOmbro;
	}

	public void setCompOmbro(float compOmbro) {
		this.compOmbro = compOmbro;
	}

	public float getCompAlturaTronco() {
		return compAlturaTronco;
	}

	public void setCompAlturaTronco(float compAlturaTronco) {
		this.compAlturaTronco = compAlturaTronco;
	}

	public float getCompBraco() {
		return compBraco;
	}

	public void setCompBraco(float compBraco) {
		this.compBraco = compBraco;
	}

	public float getCompBusto() {
		return compBusto;
	}

	public void setCompBusto(float compBusto) {
		this.compBusto = compBusto;
	}

	public float getCircBusto() {
		return circBusto;
	}

	public void setCircBusto(float circBusto) {
		this.circBusto = circBusto;
	}

	public float getCircCintura() {
		return circCintura;
	}

	public void setCircCintura(float circCintura) {
		this.circCintura = circCintura;
	}

	public float getCircCava() {
		return circCava;
	}

	public void setCircCava(float circCava) {
		this.circCava = circCava;
	}

	public float getCircBiceps() {
		return circBiceps;
	}

	public void setCircBiceps(float circBiceps) {
		this.circBiceps = circBiceps;
	}

	public float getCircPunhoFechado() {
		return circPunhoFechado;
	}

	public void setCircPunhoFechado(float circPunhoFechado) {
		this.circPunhoFechado = circPunhoFechado;
	}

	public float getCircPunhoAbertura() {
		return circPunhoAbertura;
	}

	public void setCircPunhoAbertura(float circPunhoAbertura) {
		this.circPunhoAbertura = circPunhoAbertura;
	}

	public float getCircPescoco() {
		return circPescoco;
	}

	public void setCircPescoco(float circPescoco) {
		this.circPescoco = circPescoco;
	}

	public float getCircCinturaMedia() {
		return circCinturaMedia;
	}

	public void setCircCinturaMedia(float circCinturaMedia) {
		this.circCinturaMedia = circCinturaMedia;
	}

	public float getCircCinturaBaixa() {
		return circCinturaBaixa;
	}

	public void setCircCinturaBaixa(float circCinturaBaixa) {
		this.circCinturaBaixa = circCinturaBaixa;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public float getCompMeioCoxa() {
		return compMeioCoxa;
	}

	public void setCompMeioCoxa(float compMeioCoxa) {
		this.compMeioCoxa = compMeioCoxa;
	}

	public float getCompJoelho() {
		return compJoelho;
	}

	public void setCompJoelho(float compJoelho) {
		this.compJoelho = compJoelho;
	}

	public float getCompPanturrilha() {
		return compPanturrilha;
	}

	public void setCompPanturrilha(float compPanturrilha) {
		this.compPanturrilha = compPanturrilha;
	}

	public float getCompTotalPerna() {
		return compTotalPerna;
	}

	public void setCompTotalPerna(float compTotalPerna) {
		this.compTotalPerna = compTotalPerna;
	}

	public float getCircCoxa() {
		return circCoxa;
	}

	public void setCircCoxa(float circCoxa) {
		this.circCoxa = circCoxa;
	}

	public float getCircJoelho() {
		return circJoelho;
	}

	public void setCircJoelho(float circJoelho) {
		this.circJoelho = circJoelho;
	}

	public float getCircPanturrilha() {
		return circPanturrilha;
	}

	public void setCircPanturrilha(float circPanturrilha) {
		this.circPanturrilha = circPanturrilha;
	}

	public float getCircTornozelo() {
		return circTornozelo;
	}

	public void setCircTornozelo(float circTornozelo) {
		this.circTornozelo = circTornozelo;
	}

	public float getGancho() {
		return gancho;
	}

	public void setGancho(float gancho) {
		this.gancho = gancho;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getCircQuadril() {
		return circQuadril;
	}

	public void setCircQuadril(float circQuadril) {
		this.circQuadril = circQuadril;
	}

	public String getEvento() {
		return evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}
	
	
}
