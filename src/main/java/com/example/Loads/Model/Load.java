package com.example.Loads.Model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "LiveasyLoad")
public class Load {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank(message = "Please write LoadingPoint")
	private String loadingPoint;
	@NotBlank(message = "Please write UnloadingPoint")
	private String unloadingPoint;
	@NotBlank(message = "Please write ProductType")
	private String productType;
	@NotBlank(message = "Please write TruckType")
	private String truckType;
	@NotBlank(message = "Please write NoOftrucks")
	private Long noOfTrucks;
	@NotBlank(message = "Please write Weight")
	private Long weight;
	private String comment;
	@Column (unique = true)
	private Long shipperId;
	@NotBlank(message = "Please write Date ")
	private String date;
	public Load() {
		
	}
	public Load(Long id, String loadingPoint, String unloadingPoint, String productType, String truckType,
			Long noOfTrucks, Long weight, String comment, Long shipperId, String date) {
		super();
		this.id = id;
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		this.comment = comment;
		this.shipperId = shipperId;
		this.date = date;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLoadingPoint() {
		return loadingPoint;
	}
	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}
	public String getUnloadingPoint() {
		return unloadingPoint;
	}
	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getTruckType() {
		return truckType;
	}
	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}
	public Long getNoOfTrucks() {
		return noOfTrucks;
	}
	public void setNoOfTrucks(Long noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}
	public Long getWeight() {
		return weight;
	}
	public void setWeight(Long weight) {
		this.weight = weight;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Long getShipperId() {
		return shipperId;
	}
	public void setShipperId(Long shipperId) {
		this.shipperId = shipperId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Load [id=" + id + ", loadingPoint=" + loadingPoint + ", unloadingPoint=" + unloadingPoint
				+ ", productType=" + productType + ", truckType=" + truckType + ", noOfTrucks=" + noOfTrucks
				+ ", weight=" + weight + ", comment=" + comment + ", shipperId=" + shipperId + ", date=" + date + "]";
	}
	
	
	
	
	
	
}
