package com.sakshi.walletapp.repository;

import org.springframework.stereotype.Repository;

import com.sakshi.walletapp.entity.Wallet;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface WalletRepository extends JpaRepository<Wallet, Long>{
	
	//Jpa hnadles object relational mapping on JDBC-based database
	
}
