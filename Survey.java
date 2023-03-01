import java.util.*;

public class Survey
{
  private int year;
  private List < School > schools;

  public Survey (int year)
  {
    this.year = year;
    this.schools = new ArrayList <> ();
  }

  public void addSchool (School school)
  {
    this.schools.add (school);
  }

  // getters
  public int getYear ()
  {
    return year;
  }

  public List < School > getSchools ()
  {
    return schools;
  }
}
