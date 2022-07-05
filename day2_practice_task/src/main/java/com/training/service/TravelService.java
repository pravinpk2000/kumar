package com.training.service;

import java.sql.Connection;


import com.training.details.RegisterDetails;
import com.training.iface.TravelInterface;
import com.training.repository.TravelRepo;

public class TravelService {
	
	private TravelInterface<RegisterDetails>repo;
	private Connection con;
	public TravelService(Connection con) {
		super();
		this.con = con;
		this.repo = new TravelRepo(con);

	}
	
	public RegisterDetails add(RegisterDetails entry) {
		
		return this.repo.add(entry);
	}

}
