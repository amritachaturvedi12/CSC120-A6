/* This is a stub for the Library class */

import java.util.Hashtable;

public class Library extends Building{

  private Hashtable<String, Boolean> collection;

  /**
   * Constructs a Library object, which inherits from the Building class.
   * @param name name of the library
   * @param address address of the library
   * @param floors number of floors in the library
   */
  public Library (String name, String address, int floors) 
  {
    super(name, address, floors);
    this.collection = new Hashtable<String, Boolean>();
    System.out.println("You have built a library: 📖");
  }
  
  /**
   * Adds a book to the library's collection.
   * @param title title of book being added
   */
  public void addTitle(String title)
  {
    this.collection.put(title, true);
  }

  /** Removes a book from the library's collection.
   * @param title title of book being removed
   * @return title of book being removed
   */
  public String removeTitle(String title)
  {
    this.collection.remove(title);
    return title;
  }

  /**
   * Checks out a book from the library by making it unavailable.
   * @param title title of the book
   */
  public void checkOut(String title)
  {
    this.collection.replace(title, false);
  }

  /**
   * Returns a book to the library by making it available.
   * @param title title of the book
   */
  public void returnBook(String title)
  {
    this.collection.replace(title, true);
  }

  /**
   * @param title title of the book
   * @return if the library has the book
   */
  public boolean containsTitle(String title)
  {
    return this.collection.containsKey(title);
  }

  /**
   * @param title title of the book
   * @return if the book is currently available in the library
   */
  public boolean isAvailable(String title)
  {
    return this.collection.get(title);
  }

  /**
   * Prints the title of every book in the library and its availability.
   */
  public void printCollection()
  {
    System.out.println(this.collection.toString());

  } 
  public static void main(String[] args) {
    new Library("Neilson", "7 Neilson Drive", 4);
  }
  
  }