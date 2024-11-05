// import statements

import java.io.*;
import java.util.*;

public class PriorityQueueLab {

    public static void main(String args[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        String file = "RandIntegers.txt";
        
        try{
            Scanner sc = new Scanner(new File(file));

            while (sc.hasNextLine()) {
                Integer value = Integer.parseInt(sc.nextLine());
                pq.add(value);
            }
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
        }
        catch (Exception e){
            System.out.println("This isn't working");
            System.out.println(e.getMessage());
        }
      
    }  
}