package de.itter.graphs.graphml;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class YEdReader extends GraphMLReader {

	public void read(String path) {
		JAXBContext jc;
		try {
			jc = JAXBContext.newInstance("de.itter.graphs.graphml");
			Unmarshaller unmarschaller = jc.createUnmarshaller();
			JAXBElement<GraphmlType> element = (JAXBElement<GraphmlType>) unmarschaller.unmarshal(new File(path));

			GraphmlType graph = element.getValue();
			List<KeyType> keys = graph.getKey();
			List<Object> god = graph.getGraphOrData();
			Iterator<Object> it = god.iterator();

			while (it.hasNext()) {
				Object o = it.next();
				if (o instanceof GraphType) {
					GraphType gt = (GraphType) o;
					List<Object> dataOrNodeOrEdge = gt.getDataOrNodeOrEdge();
					Iterator<Object> donoeIt = dataOrNodeOrEdge.iterator();
					while (donoeIt.hasNext()) {
						Object o2 = donoeIt.next();
						System.out.println(o2);
					}
				}

				if (o instanceof DataType) {
					DataType dt = (DataType) o;
					System.out.println(dt.getContent());
				}
			}

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
