package ar.edu.unlam.pb2.ea3;

import java.util.Objects;

public class Jugador implements Comparable<Jugador> {

	Integer numeroCamiseta;
	String nombre;
	Integer valor;

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		return Objects.equals(nombre, other.nombre);
	}

	public Jugador(int numeroCamiseta, String nombre, int valor) {
		this.numeroCamiseta = numeroCamiseta;
		this.nombre = nombre;
		this.valor = valor;
	}

	public Integer getNumeroCamiseta() {
		return numeroCamiseta;
	}

	public void setNumeroCamiseta(Integer numeroCamiseta) {
		this.numeroCamiseta = numeroCamiseta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	@Override
	public int compareTo(Jugador o) {

		return this.nombre.compareTo(o.getNombre());
	}

}
