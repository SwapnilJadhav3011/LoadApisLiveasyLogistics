package com.example.Loads.Service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Loads.Model.Load;
import com.example.Loads.Repository.LoadRepository;

@Service
public class LoadServiceIMPL implements LoadService{

	@Autowired
	private LoadRepository loadRepository;

	@Override
	public void saveLoadDetails(Load load) {
		// TODO Auto-generated method stub
		loadRepository.save(load);
	}

	@Override
	public Load getLoadsById(Long loadId) {
		// TODO Auto-generated method stub
		return loadRepository.findById(loadId).get();
	}

	@Override
	public List<Load> getLoadByShipperId(Long shipperId) {
		// TODO Auto-generated method stub
		return loadRepository.findByShipperId(shipperId);
	}

	@Override
	public Load updateLoad(Long loadId, Load load) {
		// TODO Auto-generated method stub
		Load loadDB=loadRepository.findById(loadId).get();
		
		if(Objects.nonNull(load.getLoadingPoint())&&!"".equalsIgnoreCase(load.getLoadingPoint()))
		{
			loadDB.setLoadingPoint(load.getLoadingPoint());
		}
		if(Objects.nonNull(load.getUnloadingPoint())&&!"".equalsIgnoreCase(load.getUnloadingPoint()))
		{
			loadDB.setUnloadingPoint(load.getUnloadingPoint());
		}
		if(Objects.nonNull(load.getProductType())&&!"".equalsIgnoreCase(load.getProductType()))
		{
			loadDB.setProductType(load.getProductType());
		}
		if(Objects.nonNull(load.getTruckType())&&!"".equalsIgnoreCase(load.getTruckType()))
		{
			loadDB.setTruckType(load.getTruckType());
		}
		if (Objects.nonNull(load.getNoOfTrucks())) {
		    loadDB.setNoOfTrucks(load.getNoOfTrucks());
		}

		if (Objects.nonNull(load.getWeight())) {
		    loadDB.setWeight(load.getWeight());
		}

		if(Objects.nonNull(load.getComment())&&!"".equalsIgnoreCase(load.getComment()))
		{
			loadDB.setComment(load.getComment());
		}
		if(Objects.nonNull(load.getDate())&&!"".equalsIgnoreCase(load.getDate()))
		{
			loadDB.setDate(load.getDate());
		}
		
		return loadRepository.save(loadDB);
	}

	@Override
	public void deleteLoad(Long loadId) {
		// TODO Auto-generated method stub
		loadRepository.deleteById(loadId);
	}

	

	

	
	
	

}
