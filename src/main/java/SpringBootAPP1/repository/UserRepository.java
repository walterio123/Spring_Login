package SpringBootAPP1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sun.el.stream.Optional;

import SpringBootAPP1.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	
	public Optional findByUsername(String username);
	
	public Optional findByIdAndPassword(Long id, String password);
	
}
