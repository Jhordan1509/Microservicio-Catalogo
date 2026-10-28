package pe.com.unfpg.catalogo.service.impl;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.unfpg.catalogo.entity.EstadoCivilEntity;
import pe.com.unfpg.catalogo.repository.EstadoCivilRepository;
import pe.com.unfpg.catalogo.service.EstadoCivilService;
@Service
public class EstadoCivilServiceImpl implements EstadoCivilService {
	
	@Autowired
	private EstadoCivilRepository repositorio;
	@Override
	public List<EstadoCivilEntity> findAll() {
		return repositorio.findAll();
	}
	@Override
	public List<EstadoCivilEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}
	@Override
	public EstadoCivilEntity findById(Long id) {
		return repositorio.findById(id).get();
	}
	@Override
	public EstadoCivilEntity add(EstadoCivilEntity obj) {
		return repositorio.save(obj);
	}
	@Override
	public EstadoCivilEntity update(EstadoCivilEntity obj, Long id) {
		EstadoCivilEntity objec=repositorio.findById(id).get();
		BeanUtils.copyProperties(obj, objec);
		return repositorio.save(objec);
	}
	@Override
	public EstadoCivilEntity delete(Long id) {
		EstadoCivilEntity objec=repositorio.findById(id).get();
		objec.setEstado(false);
		return repositorio.save(objec);
	}
	@Override
	public EstadoCivilEntity enable(Long id) {
		EstadoCivilEntity objec=repositorio.findById(id).get();
		objec.setEstado(true);
		return repositorio.save(objec);
	}
}


