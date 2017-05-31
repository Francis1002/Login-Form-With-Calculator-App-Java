package other;

import java.util.ArrayList;
import java.util.List;

public class PersonList {
	private List<Person> persons;

	public PersonList() {
		super();
		this.persons = new ArrayList<Person>();
	}
	
	public boolean add(Person p){
		if(!persons.contains(p)){
			persons.add(p);
			return true;
		}
		return false;
	}
	
	public Person getObject(String username, String password){
		for (int i = 0; i < persons.size(); i++) {
			if(persons.get(i).getUsername().equalsIgnoreCase(username) && persons.get(i).getPassword().equalsIgnoreCase(password)){
				return persons.get(i);
			}
		}
		return null;
	}
	
	
	
	
	
	
	
	

}
