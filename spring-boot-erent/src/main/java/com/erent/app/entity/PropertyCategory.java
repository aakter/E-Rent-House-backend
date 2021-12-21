package com.erent.app.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "property_category")
// @Data -- known bug
public class PropertyCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "property_name")
    private String property_name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<Property> properties;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProperty_name() {
		return property_name;
	}

	public void setProperty_name(String property_name) {
		this.property_name = property_name;
	}

	public Set<Property> getProperties() {
		return properties;
	}

	public void setProperties(Set<Property> properties) {
		this.properties = properties;
	}

	public PropertyCategory(Long id, String property_name, Set<Property> properties) {
		super();
		this.id = id;
		this.property_name = property_name;
		this.properties = properties;
	}
    
    public PropertyCategory() {
    	
    }
}
