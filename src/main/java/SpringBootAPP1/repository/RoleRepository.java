package SpringBootAPP1.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import SpringBootAPP1.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long>{

}
