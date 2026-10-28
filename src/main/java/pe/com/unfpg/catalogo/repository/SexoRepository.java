package pe.com.unfpg.catalogo.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.catalogo.entity.SexoEntity;
public interface SexoRepository extends JpaRepository<SexoEntity, Long> {
	@Query("select s from SexoEntity s where s.estado=true")
	List<SexoEntity> findAllCustom();
}
