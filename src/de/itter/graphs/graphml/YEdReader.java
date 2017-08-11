package de.itter.graphs.graphml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class YEdReader extends GraphMLReader {

	public void read() {
		try {
			JAXBContext jc = JAXBContext.newInstance("de.itter.graphs.graphml");
			Unmarshaller unmarschaller = jc.createUnmarshaller();
			Object graph = unmarschaller.unmarshal(new File("res/graphs/graphml/modules_DE.graphml"));
			System.out.println(graph);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
