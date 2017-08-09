package de.itter.graphs;

import java.util.Collection;
import java.util.LinkedList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.itter.graphs.api.Graph;
import de.itter.graphs.api.Node;

public abstract class AbstractGraph implements Graph {

	final Logger logger = LoggerFactory.getLogger(this.getClass());

	private Collection<Node> nodes = new LinkedList<Node>();

	public Collection<Node> getNodes() {
		return nodes;
	}

}
