/**
 * @author Andy Kilgore
 */
public class IntegerSet {
    //Instance variables, boolean array
    boolean[] bset;

    //implemented the no argument constructor, since we want a max range of 100 we will use 101 since we start at 0.
    // All default with false.
    public IntegerSet(){
        bset = new boolean[101];
    }

    /**
     * Return a new IntegerSet containing the union of the two IntegerSet objects
     * passed as arguments
     */
    // implemented the union method, checks for unique values in each of the sets and creates unionset from those values.
    public static IntegerSet union (IntegerSet a, IntegerSet b){
        IntegerSet unionset = new IntegerSet();
        for(int i=0; i< 101; i++){
            if(a.bset[i]== true || b.bset[i]== true )
                unionset.bset[i]=true;
        }
        return unionset;
    }
    /**
     * Return a new IntegerSet containing the intersection of the two IntegerSet objects
     * passed as arguments
     */
    //implemented the intersection method. Compare the index at each set for common values, adds the value to new set interset.
    public static IntegerSet intersection(IntegerSet a, IntegerSet b){ // sets arr ele to true if both objects have true
        IntegerSet interset= new IntegerSet();
        for(int i=0; i<101; i++){
            if(a.bset[i]== true && b.bset[i]== true )
                interset.bset[i]=true;
        }
        return interset;
    }

    /**
     * Inserts an element into the IntegerSet by setting the corresponding
     * value within the set array to true. Returns false if the value was out
     * of range and true otherwise.
     */
    //implemented the insertElement method. If index is out of range catch.
    public boolean insertElement(int data){
        try {
            bset[data] = true;
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
    /**
     * Deletes an element from the IntegerSet by setting the corresponding
     * value within the set array to false. Returns false if the value was out
     * of range and true otherwise.
     */
    //implemented the deleteElement method. Catch if element is not present.
    public boolean deleteElement(int data){
        try {
            bset[data] = false;
            return true;
        }
        catch (Exception E){
            return false;
        }
    }
    /**
     * @Override the toString method in the Object class
     * Displays the integers contained by the IntegerSet separated by spaces. 
     * An empty set should be displayed as:
     * { --- }
     * An integer set containing 5 and 10 should be displayed as:
     * { 5 10 }
     */
    //implemented the toString method, returns string containing numbers if not then return { --- }
    @Override
    public String toString(){
        String string="{ ";

        boolean bool= true;

        for(int i=0; i<101; ++i){//if any of the items is true then set has numbers set bool to false
            if(bset[i]==true){
                bool= false;
                string=string + String.valueOf(i) + " ";

            }
        }
        string = string + "}";

        if(bool) { // if bool is true, array set is all false and no numbers are present.  returns { --- }
            string = "{ --- }";
        }
        return string;
    }
    public boolean isEqualTo(IntegerSet a){  // search both arrays and returns false as soon as one 
        // of the elements in either objects array is false

        boolean bool = false;
        for (int i = 0; i < a.bset.length; ++i){
            if (a.bset[i] == this.bset[i]){
                bool = true;
            }
            else {
                bool = false;
                break;
            }

        }
        return bool;

    }
}