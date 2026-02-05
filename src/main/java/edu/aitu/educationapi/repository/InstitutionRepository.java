package edu.aitu.educationapi.repository;

import edu.aitu.educationapi.model.InstitutionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstitutionRepository extends JpaRepository<InstitutionModel, Long> {
}
