import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Core {
  private MainWindow iWindow;

  public Core(MainWindow pMainWindow) {
	  iWindow = pMainWindow;
  }

  public String[] get_Chars(){
	//Filling Characters
	ArrayList<String> al_survs = new ArrayList<String>();
	try{
      BufferedReader br1 = new BufferedReader(new FileReader("Resource/Data/Survivors.txt"));
      String read_String;
      while ((read_String = br1.readLine()) != null) {
    	  al_survs.add(read_String);
      }
      br1.close();
    }catch(Exception e){
      System.out.println("Error reading the Survivors List \n"+e);
    }
	String[] survivors = al_survs.toArray(new String[al_survs.size()]);
	return survivors;
  }
  
  public String[] get_Flashlights(){
		//Filling Characters
		ArrayList<String> al_flash = new ArrayList<String>();
		try{
	      BufferedReader br1 = new BufferedReader(new FileReader("Resource/Data/Flashlights.txt"));
	      String read_String;
	      while ((read_String = br1.readLine()) != null) {
	    	  al_flash.add(read_String);
	      }
	      br1.close();
	    }catch(Exception e){
	      System.out.println("Error reading the Survivors List \n"+e);
	    }
		String[] flashlights = al_flash.toArray(new String[al_flash.size()]);
		return flashlights;
  }

  public String[] get_Stats(String charname){
	  String[] char_stats = new String[7];
	  try{
	      BufferedReader br1 = new BufferedReader(new FileReader("Resource/Data/Survivor Stats/"+charname+".txt"));
	      String read_String;
	      while ((read_String = br1.readLine()) != null) {
	    	  String part[] = read_String.split(":");
	    	  if (part[0].equals("Speed")) {char_stats[0]=part[1];}
	    	  if (part[0].equals("Endurance")) {char_stats[1]=part[1];}
	    	  if (part[0].equals("Exploration")) {char_stats[2]=part[1];}
	    	  if (part[0].equals("Battery Management")) {char_stats[3]=part[1];}
	    	  if (part[0].equals("Bravery")) {char_stats[4]=part[1];}
	    	  if (part[0].equals("Stealth")) {char_stats[5]=part[1];}
	    	  if (part[0].equals("Vitality")) {char_stats[6]=part[1];}
	      }
	      br1.close();
	  }catch(Exception e){
		  System.out.println("Error reading Character "+charname+" Stats \n"+e);
	  }
	  return char_stats;
  }
  
  public String[] get_FlashStats(String flashlightname){
	  String[] flash_stats = new String[7];
	  try{
	      BufferedReader br1 = new BufferedReader(new FileReader("Resource/Data/Flashlight Stats/"+flashlightname+".txt"));
	      String read_String;
	      while ((read_String = br1.readLine()) != null) {
	    	  String part[] = read_String.split(":");
	    	  if (part[0].equals("Battery Life")) {flash_stats[0]=part[1];}
	    	  if (part[0].equals("Range")) {flash_stats[1]=part[1];}
	    	  if (part[0].equals("Spread")) {flash_stats[2]=part[1];}
	    	  if (part[0].equals("Speed")) {flash_stats[3]=part[1];}
	    	  if (part[0].equals("Endurance")) {flash_stats[4]=part[1];}
	    	  if (part[0].equals("Exploration")) {flash_stats[5]=part[1];}
	    	  if (part[0].equals("Stealth")) {flash_stats[6]=part[1];}
	      }
	      br1.close();
	  }catch(Exception e){
		  System.out.println("Error reading Flashlight "+flashlightname+" Stats \n"+e);
	  }
	  return flash_stats;
  }
  
  public String[] get_SkinStats(String charname){
	  ArrayList<String> al_skin_stats = new ArrayList<String>();
	  try{
	      BufferedReader br1 = new BufferedReader(new FileReader("Resource/Data/Survivor Skins/Skins_"+charname+".txt"));
	      String read_String;
	      while ((read_String = br1.readLine()) != null) {
	    	  al_skin_stats.add(read_String);
	      }
	      br1.close();
	  }catch(Exception e){
		  System.out.println("Error reading Character "+charname+" Stats \n"+e);
	  }
	  String[] skin_stats = al_skin_stats.toArray(new String[al_skin_stats.size()]);
	  return skin_stats;
  }
}