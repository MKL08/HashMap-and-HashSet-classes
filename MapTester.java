import java.util.HashMap;
/**
 * Write a description of class MapTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MapTester
{
    // instance variables - replace the example below with your own
    private HashMap phoneBook=new HashMap();
    public MapTester()
    {
        phoneBook.put("Homer Jay Simpson" , "(531) 9392 4587");
        phoneBook.put("Charles Montgomery Burns" , "(531) 5432 1945");
        phoneBook.put("Apu Nahasapeemapetilon" , "(531) 4234 4418");
    }
    
    public void enterNumber(String name, String number)
    {
        phoneBook.put(name , number);
    }
    
    public String lookupNumber(String name)
    {
        return (String) phoneBook.get(name); 
    }
    
}
