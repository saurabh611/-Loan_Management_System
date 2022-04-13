package com.denaBank.loanApplication.Loan.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.denaBank.loanApplication.Loan.pojo.LoanDetails;
import com.denaBank.loanApplication.Loan.pojo.Payment;

public interface PaymentRepo extends CrudRepository<Payment, Long> {
	
	public List<Payment> findByLoanDetails(LoanDetails ld);

}
