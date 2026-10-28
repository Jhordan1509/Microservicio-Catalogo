package pe.com.unfpg.catalogo.service;
import java.util.List;

import pe.com.unfpg.catalogo.entity.DiaSemanaEntity;
public interface DiaSemanaService {
	//declaramos las operaciones con las cuales vamosa trabajar
	//mostrar todos distrito
	List<DiaSemanaEntity> findAll();
	//mostrar los distritos habilitados
	List<DiaSemanaEntity> findAllCustom();
	//buscar distrito por codigo
	DiaSemanaEntity findById(Long id);
	//registrar distrito
	DiaSemanaEntity add(DiaSemanaEntity obj);
	//actualizar distrito
	DiaSemanaEntity update(DiaSemanaEntity obj, Long id);
	//eliminar distrito
	DiaSemanaEntity delete(Long id);
	//habilitar distrito
	DiaSemanaEntity enable(Long id);
}
