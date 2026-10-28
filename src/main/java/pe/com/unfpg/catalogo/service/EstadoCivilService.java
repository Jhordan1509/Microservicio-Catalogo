package pe.com.unfpg.catalogo.service;
import java.util.List;
import pe.com.unfpg.catalogo.entity.EstadoCivilEntity;
public interface EstadoCivilService {
	List<EstadoCivilEntity> findAll();
	List<EstadoCivilEntity> findAllCustom();
	EstadoCivilEntity findById(Long id);
	EstadoCivilEntity add(EstadoCivilEntity obj);
	EstadoCivilEntity update(EstadoCivilEntity obj, Long id);
	EstadoCivilEntity delete(Long id);
	EstadoCivilEntity enable(Long id);
}