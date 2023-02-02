package Ascending;



public class Arrange {

	private details[] ar;
	private int index;

	public Arrange(int maxSize) 
    {
           ar = new details[maxSize]; 
           index = 0;
    }
	   public void insert(int id, String name) {
           ar[index++] = new details(id, name);
    }
 
    /**
     * This method Display Employee Array
     */
    public void display()
    {
           for (int i = 0; i < index; i++)              
                  ar[i].display();
           System.out.println("");
    }
 
    /**
     * This method Sort Employee Array using Insertion Sort
     */
    public void sortEmployee() {
           int inner, outer;
           details tempValue;
           for (outer = 1; outer < index; outer++) // outer is dividing line
           {
                  tempValue = ar[outer]; // remove the marked Employee
                  inner = outer; // shifting starts at outer
                  while (inner > 0 && ar[inner - 1].getName().compareTo(tempValue.getName()) > 0) { // until we found smaller Employee(employee with smaller name),
                        ar[inner] = ar[inner - 1]; // shift Employee to the right
                        --inner; // go one position left
                  }
                  ar[inner] = tempValue; // insert marked Employee at inner position
           }
    }
           
	}


