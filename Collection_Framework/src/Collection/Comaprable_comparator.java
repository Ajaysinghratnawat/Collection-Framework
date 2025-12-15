package Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//Difference between comparable and comparator
//Feature	                               Comparable	                       Comparator
//Package	                               java.lang	                       java.util
//Method	                               compareTo()	                       compare()
//Sorting logic	                           Inside the class	                   Outside the class
//Modify class needed	                   ✅ Yes	                           ❌ No
//Multiple sorting	                       ❌ No (only one)	                   ✅ Yes (many)
//Used by	                               Collections.sort(list)	           Collections.sort(list, comparator)

//1. Comparable
class Student implements Comparable<Student>{
	int age;
	String name;
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student o) {
		if(o.age==age) {
			return 0;
		}
		else if(o.age<age) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
public class Comparable_Comparator {
	public static void main(String[] args) {
		Student s1 = new Student(21, "Ajay");
		Student s2 = new Student(22, "Rahul");
		ArrayList<Student> stu = new ArrayList<Student>();
		stu.add(s1);
		stu.add(s2);
		System.out.println(stu);
		Collections.sort(stu);
		System.out.println(stu);
	}
}

//2. Comparator
//class Student {
//    int id;
//    String name;
//    int age;
//
//    Student(int id, String name, int age) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//    }
//}
//class AgeComparator implements Comparator<Student> {
//    public int compare(Student s1, Student s2) {
//        return s1.age - s2.age;
//    }
//}
//public class Comparable_Comparator {
//	public static void main(String[] args) {
//		 ArrayList<Student> list = new ArrayList<>();
//		 list.add(new Student(1, "Ajay", 22));
//	     list.add(new Student(2, "Rahul", 19));
//	     list.add(new Student(3, "Neha", 25));
//	     Collections.sort(list, new AgeComparator());
//	     for (Student s : list) {
//	         System.out.println(s.id + " " + s.name + " " + s.age);
//         }
//	}
//}
