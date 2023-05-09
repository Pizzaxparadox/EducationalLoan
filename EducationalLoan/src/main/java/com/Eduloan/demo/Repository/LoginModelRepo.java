package com.Eduloan.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Eduloan.demo.Model.LoginModel;

@Repository
public interface LoginModelRepo extends JpaRepository<LoginModel,String>{

}
