package br.com.alfa.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Serializable objeto ser� transformado em bytes, melhor performance para transmitir
//Qualquer tipo de trabalho que envolver persist�ncia ou tramita��o de dados, a serializa��o � necess�ria.

@Entity
public class Prova implements Serializable {

	private static final long serialVersionUID = -4838871177007286924L;

	// GenerationType.AUTO, gera uma tabela extra de sequ�ncia e atrapalha.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private Long codigo;
	
	@Column(name = "nome", length = 60, nullable = false)
	private String nome;
	
	@Column(name = "altura", length = 60, nullable = false)
	private float altura;
	
	@Column(name = "peso", length = 60, nullable = true)
	private float peso;
	
	@Column(name = "sexo", length = 30, nullable = true)
	private String sexo;
	
	@Column(name = "imc", length = 30, nullable = true)
	private double imc;
	
	@Column(name = "classificacao", length = 30, nullable = true)
	private String  classificacao;
	
	
	@Column(name = "data_cadastro", nullable = true)
	private Date dataCadastro;


	public Long getCodigo() {
		return codigo;
	}


	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public float getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		this.altura = altura;
	}


	public float getPeso() {
		return peso;
	}


	public void setPeso(float peso) {
		this.peso = peso;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public double getImc() {
		return imc;
	}


	public void setImc(double imc) {
		this.imc = imc;
	}


	public String getClassificacao() {
		return classificacao;
	}


	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}


	public Date getDataCadastro() {
		return dataCadastro;
	}


	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	}