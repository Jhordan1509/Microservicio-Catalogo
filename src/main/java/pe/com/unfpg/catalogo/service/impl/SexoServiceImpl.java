package pe.com.unfpg.catalogo.service.impl;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.unfpg.catalogo.entity.SexoEntity;
import pe.com.unfpg.catalogo.repository.SexoRepository;
import pe.com.unfpg.catalogo.service.SexoService;
@Service
public class SexoServiceImpl implements SexoService {
	
	@Autowired
	private SexoRepository repositorio;
	@Override
	public List<SexoEntity> findAll() {
		return repositorio.findAll();
	}
	@Override
	public List<SexoEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}
	@Override
	public SexoEntity findById(Long id) {
		return repositorio.findById(id).get();
	}
	@Override
	public SexoEntity add(SexoEntity obj) {
		return repositorio.save(obj);
	}
	@Override
	public SexoEntity update(SexoEntity obj, Long id) {
		SexoEntity objs=repositorio.findById(id).get();
		BeanUtils.copyProperties(obj, objs);
		return repositorio.save(objs);
	}
	@Override
	public SexoEntity delete(Long id) {
		SexoEntity objs=repositorio.findById(id).get();
		objs.setEstado(false);
		return repositorio.save(objs);
	}
	@Override
	public SexoEntity enable(Long id) {
		SexoEntity objs=repositorio.findById(id).get();
		objs.setEstado(true);
		return repositorio.save(objs);
	}
}
