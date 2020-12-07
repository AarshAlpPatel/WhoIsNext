import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
* @author Aarsh Patel
* @version 1.0
* This class contains the methods to analyze csv/txt files
* to determine who should do the next task.
*/
public class Team {
	
	/**
	* This method goes through the list to return who should be the next people to do the task
	* based on the fact that they have done the least amount of tasks
	* @param list An arrayList of the people who are part of the team/organization
	* @param count the amount of people needed to finish the next task
	* @return String of people who should do the next task
	*/
	public static String getLeast(ArrayList<Person> list, int count) {
		ArrayList<Person> newList = new ArrayList<>();
		for (Person person : list) {
			newList.add(person);
		}

		String str = "";
		if (count == 0) {
			return str;
		} else {
			int lowest = newList.get(0).getCount();
			int index = 0;
			for (int i = 1; i < newList.size(); i++) {
				if (newList.get(i).getCount() < lowest) {
					lowest = newList.get(i).getCount();
					index = i;
				}
			}
			str = str + newList.get(index).getName() + " on " + newList.get(index).getMonth() + ", ";
			newList.remove(index);
			return str + getLeast(newList, (count - 1));
		}
	}

	/**
	* This method takes in a file and reads it to create a list of People objects
	* @return ArrayList of People objects from the file
	*/
	public static ArrayList<Person> readFile(String fileName) {
		Scanner scan = null;
		Scanner lineScan = null;
		String line = null;
		File file = new File(fileName);
		ArrayList<Person> teamMembers = new ArrayList<>();
		ArrayList<String> names = new ArrayList<>();

		try {
			scan = new Scanner(file);
			String month;
			String name;
			while (scan.hasNextLine()) {
				line = scan.nextLine();
				lineScan = new Scanner(line);
				lineScan.useDelimiter(",");
				month = lineScan.next();
				name = lineScan.next();
				if (month.equals("$")) {
					teamMembers.add(new Person(name, month));
					names.add(name);
				} else if (!(names.contains(name))) {
					teamMembers.add(new Person(name, month, 1));
					names.add(name);
				} else {
					int index = names.indexOf(name);
					Person person = teamMembers.get(index);
					person.increment();
					person.setMonth(month);
				}
			}
		} catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		return teamMembers;
	}

}