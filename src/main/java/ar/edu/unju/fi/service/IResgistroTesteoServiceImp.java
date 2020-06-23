package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.repository.IRegistroTesteo;
import ar.edu.unju.fi.testeos.model.RegistroTesteo;

@Repository
public class IResgistroTesteoServiceImp implements IRegistroTesteoService {
	
	@Autowired
	private IRegistroTesteo iregistroTesteo;
	
	@Override
	public void guardar() {
		iregistroTesteo.guardar();
	}

	@Override
	public RegistroTesteo mostrar() {
		RegistroTesteo registroTesteo = iregistroTesteo.mostrar();
		return registroTesteo;
	}

	@Override
	public void eliminar() {
		iregistroTesteo.eliminar();

	}

	@Override
	public RegistroTesteo modificar() {
		RegistroTesteo registroTesteo = iregistroTesteo.modificar();
		return registroTesteo;
	}

}
