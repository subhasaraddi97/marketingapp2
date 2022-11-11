package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entities.Billing;

public interface BillingService {

	public void saveBill(Billing bill);

	public List<Billing> getAllBills();
}
