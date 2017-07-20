package de.itter.graphs;

import java.io.Serializable;

import de.itter.graphs.api.Node;

public class SimpleNode implements Node, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3408832873819327518L;

	private String label;

	
	public SimpleNode(String label){
		this.label = label;
	}
	
	public String toString(){
		return label;
	}

}
