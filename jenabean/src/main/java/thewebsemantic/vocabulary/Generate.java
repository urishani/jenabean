package thewebsemantic.vocabulary;

import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntProperty;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.util.iterator.ExtendedIterator;

public class Generate {
	public static void main(String[] args) {
		String url = args[0];
		OntModel m = ModelFactory.createOntologyModel();
		m.read(url);
		ExtendedIterator<OntProperty> it = m.listOntProperties();
		while(it.hasNext()) {
			OntProperty op = (OntProperty)it.next();
			if (op.getNameSpace().equals(url + "#") && op.isObjectProperty()) {
				//System.out.println(op);
				System.out.println("Collection<Thing> " + op.getLocalName() + "();");
				System.out.println("Sioc " + op.getLocalName() + "(Thing t);");
			}
		}
	}

}
