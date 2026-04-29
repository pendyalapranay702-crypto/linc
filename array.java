import java.util.Iterator;
`o

public class Main {
  public static void main(String[] args) {
    // Create an ArrayList of Strings
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
     cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda" cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda"
              cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda" cars.add("Volvo");
    cars.add("BMW");
    p <String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities   cars.add("Ford");
    cars.add("Mazda"

    // Get an iterator for the ArrayList
    Iterator<String> it = cars.iterator();

    // Iterate through the list using the iterator
    while(it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
