import com.sun.beans.introspect.PropertyInfo.Name;

public class Patient {
   public String name;
   public String med;
   public String bandNum;
   private String entry;
   private String release;
   private String illness;
   private int floorAssign;


public Patient(){
  name = null;
  med = null;
  bandNum = "C" + "0000";
  entry = null;
  release = null;
  illness = null;
  floorAssign = 0;
}

public Patient(String name, String med, String bandNum, String entry, String release, String illness, int floorAssign) {
  this.name = name;
  this.med = med;
  this.bandNum = bandNum;{
   bandNum = 0000;
   System.out.print(bandNum++);
}
  this.entry = entry;
  this.release = release;
  this.illness = illness;
  this.floorAssign = floorAssign;
}

public void setName(String name)
{
  this.name = name;
}

public void setMed(String med)
{
  this.med = med;
}
public void setEntry(String entry)
{
  this.entry = entry;
}
public void setRelease(String release)
{
  this.release = release;
}
public void setIllness(String illness)
{
  this.illness = illness;
}
 public String getName(){
   return name;
 }
   public String getMed(){
   return med;
 }
  public String getEntry(){
   return entry;
 }
  public String getRelease(){
   return release;
 }
  public String getIllness(){
   return illness;
 }
 public void setBandNum(String bandNum){
   this.bandNum = bandNum;
}

public void setFloorAssign(int floorAssign){
   this.floorAssign = floorAssign;
   }
   public getBandNum(){
   return bandNum;
   }
   public int getFloorAssign(){
   return floorAssign;
   }

public void printPatient(){
  System.out.print("Patient: " + name);
  System.out.print("medication: " + med);
  System.out.print("Entry: " + entry);
  System.out.print("Release: "+ release);
  System.out.print("Illness: " + illness);
  System.out.print("Band Number: " + bandNum);
  System.out.print("Floor Assigned: " + floorAssign);

}
}