package com.example.demo.main.myid;

import org.springframework.data.repository.CrudRepository;
import java.lang.String;
import com.example.demo.main.myid.entitybeanid;
import java.util.List;
import java.util.Optional;

public interface beanidrepo extends CrudRepository<entitybeanid, Integer>{

	List<entitybeanid> findByNameAndEmail(String name,String email);
	List<entitybeanid> findByEmailLike(String email);
	List<entitybeanid>  findByIdIn(List<Integer> id);
		
}
