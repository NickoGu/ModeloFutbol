package ar.edu.unlam.pb2.ea3;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EquipoDeFutbol {

	String nombre;
	Set<Jugador> jugadores;

	public EquipoDeFutbol(String nombreEquipo) {
		this.nombre = nombreEquipo;
		this.jugadores = new TreeSet<Jugador>();
	}

	/*
	 * La capacidad m�xima de un equipo es 23. Cualquier intento de agregar m�s
	 * jugadores generar� una excepci�n (CapacidadMaximaException). Adem�s, no
	 * deber� permitir duplicar Jugadores (JugadorDuplicadoException).
	 */
	public void agregarJugador(Jugador jugador) throws CapacidadMaximaException, JugadorDuplicadoException {

		if (jugadores.size() <= 22) {
			if (jugadores.contains(jugador) == false) {
				jugadores.add(jugador);
			} else {
				throw new JugadorDuplicadoException();
			}
		} else {
			throw new CapacidadMaximaException();
		}

	}

	/*
	 * Permite cambiar cualquier jugador. Un intento de cambiar un jugador no
	 * presente en el equipo generar� una excepci�n (JugadoreInexistenteException).
	 */
	public Boolean cambiarJugador(Jugador saliente, Jugador entrante) throws JugadoreInexistenteException {
		Boolean cambio = false;
		
		if(jugadores.contains(saliente)) {
			jugadores.remove(saliente);
			jugadores.add(entrante);
			cambio = true;
		} else {
			throw new JugadoreInexistenteException();
		}

		return cambio;
	}

	public TreeSet<Jugador> devolverPlanteOrdenadoPorNombreDeJugador() {

		return null;
	}
	
	
	public TreeSet<Jugador> devolverPlanteOrdenadoPorPrecioDeCompraDeJugador() {
		TreeSet<Jugador> jugadoresOrdenadosPorPrecio = new TreeSet<>(new JugadoresOrdenadosPorPrecio());
		jugadoresOrdenadosPorPrecio.addAll(jugadores);
		return jugadoresOrdenadosPorPrecio;
	}

	public TreeSet<Jugador> devolverPlanteOrdenadoPorNumeroDeCamisetaDeJugador() {
		TreeSet<Jugador> jugadoresOrdenadosPorCamiseta = new TreeSet<>(new JugadoresOrdenadosPorCamiseta());
		jugadoresOrdenadosPorCamiseta.addAll(jugadores);
		return jugadoresOrdenadosPorCamiseta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(Set<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

}
