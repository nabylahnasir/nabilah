import java.util.*;
public class SurveyCalculator
{
  public static int getScoreForSchoolInYear (School school, int year)
  {
    int totalScore = 0;
    int count = 0;

    for (MarksEntry entry:school.getMarksEntries ())
      {
	if (entry.getYear () == year)
	  {
	    totalScore += entry.getScore ();
	    count++;
	  }
      }

    if (count > 0)
      {
	return totalScore / count;
      }
    else
      {
	return 0;
      }
  }

  public static double getAverageScoreForSchool (School school)
  {
    int totalScore = 0;
    int count = 0;

  for (MarksEntry entry:school.getMarksEntries ())
      {
	totalScore += entry.getScore ();
	count++;
      }

    if (count > 0)
      {
	return totalScore / (double) count;
      }
    else
      {
	return 0;
      }
  }

  public static double getStandardDeviationForSchool (School school)
  {
    double averageScore = getAverageScoreForSchool (school);
    double sumOfSquaredDifferences = 0;
    int count = 0;

  for (MarksEntry entry:school.getMarksEntries ())
      {
	sumOfSquaredDifferences +=
	  Math.pow (entry.getScore () - averageScore, 2);
	count++;
      }

    if (count > 1)
      {
	double variance = sumOfSquaredDifferences / (count - 1);
	return Math.sqrt (variance);
      }
    else
      {
	return 0;
      }
  }

  public static List < School > sortSchoolsByAverageScore (List < School >
							   schools)
  {
    List < School > sortedSchools = new ArrayList <> (schools);
    sortedSchools.sort (Comparator.
			comparingDouble (SurveyCalculator::
					 getAverageScoreForSchool).
			reversed ());
    return sortedSchools;
  }
}
