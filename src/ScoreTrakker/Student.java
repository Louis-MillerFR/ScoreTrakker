package ScoreTrakker;

public class Student {
	/*
    Has two private attributes: name (a String) and score (an int). Include a constructor to initialize fields .
    Implements Comparable<Student>. You may compare either based on name or score (your choice).
    Includes a toString() method that matches format in figure 1.
	 */
	private String name;
	private int score;
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public String toString() {
		return name + " " + score;
	}
}
