package com.Eduloan.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Eduloan.demo.Model.AdminModel;

@Repository
public interface AdminModelRepo extends JpaRepository<AdminModel,String>{

}
