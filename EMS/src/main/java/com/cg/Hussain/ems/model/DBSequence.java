package com.cg.Hussain.ems.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "database_sequences")
public class DBSequence {
	
	@Id
	private String id;
	private int sequence;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	public DBSequence(String id, int sequence) {
		super();
		this.id = id;
		this.sequence = sequence;
	}
	public DBSequence() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "DBSequence [id=" + id + ", sequence=" + sequence + "]";
	}
}