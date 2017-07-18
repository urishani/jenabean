package test.resource;

import java.util.Collection;
import java.util.List;

import thewebsemantic.Resource_;
import thewebsemantic.binding.RdfBeanId;

public class Harmonica extends RdfBeanId<Harmonica>{
	
	String name;
	int age;
	Collection<Resource_> similarTo;
	List<Resource_> differentFrom;

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
	public Collection<Resource_> getSimilarTo() {
		return similarTo;
	}
	public void setSimilarTo(Collection<Resource_> similarTo) {
		this.similarTo = similarTo;
	}
	public List<Resource_> getDifferentFrom() {
		return differentFrom;
	}
	public void setDifferentFrom(List<Resource_> differentFrom) {
		this.differentFrom = differentFrom;
	}
}
