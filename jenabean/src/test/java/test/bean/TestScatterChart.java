package test.bean;

import org.junit.Test;
import static org.junit.Assert.*;

import thewebsemantic.Bean2RDF;
import thewebsemantic.RDF2Bean;

import org.apache.jena.ontology.*;
import org.apache.jena.rdf.model.*;

public class TestScatterChart {
	
	@Test
	public void basic() {
		
		Model m = ModelFactory.createDefaultModel();
		Bean2RDF writer = new Bean2RDF(m);
		RDF2Bean reader = new RDF2Bean(m);
		
		ScatterChart chart = new ScatterChart(); 
		// remember the id for later
		int id = chart.hashCode();
		chart.addYBinding("a");
		chart.addYBinding("b");
		chart.setXBinding("xbinding");
		writer.save(chart);
		
		
		ScatterChart chart2 = reader.load(ScatterChart.class, id);
		assertEquals(2, chart.getYBindings().size());
		
		
		m.write(System.out, "N3");
		
	}

}
