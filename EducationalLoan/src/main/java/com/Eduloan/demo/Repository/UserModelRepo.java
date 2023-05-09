package com.Eduloan.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Eduloan.demo.Model.UserModel;

@Repository
public interface UserModelRepo extends JpaRepository<UserModel,Integer>{

}
