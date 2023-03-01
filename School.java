import java.util.*;
public class School
{
  private String name;
  private String address;
  private String principalFirstName;
  private String principalLastName;
  private List < MarksEntry > marksEntries;

  public School (String name, String address, String principalFirstName,
		 String principalLastName)
  {
    this.name = name;
    this.address = address;
    this.principalFirstName = principalFirstName;
    this.principalLastName = principalLastName;
    this.marksEntries = new ArrayList <> ();
  }

  public void addMarksEntry (MarksEntry entry)
  {
    this.marksEntries.add (entry);
  }

  // getters
  public String getName ()
  {
    return name;
  }

  public String getAddress ()
  {
    return address;
  }

  public String getPrincipalFirstName ()
  {
    return principalFirstName;
  }
  public String getPrincipalLastName ()
  {
    return principalLastName;
  }

  public List < MarksEntry > getMarksEntries ()
  {
    return marksEntries;
  }

}
