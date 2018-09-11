import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;
/**.
 * List of .
 */
 class List {
    /**.
     * { var_description }
     */
    private int[] list;
    /**.
     * { var_description }
     */
    private int size;
    /**.
     * Constructs the object.
     *
     * @param      capacity  The capacity
     *
     */
    /**.
     * Constructs the object.
     */
     List() {
        /**.
         * { var_description }
         */
        final int ten = 10;
        list = new int[ten];
        size = 0;
    }
    /**.
     * Constructs the object.
     *
     * @param      capacity  The capacity
     */
     List(final int capacity) {
    /**.
     * { item_description }
     */
        list = new int[capacity];
        size = 0;
    }
    /**.
     * { item_description }
     */
    /*
     * The add method does what the name suggests. Add an int item to the list.
     * The assumption is to store the item at the end of the list What is the
     * end of the list? Is it the same as the end of the array? Think about how
     * you can use the size variable to add item to the list.
     *
     * The method returns void (nothing)
     */
    /**.
     * { function_description }
     *
     * @param      item  The item
     */
    public void add(final int item) {
        /**.
         * { item_description }
         */
     /*Inserts the specified element at the end of the list.*/
        if (size == list.length) {
            resize();
        }
        list[size++] = item;
    }
    /**.
     * { function_description }
     */
    private void resize() {
        /**.
         * { item_description }
         */
        list = Arrays.copyOf(list, 2 * size);
    }
    /**.
     * { item_description }
     */
    /*
     * The size method returns the value of the size. The purpose of the method
     * is to announce the size of the list to the objects outside the list
     *
     * The method returns an int. Empty list should return 0.
     *
     */
    /**.
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public int size() {
        /**.
         * { item_description }
         */
        /* replace the code below to implement the size method*/
        return size;
    }
    /**.
     * { item_description }
     */
    /*
     * The remove method does what the name suggests. Removes an int item,
     * specified by the index argument, from the list It also does an additional
     * step. Think about what happens when an item is removed from the middle of
     * the list It creates a hole in the list, right? This would mean, all the
     * items that are to the right side of the removed item should be moved to
     * the left by one position. Here is an example: array =
     * [1,2,3,0,0,0,0,0,0,0] remove(1) would remove the item 2 which is at index
     * position 1. But how do you remove the item from an array? Well, the way
     * to remove it is to move all the items, that are to the right of the
     * removed item, to the left So, the new array looks like this. array =
     * [1,3,0,0,0,0,0,0,0,0] The method returns void (nothing)
     *
     */
    /**.
     * { function_description }
     *
     * @param      index      The index
     *
     * @throws     Exception  { exception_description }
     */
    public void remove(final int index) throws Exception {
        /**.
         * { item_description }
         */
       if (index >= 0 && index < size) {
        for (int i = index; i < size - 1; i++) {
            list[i] = list[i + 1];
        }
        size--;
       } else {

        throw new Exception("Invalid Position Exception");
        //System.out.println("Invalid Position Exception");
       }
    }
    /**.
     * { item_description }
     */
    /*
     * Get method has to return the items that is at the index position passed
     * as an argument to the method. If the item doesn't exist then return a -1
     * to indicate that there is no element at that index. How can an element
     * not be there at a given position? Well, if the position is greater than
     * the number of items in the list then that would mean the item doesn't
     * exist. How do we check if the position is greater than the number of
     * items in the list? Would size variable be useful?
     */
    /**.
     * { function_description }
     *
     * @param      index  The index
     *
     * @return     { description_of_the_return_value }
     */
    public int get(final int index) {
        /* Replace the code below to write the code for get*/
        /**.
         * { item_description }
         */
        if (index >= 0 && index < size) {
            return list[index];
        }
        return -1;
    }
    /**.
     * { item_description }
     */
    /*
     * What happens when you print an object using println? Java provides a
     * method named toString that is internally invoked when an object variable
     * is used in println. For example: List l = new List();
     * System.out.println(l); This statement is a shortcut for
     * System.out.println(l.toString());
     *
     * So, implement the toString method to display the items in the list in the
     * square brackets notation. i.e., if the list has numbers 1, 2, 3 return
     * the string [1,2,3] Caution: The array may be having other elements
     * Example: [1,2,3,0,0,0,0,0,0,0] toString should only return the items in
     * the list and not all the elements of the array.
     */
    /**.
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        /**.
         * { item_description }
         */
       if (size == 0) {
        return "[]";
       }
       String str = "[";
       for (int i = 0; i < size - 1; i++) {
        str += list[i] + ",";
       }
       return str + list[size - 1] + "]";
    }
    /**.
     * { item_description }
     */
    /*
     * Contains return true if the list has the item passed as an argument to
     * the method So, iterate through the list and return true if the item
     * exists and otherwise false
     */
    /**.
     * { function_description }
     *
     * @param      item  The item
     *
     * @return     { description_of_the_return_value }
     */
    public boolean contains(final int item) {
        /**.
         * { item_description }
         */
        /* Replace the code below*/
        if (indexOf(item) == -1) {
            return false;
        }
        return true;
     }
    /**.
     * { item_description }
     */
    /*
     * Returns the index of the first occurrence of the specified element in
     * this list, or -1 if this list does not contain the element.
     */
    /**.
     * Searches for the first match.
     *
     * @param      item  The item
     *
     * @return     { description_of_the_return_value }
     */
    public int indexOf(final int item) {
        /**.
         * { item_description }
         */
        for (int i = 0; i < size; i++) {
            if (list[i] == item) {
                return i;
            }
        }
        return -1;
    }
    /**.
     * { item_description }
     */

    /*
    Inserts all the elements of specified int array to the end of list
    */
    /**.
     * Adds all.
     *
     * @param      newArray  The new array
     */
    public void addAll(final int[] newArray) {
        for (int i = 0; i < newArray.length; i++) {
            add(newArray[i]);
        }
    }
    /**.
     * { item_description }
     */
    /*
     Removes all of its elements that are contained in the specified int
     array.
    */
     /**
      *Removes all.
      *
      * @param      newArray   The new array
      *
      * @throws     Exception  { exception_description }
      */
     public void removeAll(final int[] newArray) throws Exception {
        /**.
         * { item_description }
         */
        for (int i = 0; i < newArray.length; i++) {
            int index = indexOf(newArray[i]);
            while (index != -1) {
                remove(index);
                index = indexOf(newArray[i]);
            }
        }
        throw new Exception("Invalid Position Exception");

     }
    /*
    Returns a list object containing elements, including startIndex and
    excluding endIndex. The first parameter indicates the startIndex and the
    second parameter indicates the endIndex. Returns null and print
    "Index Out of Bounds Exception" if any of values start and end are negative
    and also if start is greater than end.
    */
    /**.
     * { function_description }
     *
     * @param      start      The start
     * @param      end        The end
     *
     * @return     { description_of_the_return_value }
     *
     * @throws     Exception  { exception_description }
     */
    public List subList(final int start, final int end) throws Exception {

        /**.
         * { item_description }
         */
    /* write the logic for subList*/
        if (start < 0 || end < 0) {
            //System.out.println("Index Out of Bounds Exception");
            throw new Exception("Index Out of Bounds Exception");
        }
        if (start > size || end > size || start > end) {
           //System.out.println("Index Out of Bounds Exception");
            throw new Exception("Index Out of Bounds Exception");
        }
        if (start == end && start >= size) {
            //System.out.println("Index Out of Bounds Exception");
            throw new Exception("Index Out of Bounds Exception");
        }
        List newList = new List(end - start);
        for (int i = start; i < end; i++) {
            newList.add(list[i]);
        }
        return newList;
    }
    /**.
     * { item_description }
     */
    /*
    Returns a boolean indicating whether the parameter i.e a List object is
    exactly matching with the given list or not.
    */
    /**.
     * { function_description }
     *
     * @param      newlist  The newlist
     *
     * @return     { description_of_the_return_value }
     */
    public boolean equals(final List newlist) {
        /**.
         * { item_description }
         */
        return toString().equals(newlist.toString());
    }
    /**.
     * { item_description }
     */
    /*
    * Removes all the elements from list
    * Think about this case and make the method
    * the simpler.
    */
    /**.
     * { function_description }
     */
    public void clear() {
        /**.
         * { item_description }
         */
    /*write the logic for clear.*/
        size = 0;
    }
    /**.
     * { function_description }
     *
     * @param      item  The item
     *
     * @return     { description_of_the_return_value }
     */
    public int count(final int item) {

        int count = 0;
        for (int i = 0; i < size; i++) {
            if (item == list[i]) {
                count += 1;
            }
        }
        return count;
    }
}
/**.
 * { item_description }
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        /**.
         * { item_description }
         */
    }
    /**.
     * { function_description }
     *
     * @param      args       The arguments
     *
     * @throws     Exception  { exception_description }
     */
    public static void main(final String[] args) throws Exception {
    /**.
     * { item_description }
     */
    /* create an object of the list to invoke methods on it*/
    List l = new List();
    // code to read the test cases input file
    Scanner stdin = new Scanner(new BufferedInputStream(System.in));
    // check if there is one more line to process
    while (stdin.hasNext()) {
        // read the line
        String line = stdin.nextLine();
        // split the line using space
        String[] tokens = line.split(" ");
        // based on the list operation invoke the corresponding method
        switch (tokens[0]) {
            case "add":
                if (tokens.length == 2) {
                    String[] t = tokens[1].split(",");
                    if (t.length == 1) {
                        l.add(Integer.parseInt(tokens[1]));
                    }
                }
            break;
            case "size":
                System.out.println(l.size());
            break;
            case "print":
                System.out.println(l);
            break;
            case "remove":
            try {
                if (tokens.length == 2) {
                    l.remove(Integer.parseInt(tokens[1]));
                }
                } catch (Exception e) {
                    System.out.println("Invalid Position Exception");
                }
            break;
            case "indexOf":
                if (tokens.length == 2) {
                    System.out.println(l.indexOf(
                        Integer.parseInt(tokens[1])));
                }
            break;
            case "get":
                if (tokens.length == 2) {
                    System.out.println(l.get(
                        Integer.parseInt(tokens[1])));
                }
            break;
            case "contains":
                if (tokens.length == 2) {
                    System.out.println(l.contains(
                        Integer.parseInt(tokens[1])));
                }
            break;
            case "addAll":
                if (tokens.length == 2) {
                    String[] t1 = tokens[1].split(",");
                    int[] temp = new int[t1.length];
                    for (int i = 0; i < temp.length; i++) {
                        temp[i] = Integer.parseInt(t1[i]);
                    }
                    l.addAll(temp);
                }
            break;
            case "removeAll":
            try {
                if (tokens.length == 2) {
                    String[] t2 = tokens[1].split(",");
                    int[] a = new int[t2.length];
                    for (int i = 0; i < t2.length; i++) {
                        a[i] = Integer.parseInt(t2[i]);
                    }
                    l.removeAll(a);
                }
                } catch (Exception e) { }
            break;
            case "subList":
            try {
                if (tokens.length != 2) {
                    break;
                }
                String[] arrstring3 = tokens[1].split(",");
                List object = l.subList(Integer.parseInt(arrstring3[0]),
                        Integer.parseInt(arrstring3[1]));
                if (object != null) {
                    System.out.println(object);
                }
            } catch (Exception e) {
                System.out.println("Index Out of Bounds Exception");
            }
                break;
            case "equals":
                if (tokens.length == 2) {
                    String[] lt = tokens[1].split(",");
                    List l2 = new List();
                    for (int k = 0; k < lt.length; k++) {
                        l2.add(Integer.parseInt(lt[k]));
                    }
                    System.out.println(l.equals(l2));
                }
            break;
            case "clear":
                l.clear();
            break;
            case "count":
            System.out.println(l.count(Integer.parseInt(tokens[1])));
            break;
            default:
            break;
        }
    }
}
}

