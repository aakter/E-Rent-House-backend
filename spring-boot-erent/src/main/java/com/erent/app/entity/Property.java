package com.erent.app.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "property")
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private PropertyCategory category;

    @Column(name = "property_address")
    private String propertyAddress;

    @Column(name = "property_built_year")
    private Date propertyBuiltYear;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "image_url")
    private  String imageUrl;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PropertyCategory getCategory() {
		return category;
	}

	public void setCategory(PropertyCategory category) {
		this.category = category;
	}

	public String getPropertyAddress() {
		return propertyAddress;
	}

	public void setPropertyAddress(String propertyAddress) {
		this.propertyAddress = propertyAddress;
	}

	public Date getPropertyBuiltYear() {
		return propertyBuiltYear;
	}

	public void setPropertyBuiltYear(Date propertyBuiltYear) {
		this.propertyBuiltYear = propertyBuiltYear;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Property(Long id, PropertyCategory category, String propertyAddress, Date propertyBuiltYear,
			BigDecimal price, String imageUrl) {
		super();
		this.id = id;
		this.category = category;
		this.propertyAddress = propertyAddress;
		this.propertyBuiltYear = propertyBuiltYear;
		this.price = price;
		this.imageUrl = imageUrl;
	}
	
	public Property() {
		
	}
    
    

}
