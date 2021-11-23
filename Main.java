import java.util.*;
import java.io.*;

class Main {

  static ArrayList<Person> people;
  static String filename;
  static FileWriter writeFile;
  static FileReader readFile;

  public static void main(String[] args) {
    
    people = new ArrayList<Person>();
    String name = "";
    String age = "";
    String color = "";

//here the people are added
    people.add(new Person("Ryan", 21, "blue"));
    people.add(new Person("A", 87, "pink"));
    people.add(new Person("B", 13, "yellow"));
    people.add(new Person("C", 55, "black"));
    people.add(new Person("D", 4, "green"));

//here is where the people are written onto the data.txt file
    try {
      writeFile = new FileWriter("data.txt");
      BufferedWriter output = new BufferedWriter(writeFile);

      for(int i = 0; i < people.size(); i++) {
        output.write(people.get(i).getName());
        output.newLine();
        output.write(Integer.toString(people.get(i).getAge()));
        output.newLine();
        output.write(people.get(i).getColor());
        output.newLine();

        output.flush();
      }
       output.close();
    }
      catch (IOException excpt) {
        System.out.println("An error occurred: " + excpt);
      }

//here is where the data.txt file is read
    try {
      readFile = new FileReader("data.txt");
      BufferedReader reader = new BufferedReader(readFile);

      while (reader.ready()) {
        name = reader.readLine();
        age = reader.readLine();
        color = reader.readLine();

        //System.out.println(name + "/t" + age + "/t" + color);
        System.out.printf("%-25s %-20s %-20s %n", name, age, color);

        Person thePerson = new Person(name, Integer.parseInt(age),color);
        people.add(thePerson);
      }
      reader.close();
     } catch (IOException exception) {
      System.out.println("An error occurred: " + exception);
      }
    }
  }