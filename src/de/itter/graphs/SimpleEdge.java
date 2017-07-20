package de.itter.graphs;

import java.io.Serializable;

import de.itter.graphs.api.Edge;
import de.itter.graphs.api.Node;

public class SimpleEdge implements Edge, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3595103174615909148L;
	private Node nodeA;
	private Node nodeB;
	
	public SimpleEdge(Node a, Node b){
		nodeA = a;
		nodeB = b;
	}

	@Override
	public Node getNodeA() {
		return nodeA;
	}

	@Override
	public Node getNodeB() {
		return nodeB;
	}

}
