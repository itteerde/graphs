package de.itter.graphs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.itter.graphs.api.Graph;

public abstract class AbstractGraph implements Graph{

	final Logger logger = LoggerFactory.getLogger(this.getClass());
}
