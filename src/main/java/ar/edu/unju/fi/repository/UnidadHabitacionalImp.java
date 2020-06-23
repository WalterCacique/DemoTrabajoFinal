package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.ProyectoFinalTesteoCovid19Aplication;
import ar.edu.unju.fi.testeos.model.UnidadHabitacional;

@Repository("UnidadHabitacionalImp")
public class UnidadHabitacionalImp implements IUnidadHabitacional {

	@Autowired
	private UnidadHabitacional unidadHabitacional;
	
	public static Logger LOG = LoggerFactory.getLogger(ProyectoFinalTesteoCovid19Aplication.class);
	
	@Override
	public void guardar() {
		//accion ejecutada para guardar un objeto unidadHabitacional en la BD
		LOG.info("La unidad fue guardado "+unidadHabitacional.getBarrio());
	}

	@Override
	public UnidadHabitacional mostrar() {
		// se recuperan todos los datos de la unidad habitacional
			LOG.info("Mostrar los datos de la unidad habitacional");
			return unidadHabitacional;
	}

	@Override
	public void eliminar() {
		// se elimina el objeto unidadaHabitacional de la BD
		LOG.info("Se elimino la undiad habitacional de la BD");
	}

	@Override
	public UnidadHabitacional modificar() {
		// se modifican los datos de la unidadHabitacional 
		LOG.info("Se modificaron los datos de la unidad habitacional");
		return unidadHabitacional;
	}

}
