package ar.edu.unju.fi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.fi.repository.IPersonaTesteada;
import ar.edu.unju.fi.service.IBarrioService;
import ar.edu.unju.fi.service.IRegistroTesteoService;
import ar.edu.unju.fi.service.IUnidadHabitacionalService;
import ar.edu.unju.fi.service.IUsuarioService;
import ar.edu.unju.fi.testeos.model.Barrio;
import ar.edu.unju.fi.testeos.model.PersonaTesteada;
import ar.edu.unju.fi.testeos.model.RegistroTesteo;
import ar.edu.unju.fi.testeos.model.UnidadHabitacional;
import ar.edu.unju.fi.testeos.model.Usuario;

@SpringBootApplication
public class ProyectoFinalTesteoCovid19Aplication implements CommandLineRunner {
	
	//Inyectamos los beans para realizar la operacion de guardar un objeto y tambien inyectamos las interfaces
	
	@Autowired
	IUsuarioService usuarioService;
	@Autowired
	Usuario usuario;
	@Autowired
	IBarrioService barrioService;
	@Autowired
	Barrio barrio;
	@Autowired
	IPersonaTesteada personaTesteadaService;
	@Autowired
	PersonaTesteada personaTesteada;
	@Autowired
	IUnidadHabitacionalService unidadHabitacionalService;
	@Autowired
	UnidadHabitacional unidadHabitacional;
	@Autowired
	IRegistroTesteoService registroTesteoService;
	@Autowired
	RegistroTesteo registroTesteo;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoFinalTesteoCovid19Aplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		usuario.setApellidoReal("Uzqueda");
		usuario.setNombreReal("Jose");
		usuario.setNombreUsuario("Cacique");
		usuario.setPassword("1234");
		usuario.setTipoUsuario("registrador");
		
		usuarioService.guardar();
		
		barrio.setNombre("9 de Julio");
		
		barrioService.guardar();
		
		personaTesteada.setNombres("Jose");
		personaTesteada.setApellido("Uzqueda");
		
		personaTesteadaService.guardar();
		
		unidadHabitacional.setBarrio(barrio);
		
		unidadHabitacionalService.guardar();
		
		//registroTesteo.setPersonasTesteadas(List<PersonaTesteada>);
		
		//registroTesteoService.guardar();
		
		
		
		
	}

}
