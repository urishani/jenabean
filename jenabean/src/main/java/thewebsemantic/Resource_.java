package thewebsemantic;

public class Resource_ {
	String uri;

	public Resource_(String s) {
		uri = s;
	}
	
	@Uri
	public String getUri() {
		return uri;
	}

	public String toString() {
		return uri;
	}
}
