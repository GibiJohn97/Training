package Ascending;

public class details {

	int id;
    String name;
	public details(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	 public int getid()
	    {
	           return id;
	    }
	 public void display() {
         System.out.print("Name=" + name);
         System.out.print(", Id=" + id);
        
  }
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
