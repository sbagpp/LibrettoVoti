package it.polito.tdp.libretto.model;
import java.time.*;
// POJO
//Java Bean
// semplice contenitore, non ha logica!.

/**
 * Memorizza risultato di un esame singolo
 * 
 * @author giuseppesaba
 *
 */
public class Voto {
//nome corso, voto ottenuto, data esame
	private String nome;
	private int voto;// 30 L come lo rapresento??
	private LocalDate data;
	/**
	 * Costruttore della classe Voto
	 * @param nome Nome corso superato
	 * @param voto Voto del corso superato
	 * @param data Data dell'esame superato s
	 */
	public Voto(String nome, int voto, LocalDate data) {
		super();
		this.nome = nome;
		this.voto = voto;
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Esame = " + nome + ",\t voto=" + voto + ",\t il " + data ;
	}
	
	
	
}
