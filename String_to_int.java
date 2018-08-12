package test;
//System.out.println();
import java.util.*;
public class String_to_int {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    char c;
    int n;
    Vector<Integer> list = new Vector<>();
    System.out.println("Input a letter"); 
    String line = in.nextLine();
    n = line.length();
    for (int i = 0;i<n;i++){
        c = line.charAt(i);
        if( Character.isDigit(c)){
           System.out.println(c + " Is a digit");
           list.add(Character.getNumericValue(c));
        }
    }
    Integer[] numbers = list.toArray(new Integer[list.size()]);
    for (int i = 0; i < numbers.length;i++){
        System.out.println(numbers[i]);
    }
    System.out.println(list + "\n " + "\nArray "); 
   }
}
