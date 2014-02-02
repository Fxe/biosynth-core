package edu.uminho.biosynth.core.components.biodb.mnx.components;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import edu.uminho.biosynth.core.components.StoichiometryPair;
import edu.uminho.biosynth.core.components.biodb.mnx.MnxReactionEntity;

@Entity
@Table(name="MNX_REACTION_PRODUCT")
public class MnxReactionProductEntity extends StoichiometryPair {
	
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name="ID_REACTION")
	private MnxReactionEntity mnxReactionEntity;
	public MnxReactionEntity getMnxReactionEntity() { return mnxReactionEntity;}
	public void setMnxReactionEntity(MnxReactionEntity mnxReactionEntity) { this.mnxReactionEntity = mnxReactionEntity;}
	
	@Override
	public String toString() {
		final char sep = ',';
		final char ini = '<';
		final char end = '>';
		StringBuilder sb = new StringBuilder();
		sb.append(ini);
		sb.append(this.cpdKey).append(sep);
		sb.append(this.cpdEntry).append(sep);
		sb.append(this.value);
		sb.append(end);
		return sb.toString();
	}
}