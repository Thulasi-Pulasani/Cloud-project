package com.springboot.SpringBootCloud.model;

public class CloudVendor 
{
	private int vendor_id;
	private String vendor_name;
	private String vendor_address;
	private long vendor_contact;
	
	
	public CloudVendor(int vendor_id, String vendor_name, String vendor_address, long vendor_contact) {
		super();
		this.vendor_id = vendor_id;
		this.vendor_name = vendor_name;
		this.vendor_address = vendor_address;
		this.vendor_contact = vendor_contact;
	}
	public int getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}
	public String getVendor_name() {
		return vendor_name;
	}
	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}
	public String getVendor_address() {
		return vendor_address;
	}
	public void setVendor_address(String vendor_address) {
		this.vendor_address = vendor_address;
	}
	public long getVendor_contact() {
		return vendor_contact;
	}
	public void setVendor_contact(long vendor_contact) {
		this.vendor_contact = vendor_contact;
	}
	
	

}
