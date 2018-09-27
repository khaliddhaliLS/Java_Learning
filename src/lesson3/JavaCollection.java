/* Cover: Collection Interface
 * 	Brief: Collection is java Interface.
 *  Interface hierarchy is follow...
 *  	Collection
 *  
 */
package lesson3;
import java.util.ArrayList;
import java.util.Collection;

public class JavaCollection {
	/*~~~~~~~~~~~~~~~~~~~~~~~ArrayList~~~~~~~~~~~~~~~~~~
	 * Collection is interface, but as an interface need to implement.
	 * Hence ArrayList and many others Class can implement the interface.
	 * ArrayList doesn't keep index.
	 * ArrayList doesn't sort data.
	 * ArrayList doesn't 
	 *  
	 */
	
	//Following arrlst can hold any type of data simultaneously. 
	private Collection arrlst = new ArrayList<Integer>();
	
	//Following is generic Array can only hold defined datatype (generic)
	private Collection<Integer> genericArrlst = new ArrayList<>();
	
	//Constructor
	public JavaCollection() {
		// TODO Auto-generated constructor stub
		
	}
	
	//Getters Setters
	
	public Collection getArrlst() {
		return arrlst;
	}

	public void setArrlst(Collection arrlst) {
		this.arrlst = arrlst;
	}

	public Collection<Integer> getGenericArrlst() {
		return genericArrlst;
	}

	public void setGenericArrlst(Collection<Integer> genericArrlst) {
		this.genericArrlst = genericArrlst;
	}
}
