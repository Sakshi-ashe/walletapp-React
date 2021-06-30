package com.sakshi.walletapp.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Wallet {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message= "Name can't be blank")
	@Size(min=2, max=30)
	private String accountName;
	
	@Size(min=2, max=30)
	private String accountNumber;
	
	@Size(max=100)
	private String description;
	
	@Min(1)
	@Max(3)
	private Integer priority;		//1=high; 2=medium; 3=low
	
	private Double currentBalance;
	
	@PrePersist						//PrePersist annotation tells method should be called before the entity is inserted in database.
	public void setBalance() {
		this.currentBalance = Double.valueOf(0.00);
	}
	
	

	
	

}
