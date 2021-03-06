package me.impressione.ticketpark.entity;

import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TipoVeiculo {
	@Id
	@GeneratedValue
	private Long		id;
	private String		descricao;
	private BigDecimal	valor;

	public TipoVeiculo(){
		
	}
	public TipoVeiculo(Long tipoVeiculoId) {
		this.id = tipoVeiculoId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoVeiculo other = (TipoVeiculo) obj;
		return Objects.equals(id, other.id);
	}

}
