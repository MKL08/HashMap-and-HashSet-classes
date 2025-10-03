import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 7.0
 */
public class Responder
{
    private HashMap<String, String> responseMap;
    private ArrayList<String> defaultResponses;
    private String lastDefault;
    private Random random;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        responseMap=new HashMap<>();
        defaultResponses=new ArrayList<>();
        lastDefault="";
        random=new Random();
        fillResponsesMap();
        fillDefaultResponses();
    }

    private void fillResponsesMap()
    {
        responseMap.put("hello","Hello,there!");
        responseMap.put("bye","Goodbye!");
        responseMap.put("crash","Can you describe what you were doing?");
        responseMap.put("slow","Have you tried restarting your computer?");
    }
    
    private void fillDefaultResponses()
    {
        defaultResponses.add("Please tell me more.");
        defaultResponses.add("Can you explain more?");
        defaultResponses.add("Please be more detailed.");
    }
    
    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> inputWords)
    {
        for(String word:inputWords)
        {
            if(responseMap.containsKey(word))
            {
                return responseMap.get(word);
            }
        }
        return pickDefaultResponse();
    }
    
    private String pickDefaultResponse()
    {
        String response;
        do
        {
            response=defaultResponses.get(random.nextInt(defaultResponses.size()));
        }
        while (response.equals(lastDefault));
        lastDefault=response;
        return response;
    }
}

