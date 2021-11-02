package oop.lab03.acme;

import java.util.Arrays;

public class Exam {
	
	private final int id;
	private final int maxStudents;
	private int registeredStudents;
	private final String courseName;
	private Professor professor;
	private ExamRoom room;
	private Student[] students;
	
	public Exam(final int id, final int maxStudents, final String courseName, Professor professor, ExamRoom room) {
		this.id = id;
		this.maxStudents = maxStudents;
		this.courseName = courseName;
		this.professor = professor;
		this.room = room;
		this.students = new Student[this.maxStudents];
	}

	public int getId() {
		return this.id;
	}

	public int getMaxStudents() {
		return this.maxStudents;
	}

	public int getRegisteredStudents() {
		return this.registeredStudents;
	}

	public String getCourseName() {
		return this.courseName;
	}

	public Professor getProfessor() {
		return this.professor;
	}

	public ExamRoom getRoom() {
		return this.room;
	}

	public Student[] getStudents() {
		return this.students;
	}
	
	public void registerStudent(Student student) {
		if(this.registeredStudents < this.maxStudents) {
			this.students[this.registeredStudents] = student;
			this.registeredStudents++;
		}
	}

	public String toString() {
		return "Exam [id=" + id + ", maxStudents=" + maxStudents + ", registeredStudents=" + registeredStudents
				+ ", courseName=" + courseName + ", professor=" + professor.getUsername() + ", room=" + room + ", students="
				+ Arrays.toString(students) + "]";
	}
	
}
