package de.itter.graphs.api;

import java.util.List;

/**
 * A path is implemented as distinct type other the Graph as a path might have part of it appear in it more than once while a Graph has an identical edge or node only once.
 * 
 * @author Erik Itter
 *
 */
public interface Path {

	public List<Edge> getEdges();
}
