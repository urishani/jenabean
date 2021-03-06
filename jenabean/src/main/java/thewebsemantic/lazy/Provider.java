package thewebsemantic.lazy;

import java.util.List;
import java.util.Set;

import org.apache.jena.rdf.model.Resource;

public interface Provider {

	List lazyList(Resource i, String property, Class type);

	Set lazySet(Resource i, String property, Class type);

}
