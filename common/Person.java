package common;

public class Person {
  private String name;
  private int age;

  public Person() {

  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  public boolean equals(Person other) {
    if (this.name.equals(other.getName()) && this.age == other.getAge()) {
      return true;
    }
    return false;
  }
}
