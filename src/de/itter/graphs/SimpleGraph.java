package de.itter.graphs;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedList;

import de.itter.graphs.api.Edge;
import de.itter.graphs.api.Graph;
import de.itter.graphs.api.Node;

public class SimpleGraph implements Graph, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3868712789607881232L;
	private LinkedList<Node> nodes;
	private LinkedList<Edge> edges;

	@Override
	public Collection<Node> getNodes() {
		return nodes;
	}

	@Override
	public Collection<Edge> getEdges() {
		return edges;
	}

}
