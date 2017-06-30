package com.cov.dao;
import java.util.Date;

import javax.persistence.NamedQuery;

import org.hibernate.annotations.NamedNativeQueries;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.cov.entities.*; 
@CrossOrigin(origins = "*")
public interface AnnonceRepository extends JpaRepository<Annonce, Integer>{

	@Query(nativeQuery=true,value="SELECT * FROM annonce WHERE ville_depart like :a and ville_arrive like :b and date_depart like :c order by ?#{#pageable}")
	public Page<Annonce> recherche(@Param("a")String villeDepart,
			@Param("b") String villeArrive,@Param("c") String  d,
			 Pageable pageable);

}
