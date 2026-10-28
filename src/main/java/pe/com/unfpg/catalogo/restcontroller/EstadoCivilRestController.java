package pe.com.unfpg.catalogo.restcontroller;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.unfpg.catalogo.entity.EstadoCivilEntity;
import pe.com.unfpg.catalogo.service.EstadoCivilService;
@RestController
@RequestMapping("/api/estadocivil")
public class EstadoCivilRestController {
	//inyeccion de dependencias hacia el servicio
	//@Autowired
	//private DistritoService servicio;
	
	//inyectamos la dependencia en el constructor
	private EstadoCivilService servicio;
	
	public EstadoCivilRestController(EstadoCivilService servicio) {
		this.servicio=servicio;
	}
	
	
	@GetMapping
	public List<EstadoCivilEntity> findAll(){
		return servicio.findAll();
	}
	
	@GetMapping("/custom")
	public List<EstadoCivilEntity> findAllCustom(){
		return servicio.findAllCustom();
	}
	
	@GetMapping("/{id}")
	public EstadoCivilEntity findById(@PathVariable Long id) {
		return servicio.findById(id);
	}
	
	@PostMapping
	public EstadoCivilEntity add(@RequestBody EstadoCivilEntity obj) {
		return servicio.add(obj);
	}
	
	@PutMapping("/{id}")
	public EstadoCivilEntity update(@RequestBody EstadoCivilEntity obj,
			@PathVariable Long id) {
		return servicio.update(obj, id);
	}
	
	@DeleteMapping("/{id}")
	public EstadoCivilEntity delete(@PathVariable Long id) {
		return servicio.delete(id);
	}
	
	@PatchMapping("/{id}")
	public EstadoCivilEntity enable(@PathVariable Long id) {
		return servicio.enable(id);
	}
}

