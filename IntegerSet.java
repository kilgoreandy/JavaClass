/*
 * IntegerSet.java
 */

/**
 *
 * @author Andy Kilgore
 */
public class IntegerSet {
    boolean[] bset; 
    /** 
     * Creates a new instance of IntegerSet   
     */
    // TODO: implement the constructor
    public IntegerSet(){
        bset = new boolean[101];
    }
    
    /**
     * Return a new IntegerSet containing the union of the two IntegerSet objects
     * passed as arguments
     */
    // TODO: implement the union method
    public static IntegerSet union (IntegerSet a, IntegerSet b){
        IntegerSet unionset = new IntegerSet();
        for(int i=0, j=0; i< 101; i++, j++){
	        if(a.bset[i]== true || b.bset[j]== true )
		        unionset.bset[i]=true;
        }
        return unionset;
    }
    /**
     * Return a new IntegerSet containing the intersection of the two IntegerSet objects
     * passed as arguments
     */
    // TODO: implement the intersection method
     public static IntegerSet intersection(IntegerSet a, IntegerSet b){ // sets arr ele to true if both objects have true 
        IntegerSet interset= new IntegerSet();		
	    for(int i=0, j=0; i<101; i++, j++){
	        if(a.bset[i]== true && b.bset[j]== true )
		    interset.bset[i]=true; 
	}
	return interset; 
    }

    /**
     * Inserts an element into the IntegerSet by setting the corresponding
     * value within the set array to true. Returns false if the value was out
     * of range and true otherwise.
     */
    // TODO: implement the insertElement method
    public IntegerSet insertElement(int data){
  	    bset[data]= true;  // changes array element to true with the integer given in parameter 
        return this; 
    }
    /**
     * Deletes an element from the IntegerSet by setting the corresponding
     * value within the set array to false. Returns false if the value was out
     * of range and true otherwise.
     */
    // TODO: implement the deleteElement method 
    public IntegerSet deleteElement(int data){
  	    bset[data]= false;  // changes array element to true with the integer given in parameter 
        return this; 
    }
    /**
     * @Override the toString method in the Object class
     * Displays the integers contained by the IntegerSet separated by spaces. 
     * An empty set should be displayed as:
     * { --- }
     * An integer set containing 5 and 10 should be displayed as:
     * { 5 10 }
     */
    // TODO: implement the toString method   
    public String toString(){
	String string=""; 
	
	boolean flag= true; // flag will tell is string has to be "---"

	int k;

	for(int i=0; i<101; ++i){
	    if(bset[i]==true){
		flag= false;
		string=string.concat(String.valueOf(i)); // concat has int parameter and returns
		string=string.concat(" ");               // a new string. Old string  + int paramter
	    }
	 }
	
	 if(flag)
	     string="---";  // string is empty 

	  return string;
    }
    public boolean isEqualTo(IntegerSet a){  // search both arrays and returns false as soon as one 
	// of the elements in either objects array is false 
	boolean flag= true;
	
	for(int i=0, j=0; i < this.bset.length; i++, j++){
	    if(this.bset[i]==true  && a.bset[j]== true )
		flag=true;
	    else
		flag=false;
	    
	}
	return flag;
  
    }  
}