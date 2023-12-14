package com.example.Loads.Service;

import java.util.List;

import com.example.Loads.Model.Load;

public interface LoadService {

	public void saveLoadDetails(Load load);
	
	public Load getLoadsById(Long loadId);

	public List<Load> getLoadByShipperId(Long shipperId);

	public Load updateLoad(Long loadId, Load load);

	public void deleteLoad(Long loadId);

	


	


}
