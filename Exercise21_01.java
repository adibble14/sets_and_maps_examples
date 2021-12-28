import java.util.*;
public class Exercise21_01 {

	public static void main(String[] args) {
		Set<String> s1 = new LinkedHashSet<>();
		Set<String> s2 = new LinkedHashSet<>();
		
		s1.add("George");
		s1.add("Jim");
		s1.add("John");
		s1.add("Blake");
		s1.add("Kevin");
		s1.add("Michael");
		
		s2.add("George");
		s2.add("Katie");
		s2.add("Kevin");
		s2.add("Michelle");
		s2.add("Ryan");
		
		System.out.println("The union of the two sets is " + union(s1,s2) );
		System.out.println("The difference of the two sets is " + difference(s1,s2));
		System.out.println("The intersection of the two sets is "+intersection(s1,s2));
	}
	
	public static Set<String> union(Set<String> s1, Set<String> s2){
		Set<String> result = new LinkedHashSet<>();
		
		result.addAll(s1);
		result.addAll(s2);
		return result;
	}
	
	public static Set<String> difference(Set<String> s1, Set<String> s2){
		Set<String> result = new LinkedHashSet<>();
		
		result.addAll(s1);
		result.removeAll(s2);
		return result;
		
	}
	
	public static Set<String> intersection(Set<String> s1, Set<String> s2){
		Set<String> result = new LinkedHashSet<>();
		
		result.addAll(s1);
		result.retainAll(s2);
		return result;
		
		
	}

}
