package members;

import java.io.PrintWriter;

public class Person
{
  // +---------------+-------------------------------------------------------
  // | Object fields |
  // +---------------+

  public String name;
  int age;
  public String pgp;
  boolean hungry;

  // +---------------+-------------------------------------------------------
  // | Class fields  |
  // +---------------+
  static int numberOfPeople = 0;

  // +---------------+-------------------------------------------------------
  // | Constructors  |
  // +---------------+
  /**
   * Initialize an existing person 
   * 
   * @param name
   * @param age
   * @param pgp
   */
  public Person(String name, int age, String pgp)
  {
    this.name = name;
    this.age = age;
    this.pgp = pgp;
    this.hungry = true;
    numberOfPeople++;
  }// Person(String, int, String)

  public Person(String name, int age)
  {
      this.name = name;
      this.age = age;
  }
  /**
   * Make a brand new baby person
   * 
   * @param name
   */
  public Person(String name)
  {
    this.name = name;
    this.age = 0;
    this.hungry = true;
    this.pgp = "ze";
    numberOfPeople++;
  }// Person(String)

  //+-----------+-------------------------------------------------------
  //| Methods   |
  //+-----------+
  
  /**
   * Determine whether this person is hungry
   * @return true if hungry, false otherwise
   */
  public boolean hungry()
  {
    return this.hungry;
  }// hungry()

  /**
   * Eat.
   */
  public void eat()
  {
    if (this.age >= 3)
      this.hungry = false;
  }// eat()

  /**
   * Let society feed a person
   * 
   * @param baby, the Person to be fed
   * @param feeder, the feeding person
   * @post baby.hungry == false
   */
  public static String feed(Person baby)
  {
    baby.hungry = false;
    return baby.name;
  }// feed(Person)

  
  public String toString()
  {
      return this.name + ", " + this.age;
  }//toString
  

  
  public static void main(String[] args)
  {
    PrintWriter pen = new PrintWriter(System.out, true);
    
    System.out.println();
    // Make an adult person
    Person parent = new Person("Peter", 45, "he");
    
    // Make a baby
    Person baby = new Person("Jeremy");
    
    if (parent.hungry())
      {
        pen.println(parent.name + " is hungry!");
        parent.eat();
        pen.println(parent.name + " attempted to eat. Is " + parent.pgp + " hungry now? " + parent.hungry());
      }
    if (baby.hungry())
      {
        pen.println(baby.name + " is hungry!");
        baby.eat();
        pen.println(baby.name + " attempted to eat. Is " + baby.pgp + " hungry now? " + baby.hungry());
        feed(baby);
        pen.println(baby.name + " was fed. Is " + baby.pgp + " hungry now? " + baby.hungry());
      }
    pen.close();
  }// main
}// Person class
