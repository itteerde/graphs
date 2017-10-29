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
			Iterator<KeyType> keyIt = keys.iterator();
			while (keyIt.hasNext()) {
				KeyType kt = keyIt.next();
				System.out.println(kt.getId() + ": " + kt.getAttrName() + "," + kt.getDesc());
			}
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

						if (o2 instanceof DataType) {
							DataType dtO2 = (DataType) o2;
							System.out.println(dtO2.getContent());
						}
						if (o2 instanceof NodeType) {
							NodeType ntO2 = (NodeType) o2;
							List<Object> dataOrPort = ntO2.getDataOrPort();
							Iterator<Object> dopIt = dataOrPort.iterator();
							while (dopIt.hasNext()) {
								DataType dt03 = (DataType) dopIt.next();
								// System.out.println(dt03.getKey() + ": " +
								// dt03.getContent());
							}
						}
						if (o2 instanceof EdgeType) {
							EdgeType etO2 = (EdgeType) o2;
							// System.out.println(etO2.getId() + ": " +
							// etO2.getSource() + "->" + etO2.getTarget());
						}
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
