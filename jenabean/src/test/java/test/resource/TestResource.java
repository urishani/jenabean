package test.resource;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;
import static org.junit.Assert.*;

import org.apache.jena.ontology.*;
import org.apache.jena.rdf.model.*;
import org.apache.jena.vocabulary.*;

import thewebsemantic.NotFoundException;
import thewebsemantic.Resource_;
import thewebsemantic.binding.Jenabean;
import static thewebsemantic.binding.Jenabean.*;

public class TestResource {

	@Test
	public void basic() {
		Jenabean J = Jenabean.instance();
		J.bind(ModelFactory.createDefaultModel());
		Bug ant = new Bug();
		ant.setName("ant");
		ant.setSimilarTo(new Resource_("http://termite"));
		ant.save();
		Bug termite = new Bug();
		termite.setName("termite");
		termite.setSimilarTo(new Resource_("http://termite"));
		termite.save();

		Collection<Bug> bugs = load(Bug.class);
		for (Bug bug : bugs) {
			assertEquals("http://termite", bug.getSimilarTo().toString());
		}
		
		String query =
			"PREFIX : <http://test.resource/>\n" +
			"SELECT ?s WHERE {?s a :Bug }";
	    bugs = query(Bug.class, query);
	    assertEquals(2, bugs.size());
		
		
	}
	
	@Test
	public void collection() {
		Jenabean J = Jenabean.instance();
		J.bind(ModelFactory.createDefaultModel());
		Harmonica h = new Harmonica();
		h.setSimilarTo(new ArrayList<Resource_>());
		h.getSimilarTo().add(new Resource_("http://trombone"));
		h.getSimilarTo().add(new Resource_("http://trumpet"));
		h.save();
		//J.model().write(System.out, "N3");
		
		Collection<Harmonica> harmonicas = include("similarTo").load(Harmonica.class);
		assertEquals(1, harmonicas.size());
		assertEquals(2, harmonicas.iterator().next().getSimilarTo().size());
		
		harmonicas = loadDeep(Harmonica.class);
		assertEquals(1, harmonicas.size());
		assertEquals(2, harmonicas.iterator().next().getSimilarTo().size());
	}
	
	@Test
	public void list() throws NotFoundException {
		Jenabean J = Jenabean.instance();
		J.bind(ModelFactory.createDefaultModel());
		Harmonica h = new Harmonica();
		h.setSimilarTo(new ArrayList<Resource_>());
		h.setDifferentFrom(new ArrayList<Resource_>());
		h.getSimilarTo().add(new Resource_("http://trombone"));
		h.getSimilarTo().add(new Resource_("http://trumpet"));
		h.getDifferentFrom().add(new Resource_("http://piano"));
		h.getDifferentFrom().add(new Resource_("http://drum"));		
		h.getDifferentFrom().add(new Resource_("http://computer"));
		h.getDifferentFrom().add(new Resource_("http://table"));
		h.save();
		//J.model().write(System.out, "N3");
		
		Collection<Harmonica> harmonicas = include("similarTo").load(Harmonica.class);
		assertEquals(1, harmonicas.size());
		assertEquals(2, harmonicas.iterator().next().getSimilarTo().size());
		
		harmonicas = loadDeep(Harmonica.class);
		assertEquals(1, harmonicas.size());
		assertEquals(2, harmonicas.iterator().next().getSimilarTo().size());
		assertEquals(4, harmonicas.iterator().next().getDifferentFrom().size());
		h.getDifferentFrom().remove(1);
		h.save();
		h.fill("differentFrom");
		//J.model().write(System.out, "N3");
		assertEquals(3, h.getDifferentFrom().size());
		h.getDifferentFrom().remove(0);
		h.save();
		h = include("differentFrom").load(Harmonica.class,h.id());
		assertEquals(2, h.getDifferentFrom().size());

	}
	
	@Test
	public void testNull() throws NotFoundException {
		Jenabean J = Jenabean.instance();
		J.bind(ModelFactory.createDefaultModel());
		Bug ant = new Bug();
		ant.setAge(11);
		ant.setName("ant");
		ant.setSimilarTo(new Resource_("http://foo"));
		ant.save();
		ant = ant.load(ant.id());
		assertNotNull(ant.getSimilarTo());
		assertNotNull(ant.getName());		
		
		ant.setSimilarTo(null);
		ant.setName(null);
		ant.save();
		ant = ant.load(ant.id());
		assertNull(ant.getSimilarTo());
		assertNull(ant.getName());
	}
	
}
