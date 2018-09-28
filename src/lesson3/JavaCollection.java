/* Cover: Collection Interface
 * 	Brief: Collection is java Interface.
 *  Interface hierarchy is follow...
 *  	Collection
 *  
 */
package lesson3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;
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
	
	//Following arrlst can hold any type of data simultaneously. It's called raw type ArrayList.
	private Collection c_arrlst = new ArrayList<Integer>();
	
	//Following is generic Array can only hold defined data type (generic)
	private Collection<Integer> c_IntArrlst = new ArrayList<>();
	
	//List -interface has indexing features, class ArrayList and Vector can implement List Interface.
	//List is sorted, Same data can be inserted. 
	List<String> l_IntArrLst = new ArrayList<>();
	
	//Vector is class that implement List -interface. Vector increase data by 100%. Since is synchronized, it's Theoretically thread-safe.
	//But it's better to use ArrayList.
	Vector<Integer> vector_List = new Vector<>(); 
		
	
	//Constructor
	public JavaCollection() {
		
	}
	
	//Getters Setters	
	public Collection getC_Arrlst() {
		return c_arrlst;
	}

	public void setC_Arrlst(Collection arrlst) {
		this.c_arrlst = arrlst;
	}

	public Collection<Integer> getC_GenericArrlst() {
		return c_IntArrlst;
	}

	public void setC_GenericArrlst(Collection<Integer> genericArrlst) {
		this.c_IntArrlst = genericArrlst;
	}
}
