package br.com.folha.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DEFICIENCIA")
public class Deficiencia {

	@Id
	@Column(name="DEF_ID", nullable=false, unique=true)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="DEF_DESCRICAO", nullable=false, unique=true, length=20)
	private String descricao;

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

	@Override
	public int hashCode() {
		return getId().intValue();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Deficiencia){
			return ((Deficiencia)obj).getId().equals(getId());
		}
		return false;
	}

}
