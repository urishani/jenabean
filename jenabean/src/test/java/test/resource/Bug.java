package test.resource;

import thewebsemantic.Resource_;
import thewebsemantic.binding.RdfBeanId;

public class Bug extends RdfBeanId<Bug>{
	
	String name;
	int age;
	Resource_ similarTo;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Resource_ getSimilarTo() {
		return similarTo;
	}
	public void setSimilarTo(Resource_ similarTo) {
		this.similarTo = similarTo;
	}

}
