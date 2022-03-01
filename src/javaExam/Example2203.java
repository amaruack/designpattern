package javaExam;

import java.util.HashSet;
import java.util.Iterator;

class Person {
	String name;
	int age;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public int hashCode(){
		return age%3;
	}
	
	public boolean equals(Object obj) {
		Person per = (Person)obj;
		if(per.name.equals(name) ){
			if (per.age ==age){
				return true;
			}
			return false;
		}
		return false;
	}
}

public class Example2203 {

	public static void main(String[] args) {
		HashSet<Person>	hSet = new HashSet<Person>();
		hSet.add(new Person("이진호", 10));
		hSet.add(new Person("이진호", 20));
		hSet.add(new Person("김명호", 20));
		hSet.add(new Person("김명호", 15));
		hSet.add(new Person("이진호", 20));
		hSet.add(new Person("김명호", 20));
		
		System.out.println(hSet.size());
		Iterator<Person> ite = hSet.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
		
	}
}
