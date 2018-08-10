package javaapplication2;
import java.io.DataInputStream;
import java.util.*;
import java.io.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JavaApplication2 {

    public static void main(String[] args) throws Exception {
        String url = "https://www.flipkart.com/search?q=laptops%20dell";
        Document document = Jsoup.connect(url).get();

        String text = document.select("div._3Wu53n").text();
        //System.out.println("Text is here " + text);

        Elements links = document.select("div._3Wu53n");
        Elements links_rate = document.select("div._1uv9Cb");
        
        System.out.println(links.size());
        System.out.println(links.size());
        for (int i = 0;i <= links_rate.size(); i++){
            try{
            Element element_1 = links.get(i);
            System.out.println(element_1.text());
            }catch(IndexOutOfBoundsException e){
                
                System.out.println("Couldn't find that");
            }
            try{
            Element element = links_rate.get(i);
            System.out.println(element.text()+"\n");
            }catch(IndexOutOfBoundsException e){
                System.out.println("Error Couldn't find taht");
                
            }
        }
        
    }
}
