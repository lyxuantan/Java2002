package vn.t3h.repositorys;

import vn.t3h.model.Config;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


/*Create, Read, Update, Delete*/
public interface ConfigRepository extends CrudRepository<Config, Integer> {
	List<Config> findByKey(String key);
	
	
	
	//select *
	List<Config> findByKeyAndValue(String key, String value);
	Config findById(int id);
}