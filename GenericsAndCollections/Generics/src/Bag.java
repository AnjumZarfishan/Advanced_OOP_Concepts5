import java.util.ArrayList;
import java.util.Random;

public class Bag<T> {
    ArrayList<T> objects;
    public Bag(){
        /* TODO 
Initialize the objects variable*/
        this.objects = new ArrayList<>();
    }
    /* TODO 
code the add method described. It should be public and not 
return anything. Just take in a parameter and  throw an 
exception. Read the documentation for this.*/

 /* TODO 
Code the drawOne method here. It should not take any
parameters. It should return a generic object. More on the
task description.*/
    public void add(T obj) throws BagException {
        // check if the object is null
        if (obj == null)    throw new BagException("Cannot add null to Bag");
        // add the object to the end of list
        objects.add(obj);
    }
/* TODO
howMany is the number of elements to draw. 
Create an ArrayList of the generic type and "drawOne" as
many times as you need, putting the element drawn in the ArrayList.
Then return it. */


    public void add(T element,double prob) throws BagException{
        /* TODO 
Check that the probability is between 0 and 1. Otherwise
throw an exception. */        // This is a way to add elements in a given proportion.

        if (element == null)    throw new BagException("Cannot add null to Bag");
        // check if the probability is invalid
        if (prob < 0 || prob > 1)   throw new BagException("Probability should be between 0 and 1");
        // look at number of elements in `Bag`
        // and insert new element with given probability
        int tot = (int)Math.round(objects.size()*prob);
        for(int k=0;k<tot;k++){
            System.out.println("Adding "+k);
            objects.add(element);
        }
    }

    public ArrayList<T> drawMany(int howMany) {
        // stores the elements to be returned
        ArrayList<T> items = new ArrayList<>();
        // draw elements at random
        for (int k = 0; k < howMany; k++) items.add(drawOne());
        // return the elements
        return items;
    }

    public T drawOne() {
        // get a random Index
        int index = new Random().nextInt(this.objects.size());
        // return the element at given index
        return this.objects.get(index);
    }


}
