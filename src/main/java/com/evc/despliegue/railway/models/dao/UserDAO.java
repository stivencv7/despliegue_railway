package com.evc.despliegue.railway.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.evc.despliegue.railway.models.entity.User;

@Repository
public interface UserDAO extends JpaRepository<User, Long>{

}
