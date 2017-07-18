package test.bean;

import org.junit.Test;

import thewebsemantic.Bean2RDF;

import org.apache.jena.ontology.*;
import org.apache.jena.rdf.model.*;

public class TestIndexedProperties {

	@Test
	public void testBasic() {
		IndexedPropertyBean bean = new IndexedPropertyBean();
		String[] tags = {"tag", "bag", "hag"};
		bean.setTags(tags);
		OntModel m = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM_RDFS_INF);	
		Bean2RDF writer = new Bean2RDF(m);
		writer.save(bean);
	}
}
