/**
 * 
 */
package de.itter.graphs.graphml;

import org.junit.Test;

/**
 * @author Erik Itter
 *
 */
public class YEdTest {

	@Test
	public void testRead() {
		YEdReader in = new YEdReader();
		// in.read("res/graphs/graphml/mwe.graphml");
		in.read("res/graphs/graphml/modules_DE.graphml");
	}

}
