public class MarksEntry
{
  private int year;
  private int score;
  private String studentId;
  private String studentName;
  private String className;

  public MarksEntry (int year, int score, String studentId,
		     String studentName, String className)
  {
    this.setYear (year);
    this.score = score;
    this.setStudentId (studentId);
    this.studentName = studentName;
    this.className = className;
  }


  // getters and setters
  public int getYear ()
  {
    return year;

  }

  public void setYear (int year)
  {
    this.year = year;
  }

  public int getScore ()
  {
    return score;
  }

  public void setScore (int score)
  {
    this.score = score;
  }

  public String getStudentId ()
  {
    return studentId;
  }

  public void setStudentId (String studentId)
  {
    this.studentId = studentId;
  }

  public String getStudentName ()
  {
    return studentName;
  }

  public void setStudentName (String studentName)
  {
    this.studentName = studentName;
  }

  public String getClassName ()
  {
    return className;
  }

  public void setClassName (String className)
  {
    this.className = className;
}
}