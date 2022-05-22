package com.TrainingPortal.repositories;

import com.TrainingPortal.models.User;
import org.hibernate.boot.jaxb.hbm.spi.JaxbHbmParentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositories  extends JpaRepository <User, Integer> {
    @Query(value = "select u from User u where u.email = :email")
    public User getUserByEmail(@Param("email") String email);

}
