class Person {
  public
  String name;
  int age;
  String color;

  Person(String aName, int anAge, String aColor){
    name = aName;
    age = anAge;
    color = aColor;
  }

  String getName(){
    return name;
  }

  int getAge(){
    return age;
  }

  String getColor(){
    return color;
  }
}