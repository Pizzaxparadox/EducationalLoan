package com.Eduloan.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Eduloan.demo.Model.LoanApplicationModel;

@Repository
public interface LoanApplicationModelRepo extends JpaRepository<LoanApplicationModel,Integer>{

}
