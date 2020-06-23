package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.ProyectoFinalTesteoCovid19Aplication;
import ar.edu.unju.fi.testeos.model.Barrio;

@Repository("BarrioImp")
public class BarrioImp implements IBarrio {

	@Autowired
	private Barrio barrio;
	
	public static Logger LOG = LoggerFactory.getLogger(ProyectoFinalTesteoCovid19Aplication.class);
	
	@Override
	public void guardar() {
		// accion ejecutada para guardar un objeto barrio en la BD
		LOG.info("El barrio fue guardado "+barrio.getNombre());

	}

	@Override
	public Barrio mostrar() {
		// se recuperan todos los datos del barrio
		LOG.info("Mostrar los datos del barrio");
		return barrio;
	}

	@Override
	public void eliminar() {
		// se elimina el objeto barrio de la BD
		LOG.info("Se elimino el barrio de la BD");
	}

	@Override
	public Barrio modificar() {
		// se modifican los datos del barrio
		LOG.info("Se modificaron los datos del barrio");
		return barrio;
	}

}
