/*
 * IntegerSet.java
 */

/**
 *
 * @author Andy Kilgore
 */


/* 
 * Homework Prompt
 * Create class IntegerSet. Each IntegerSet
 * object can hold integers in the range 0–100. The set is represented by an
 * array of booleans. Array element a[i] is true if integer i is in the set.
 * Array element a[j] is false if integer j is not in the set. The noargument constructor initializes the array to the “empty set” (i.e., all
 * false values).
 */
public class IntegerSet {
    
    /** 
     * Creates a new instance of IntegerSet   
     */
    // TODO: implement the constructor
        public IntegerSet(){
            set boolean[] = {};
        }
    
    /**
     * Return a new IntegerSet containing the union of the two IntegerSet objects
     * passed as arguments
     */
    // TODO: implement the union method
        public IntegerSet union (IntegerSet i, IntegerSet j){
            IntegerSet = i + j;
        }
    
    /**
     * Return a new IntegerSet containing the intersection of the two IntegerSet objects
     * passed as arguments
     */
    // TODO: implement the intersection method
    
    /**
     * Inserts an element into the IntegerSet by setting the corresponding
     * value within the set array to true. Returns false if the value was out
     * of range and true otherwise.
     */
    // TODO: implement the insertElement method
    
    /**
     * Deletes an element from the IntegerSet by setting the corresponding
     * value within the set array to false. Returns false if the value was out
     * of range and true otherwise.
     */
    // TODO: implement the deleteElement method 
    
    /**
     * @Override the toString method in the Object class
     * Displays the integers contained by the IntegerSet separated by spaces. 
     * An empty set should be displayed as:
     * { --- }
     * An integer set containing 5 and 10 should be displayed as:
     * { 5 10 }
     */
    // TODO: implement the toString method   
    
    /**
     * Returns true iff the current IntegerSet contains the same integers as
     * the IntegerSet supplied as an argument
     */
	// TODO: implement the isEqualTo method         
}
