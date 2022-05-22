package com.TrainingPortal.repositories;

import com.TrainingPortal.models.Designation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesignationRepositories  extends JpaRepository  <Designation ,Integer>{



}
