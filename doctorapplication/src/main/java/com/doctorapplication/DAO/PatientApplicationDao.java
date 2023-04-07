package com.doctorapplication.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.doctorapplication.Entity.*;

@Repository
public interface PatientApplicationDao extends JpaRepository<PatientEntity,Integer>{
        @Query("from PatientEntity where patient_id =:UserId and patient_email =:password")
        List<PatientEntity> login( @Param("UserId")String UserId,@Param("password") String password);

}