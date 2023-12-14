package com.example.Loads.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Loads.Model.Load;
import com.example.Loads.Service.LoadService;

import jakarta.validation.Valid;

@RestController
public class LoadController {
	
	@Autowired
	private LoadService loadService;
	
	@PostMapping("/load")
	public String saveLoadDetails(@Valid @RequestBody Load load)
	{
		loadService.saveLoadDetails(load);
		return "loads details added successfully";
	}
	


	
	@GetMapping("/load")
	public String getLoadByShipperId(@RequestParam Long shipperId)
	{
		
		List<Load> loads=loadService.getLoadByShipperId(shipperId);
		return "This is shipperId method";
		
	}
	
	@GetMapping("/load/{id}")
	public Load getLoadsById(@PathVariable("id") Long  loadId)
	{
		return loadService.getLoadsById(loadId);
	}
	
	@PutMapping("/load/{id}")
	public Load updateLoad(@PathVariable("id") Long loadId ,
			@RequestBody Load load)
	{
		return loadService.updateLoad(loadId, load);
	}
	
	@DeleteMapping("/load/{id}")
	public String deleteLoad(@PathVariable("id") Long loadId)
	{
		 loadService.deleteLoad(loadId);
		 return "Load Deleted Successfully";
	}
	
}
