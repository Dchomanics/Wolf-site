import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class read
{
public static void main(String[] args) throws FileNotFoundException {
File file = new File("C:\\test\\Raven.txt"); // Text file on computer
Scanner scan = new Scanner(file);
Map<String,Integer> map = new HashMap<String, Integer>();// creates a map, It maps keys to values.
while (scan.hasNextLine()){ String val = scan.nextLine(); // reads the text file 
if(map.containsKey(val) == false) 
map.put(val,1);// sets value of word occurrence by 1
else {int count = (int)(map.get(val)); // counts the word
map.remove(val); //removes current count of word
map.put(val,count+1); }}// replaces count of word +1
Set<Map.Entry<String, Integer>> set = map.entrySet();// sets the maps data 
List<Map.Entry<String, Integer>> sortedList = new ArrayList<Map.Entry<String, Integer>>(set); // makes an new array
Collections.sort( sortedList, new Comparator<Map.Entry<String, Integer>>() // sorts the array
{
public int compare( Map.Entry<String, Integer> a, Map.Entry<String, Integer> b ) // compares the current counts/pairs in the array
{
return (b.getValue()).compareTo( a.getValue() );// returns the highest used words top and descends to single occurrences
}} );
for(Map.Entry<String, Integer> i:sortedList){
System.out.println(i.getKey()+" -> "+i.getValue());// prints out the now sorted array list
}}}

