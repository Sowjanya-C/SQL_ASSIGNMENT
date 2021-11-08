package com.sonata.CompareExample;

public class Student implements Comparable<Student> {
	private int stdId;
	private String stdName;
	private int marks;
	
	public Student(int stdId, String stdName, int marks) {
		this.stdId = stdId;
		this.stdName = stdName;
		this.marks = marks;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", marks=" + marks + "]";
	}
	
	public int compareTo(Student st) {
		if(marks == st.marks)
			return 0;
		else if(marks>st.marks)
			return -1;
		else
			return 1;
	}

}
