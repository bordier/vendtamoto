package com.example.demo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnonceRepository  extends  JpaRepository<Annonce, Integer>{
	List<Annonce> findAllByMarqueContains (String marque);
//	List<Annonce> findAllByActiveTrue();
	}


