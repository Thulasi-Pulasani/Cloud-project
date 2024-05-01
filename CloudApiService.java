package com.springboot.SpringBootCloud.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.SpringBootCloud.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudApiService 
{
	//to observe the output after execution u need to mention localpath like
	//localhost:8080/mapping class/one id 
	//i.e localhost:8080/cloudvendor/1
	
	CloudVendor cloudvendor;
	@GetMapping("{vendor_id}")
	public CloudVendor getCloudVendorDetails(String vendor_id)
	{
		return cloudvendor;
//		return new CloudVendor(1,"First","ATP",9912870132l);
	}
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudvendor)
	{
		this.cloudvendor=cloudvendor;
		return "vendor got created successfully";
	}
	
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudvendor)
	{
		this.cloudvendor=cloudvendor;
		return "vendor got updated successfully";
	}
	
	@DeleteMapping("{vendor_name}")
	public String deleteCloudVendorDetails( String vendor_name)
	{
		this.cloudvendor=null;
		return "vendor got deleted successfully";
	}

}
