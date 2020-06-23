package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.repository.IPersonaTesteada;
import ar.edu.unju.fi.testeos.model.PersonaTesteada;

@Repository
public class IPersonaTesteadaServiceImp implements IPersonaTesteadaService {
	
	@Autowired
	private IPersonaTesteada ipersonaTesteada;

	@Override
	public void guardar() {
		ipersonaTesteada.guardar();
	}

	@Override
	public PersonaTesteada mostrar() {
		PersonaTesteada personaTesteada = ipersonaTesteada.mostrar();
		return personaTesteada;
	}

	@Override
	public void eliminar() {
		ipersonaTesteada.eliminar();
	}

	@Override
	public PersonaTesteada modificar() {
		PersonaTesteada personaTesteada = ipersonaTesteada.modificar();
		return personaTesteada;
	}

}
