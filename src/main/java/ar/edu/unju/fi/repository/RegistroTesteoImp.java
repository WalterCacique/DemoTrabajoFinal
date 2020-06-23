package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.ProyectoFinalTesteoCovid19Aplication;
import ar.edu.unju.fi.testeos.model.RegistroTesteo;

@Repository
public class RegistroTesteoImp implements IRegistroTesteo {
	
	@Autowired
	private RegistroTesteo registroTesteo;
	
	public static Logger LOG = LoggerFactory.getLogger(ProyectoFinalTesteoCovid19Aplication.class);
	
	@Override
	public void guardar() {
		// accion ejecutada para guardar un objeto registroTesteo en la BD
		LOG.info("Se registro el testeo"+registroTesteo.getPersonasTesteadas());
 
	}

	@Override
	public RegistroTesteo mostrar() {
		// se recuperan todos los datos de registroTesteo
		LOG.info("Mostrar los datos de la persona testeada");
		return registroTesteo;
	}

	@Override
	public void eliminar() {
		// se elimina el objeto personaTesteada de la BD
		LOG.info("Se elimino el registro de testeo de la BD");
	}

	@Override
	public RegistroTesteo modificar() {
		LOG.info("Se modificaron los datos del registro de testeo");
		return registroTesteo;
	}

}
