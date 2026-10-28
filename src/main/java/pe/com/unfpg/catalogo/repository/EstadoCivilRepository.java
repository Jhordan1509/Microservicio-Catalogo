package pe.com.unfpg.catalogo.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.catalogo.entity.EstadoCivilEntity;
public interface EstadoCivilRepository extends JpaRepository<EstadoCivilEntity, Long> {
	@Query("select s from EstadoCivilEntity s where s.estado=true")
	List<EstadoCivilEntity> findAllCustom();
}
