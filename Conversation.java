import java.util.Scanner;

import javax.lang.model.type.MirroredTypesException;

import java.util.Random;
import java.util.ArrayList;

class Conversation {

  /**
   * 
   * @param String list
   */
  public static void main(String[] arguments) { // start 

 // You will start the conversation here.

  { // first 
    System.out.println("java conversation");
    System.out.println("how many rounds?");
    Scanner input = new Scanner(System.in);

    // user input for number of rounds
    int number_rounds = input.nextInt();
  
    System.out.println("what's up");
  
    // list of possible responses
     String[] responses = new String[7];

     responses[0] = "wow!";
     responses[1] = "cool";
     responses[2] = "alright";
     responses[3] = "uh huh";
     responses[4] = "go on...";
     responses[5] = "tell me more";
     responses[6] = "interesting!";

     // list to add input and responses to transcript
     ArrayList<String> transcript = new ArrayList<String>();
     

     ArrayList<String> conversation = new ArrayList<String>();
     
     String convo_input = input.nextLine();
     // run for the number of rounds from input
     for (int i = 0; i < number_rounds; i++) { // second 
            int index = (int)(Math.random() * responses.length);
            convo_input = input.nextLine();
            transcript.add(convo_input);
            conversation.add(convo_input);
            
  
          // if mirror words present, replace
          if (convo_input.contains("i ") || convo_input.contains(" i ") || convo_input.contains(" me") || convo_input.contains("am ") || convo_input.contains("my ")){
            String convo =  convo_input.replace("i ", " you "); 
            convo =  convo.replace("am ", " are ");
            convo =  convo.replace(" me", " you ");
            convo =  convo.replace("my ", " your ");
            
            System.out.print(convo);
            System.out.println("?");
            transcript.add(convo + "?");
          }
            
            else {
            System.out.println(responses[index]);
            transcript.add(responses[index]);
            }
           
      
} // end second 
  // goodbye note
  System.out.println("nice talk, goodbye!");
  System.out.println("transcript:");
  System.out.println("what's up");
  System.out.println(transcript);
  System.out.println("nice talk, goodbye!");
} // end first  

} // end public class 

} // end class 

