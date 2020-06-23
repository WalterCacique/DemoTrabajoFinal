package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.ProyectoFinalTesteoCovid19Aplication;
import ar.edu.unju.fi.testeos.model.PersonaTesteada;

@Repository("PersonaTesteadaImp")
public class PersonaTesteadaImp implements IPersonaTesteada {

	@Autowired
	private PersonaTesteada personaTesteada;
	
	public static Logger LOG = LoggerFactory.getLogger(ProyectoFinalTesteoCovid19Aplication.class);
	
	@Override
	public void guardar() {
		// accion ejecutada para guardar un objeto personaTesteada en la BD
		LOG.info("La persona fue registrada "+personaTesteada.getNombres()+", "+personaTesteada.getApellido());
	}

	@Override
	public PersonaTesteada mostrar() {
		// se recuperan todos los datos de personaTesteada
				LOG.info("Mostrar los datos de la persona testeada");
				return personaTesteada;
	}

	@Override
	public void eliminar() {
		// se elimina el objeto personaTesteada de la BD
		LOG.info("Se elimino el usuario de la BD");
	}

	@Override
	public PersonaTesteada modificar() {
		// se modifican los datos del usuario 
		LOG.info("Se modificaron los datos de la persona testeada");
		return personaTesteada;
	}

}
