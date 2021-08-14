import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.io.FileReader;
import java.util.HashMap;
public class RoadTrip{



// }
public static void readRoads(){
	LinkedList<LinkedList<String>>places = new LinkedList<LinkedList<String>>();
	try (BufferedReader list = new BufferedReader(new FileReader("/Users/maxxmuramoto/Desktop/cs245/Project3/roads.csv"))){
            String values;
            while ((values = list.readLine()) != null) {
            	String[] value = values.split(",");
            	LinkedList<String>roads = new LinkedList<String>();
            	roads.add(value[0]);
            	roads.add(value[1]);
            	roads.add(value[2]);
            	roads.add(value[3]);
            	System.out.println(roads);
        } 
    }
        catch (IOException e) {
            System.out.println("Error file not found");
        }
}


public static void main(String[] args) {
	LinkedList<LinkedList<String>>places= new LinkedList<LinkedList<String>>();
	try (BufferedReader list = new BufferedReader(new FileReader("/Users/maxxmuramoto/Desktop/cs245/Project3/roads.csv")))
        {
            String values;
            while ((values = list.readLine()) != null) {
            	String[] value = values.split(",");
            	LinkedList<String>roads = new LinkedList<String>();
            	roads.add(value[0]);
            	roads.add(value[1]);
            	roads.add(value[2]);
            	roads.add(value[3]);
            	places.add(roads);
            	// System.out.println(roads);
            	// System.out.println(places);
            }
        } 
        catch (IOException e) {
            System.out.println("Error file not found");
        }
	LinkedList<LinkedList<String>>allattractions = new LinkedList<LinkedList<String>>();
	try(BufferedReader list = new BufferedReader(new FileReader("/Users/maxxmuramoto/Desktop/cs245/Project3/attractions.csv")))
        {
            String value1;
            while ((value1 = list.readLine()) != null) {
            	String[] value2 = value1.split(",");
            	LinkedList<String>attract = new LinkedList<String>();
                attract.add(value2[0]);
                attract.add(value2[1]);
                allattractions.add(attract);
            }
        } 
        catch (IOException e) {
            System.out.println("Error file not found");
        }
    System.out.println(allattractions);
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Starting City or (Exit to Quit): ");
	String starting_city = scan.nextLine();
	String attractions = "";
	if(starting_city != "Exit"){
		System.out.println("Enter Ending City: ");
		String ending_city = scan.nextLine();
		// while(attractions != "ENOUGH"){
		// 	System.out.println("Enter attractions or :");
		// }
	}

}
}