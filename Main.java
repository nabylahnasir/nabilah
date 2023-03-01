import java.util.*;

public class Main
{
  public static void main (String[]args)
  {
    // Create some schools with marks entries
    School school1 =
      new School ("School 1",
		  "14, Jalan Residensi, Georgetown, 11900, Penang", "Siti",
		  "Kasim");
      school1.addMarksEntry (new
			     MarksEntry (2022, 98, "001", "Bella", "Pintar"));
      school1.addMarksEntry (new
			     MarksEntry (2022, 70, "002", "Umairah",
					 "Pintar"));
      school1.addMarksEntry (new
			     MarksEntry (2023, 65, "003", "Alia", " Bijak"));
      school1.addMarksEntry (new
			     MarksEntry (2023, 77, "004", "Amin", "Bijak"));

    School school2 =
      new School ("School 2", "13, Jalan Anson, Georgetown, 11400, Penang",
		  "Ahmad", "Razali");
      school2.addMarksEntry (new
			     MarksEntry (2022, 75, "1", "Kamelia", "Pintar"));
      school2.addMarksEntry (new
			     MarksEntry (2022, 70, "2", "Dahlia", "Pintar"));
      school2.addMarksEntry (new
			     MarksEntry (2023, 80, "1", "Mawar", "Bijak"));
      school2.addMarksEntry (new
			     MarksEntry (2023, 90, "2", "Cempaka", "Bijak"));
    // Calculate and display some statistics for the schools
      System.out.println ("Average score for School 1: " +
			  SurveyCalculator.getAverageScoreForSchool
			  (school1));
      System.out.println ("Average score for School 2: " +
			  SurveyCalculator.getAverageScoreForSchool
			  (school2));

      System.out.println ("Standard deviation for School 1: " +
			  SurveyCalculator.getStandardDeviationForSchool
			  (school1));
      System.out.println ("Standard deviation for School 2: " +
			  SurveyCalculator.getStandardDeviationForSchool
			  (school2));

      List < School > schools = Arrays.asList (school1, school2);
      List < School > sortedSchools =
      SurveyCalculator.sortSchoolsByAverageScore (schools);

      System.out.println ("Schools sorted by average score:");
    for (School school:sortedSchools)
      {
	System.out.println (school.getName () + ": " +
			    SurveyCalculator.getAverageScoreForSchool
			    (school));
      }
  }
}
