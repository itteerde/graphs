package de.itter.graphs;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import de.itter.graphs.graphml.GraphMLTest;

@RunWith(Suite.class)
@SuiteClasses({
	GraphMLTest.class
})
public class AllTests {

}
