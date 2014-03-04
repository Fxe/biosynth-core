package edu.uminho.biosynth.core.components.model.sbml;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SBML_SPECIE")
public class SbmlMetaboliteSpecieEntity {

	@Id
	@Column(name="id", nullable=false, unique=true)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	public Long getId() { return id;}
	public void setId(Long id) { this.id = id;}

	@Column(name="entry", nullable=false)
	private String entry = "noEntryAssigned";
	public String getEntry() { return entry;}
	public void setEntry(String entry) { this.entry = entry;}

	@Column(name="name", nullable=true, unique=false)
	private String name;
	public String getName() { return name;}
	public void setName(String name) { this.name = name;}

	@ManyToOne
	@JoinColumn(name="ID_COMPARTMENT", nullable=false)
	private SbmlCompartment sbmlCompartment;
	public SbmlCompartment getSbmlCompartment() { return sbmlCompartment;}
	public void setSbmlCompartment(SbmlCompartment sbmlCompartment) { this.sbmlCompartment = sbmlCompartment;}

	@ManyToOne
	@JoinColumn(name="ID_MODEL", nullable=false)
	private SbmlMetabolicModel sbmlMetabolicModel;
	public SbmlMetabolicModel getSbmlMetabolicModel() { return sbmlMetabolicModel;}
	public void setSbmlMetabolicModel(SbmlMetabolicModel sbmlMetabolicModel) { this.sbmlMetabolicModel = sbmlMetabolicModel;}
	
	public SbmlMetaboliteSpecieEntity() {}
	public SbmlMetaboliteSpecieEntity(String entry) { this.entry = entry;}
}