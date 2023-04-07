package com.doctorapplication.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.doctorapplication.Entity.*;

@Repository
public interface DoctorApplicationDao extends JpaRepository<DoctorEntity,Integer>{
              @Query("from DoctorEntity where doctor_id =:UserId and doctor_email =:password")
              List<DoctorEntity> login( @Param("UserId")String UserId,@Param("password") String password);
	
}