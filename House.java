/* This is a stub for the House class */

import java.util.ArrayList;

public class House extends Building{

  private ArrayList<String> residents;
  private boolean hasDiningRoom;

  /**
   * Constructs a House object, which inherits from the Building class.
   * @param name name of the house
   * @param address address of the house
   * @param floors number of floors in the house
   * @param eat if the house has a dining room
   */
  public House(String name, String address, int floors, boolean eat) {
    super(name, address, floors);
    ArrayList<String> residents = new ArrayList<String>();
    hasDiningRoom = eat;
    System.out.println("You have built a house: 🏠");
  }

  /**
   * @return if the house has a dining room
   */
  public boolean hasDiningRoom()
  {
    return this.hasDiningRoom;
  }

  /**
   * @return the number of residents of the house
   */
  public int nResidents()
  {
    return this.residents.size();
  }

  /**
   * Adds a resident to the house.
   * @param name name of new resident
   */
  public void moveIn(String name)
  {
    this.residents.add(name);
  }

  /**
   * Removes a resident from the house.
   * @param name name of resident leaving
   * @return
   */
  public String moveOut(String name) 
  {
    this.residents.remove(name);
    return name;
  }

  /**
   * @param person name of person who may live in the house
   * @return if the person lives in this house
   */
  public boolean isResident(String person)
  {
    return this.residents.contains(person);
  }

  public static void main(String[] args) {
    new House("Morrow", "10 Elm Street", 4, true);
  }

}