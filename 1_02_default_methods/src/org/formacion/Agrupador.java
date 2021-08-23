package org.formacion;

import java.util.List;

public interface Agrupador {

	void add (Object elemento);
	
	int numeroElementos();
	
	default void addAll(List<String> elementos) {
		for(Object elemento : elementos) {
			this.add(elemento);
		}
	}
	
}
