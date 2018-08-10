import java.io.*;
class AddValues{
private int a,b,c;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
public void valueA(){
try{
System.out.println("Enter A");
a = Integer.parseInt(br.readLine());
}catch(IOException e){
    System.out.println("Io Error");
}catch(NumberFormatException ex){
    System.out.println("Enter only Integer value");
    valueA();
}
}
public void valueB(){
try{
    System.out.println("Enter B");
b = Integer.parseInt(br.readLine());
}catch(IOException e){
    System.out.println("Io Error");
}catch(NumberFormatException ex){
    System.out.println("Enter only Integer value");
    valueB();
}
}
public void valueC(){
try{
    System.out.println("Enter C");
c = Integer.parseInt(br.readLine());
}catch(IOException e){
    System.out.println("Io Error");
}catch(NumberFormatException ex){
    System.out.println("Enter only Integer value");
    valueC();
}
}
public void showValues(){
    System.out.println("A = " + a + "\n" + "B = " + b + "\nC = " + c);
}
}
public class Test {
    public static void main(String[] args) {
    System.out.println("Hello");
    AddValues ob = new AddValues();
    ob.valueA();
    ob.valueB();
    ob.valueC();
    ob.showValues();
}
}
