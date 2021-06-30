package com.sakshi.walletapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakshi.walletapp.entity.Wallet;
import com.sakshi.walletapp.repository.WalletRepository;

@Service
public class WalletService {
	
	@Autowired
	private WalletRepository walletRepository;

	public Wallet createOrUpdate(Wallet wallet) {	
			walletRepository.save(wallet);
			return wallet;		
	}
	
	
}
