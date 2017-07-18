package test.thing;

import thewebsemantic.Thing;

import org.apache.jena.ontology.*;
import org.apache.jena.rdf.model.*;
import org.apache.jena.vocabulary.*;

public class ThingFactory {

	Model m;
	public ThingFactory(Model m) {
		this.m = m;
	}

	public Thing _(String string) {
		return new Thing(string, m);
	}

}
