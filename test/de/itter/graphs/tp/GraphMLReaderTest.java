/**
 * 
 */
package de.itter.graphs.tp;

import java.io.IOException;

import org.apache.tinkerpop.gremlin.structure.io.IoCore;
import org.apache.tinkerpop.gremlin.tinkergraph.structure.TinkerFactory;
import org.apache.tinkerpop.gremlin.tinkergraph.structure.TinkerGraph;
import org.junit.Test;

/**
 * @author Erik Itter
 *
 */
public class GraphMLReaderTest {

	@Test
	public void testRead() {
		TinkerGraph g = TinkerFactory.createModern();
		try {
			g.io(IoCore.graphml()).writeGraph("tinkerpop-modern.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
