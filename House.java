/* This is a stub for the House class */
import java.util.ArrayList;
public class House extends Building {
  private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;
  //Constructor for the House class
  public House(ArrayList<String>residents, boolean hasDiningRoom,String name, String address, int nFloors) {
    super(name, address, nFloors);
    this.residents = residents;
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
}
/*Return whether the house has dining room
 * @return whther the house has dining room
 */
  public boolean hasDiningRoom(){
    return hasDiningRoom;
  }
  /*return the number of residents in a house
   * @return the number of objects in the list of residents
   */
  public int nResident(String person) {
    return residents.size();
}
/*add a resident to the house
 * @param name of the resident
 */
  public void moveIn(String name){
    if (residents.contains(name)){
      throw new RuntimeException("Sorry, the student already exist in the house.");
    }
    residents.add(name);
  }
  /* Remove a student from the house
   * @param<string> name of the student 
   * @return the name of the student removed
   */
  public String moveOut(String name){
    if (residents.contains(name)){
      residents.remove(name);
      return name + "has been removed from the house";
    }
    throw new RuntimeException("Sorry, this student is not in this house");
  }
/*Check whther a student is a resident in this house by checking whether their names are in the list of residents
 * @param name of student
 * @return whether the student is in this house
 */
  public boolean isResident(String person){
    if (residents.contains(person)) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    House house = new House(list,true,"Park House", "Elm St 134",4);
    house.moveIn("Mary");
    house.moveIn("April");
    house.moveOut("April");
    System.out.println(house.isResident("April"));
  }
 

}