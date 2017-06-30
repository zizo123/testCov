package com.cov.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.cov.entities.*; 
@CrossOrigin(origins = "*")
public interface NotificationRepository extends JpaRepository<Notification, Integer>{
	
}
