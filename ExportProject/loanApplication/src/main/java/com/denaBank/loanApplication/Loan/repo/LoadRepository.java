package com.denaBank.loanApplication.Loan.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.denaBank.loanApplication.Loan.pojo.LoanDetails;
import com.denaBank.loanApplication.customer.pojo.CustomerDao;

public interface LoadRepository extends CrudRepository<LoanDetails, Long> {

	public Optional<List<LoanDetails>> findByCustomer(CustomerDao customer); 
}
