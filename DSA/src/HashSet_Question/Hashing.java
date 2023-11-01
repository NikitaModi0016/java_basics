package HashSet_Question;
import java.util.HashSet;
public class Hashing {

	public static void main(String[] args) {
		// insertion-add(Creation)
		HashSet<String> set=new HashSet<>();
		set.add("Nikita");
		set.add("Suhana");
		set.add("Raya");
		set.add("xaomi");
		
		//search- contains
		if(set.contains("Ritika")){
			System.out.println("Present!");
		}
		else {
			System.out.println("Not Present!");
		}
	}

}
