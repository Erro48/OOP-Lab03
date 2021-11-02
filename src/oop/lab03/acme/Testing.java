package oop.lab03.acme;

public final class Testing {

    private Testing() { }

    public static void main(final String[] args) {
        /*
         * 1) Creare 3 studenti a piacere 2) Creare 2 docenti a piacere 3)
         * Creare due aulee di esame, una con 100 posti una con 80 posti 4)
         * Creare due esami, uno con nMaxStudents=10, l'altro con nMaxStudents=2
         * 5) Iscrivere tutti e 3 gli studenti agli esami 6) Stampare in stdout
         * la rapresentazione in stringa dei due esami
         */
    	Student s1 = new Student(1,"Mario", "Rossi", "ciao", 2020);
    	Student s2 = new Student(2,"Franco", "Grimaldi", "1234", 2020);
    	Student s3 = new Student(3,"Elena", "Verdi", "#)s", 2021);

    	Professor p1 = new Professor(101, "Mirko", "Viroli", "fagioli", new String[] { "OOP", "MangiaFagioli"} );
    	Professor p2 = new Professor(102, "Vittorio", "Ghini", "ahahah", new String[] { "SO", "Seghini", "RompereICoglioni"} );

    	ExamRoom er1 = new ExamRoom(100, "Aula1", false, true);
    	ExamRoom er2 = new ExamRoom(80, "Aula2", false, true);

    	Exam e1 = new Exam(50, 10, "MangiaFagioli", p1, er1);
    	Exam e2 = new Exam(51, 2, "Seghini", p2, er2);

    	e1.registerStudent(s1);
    	e1.registerStudent(s2);
    	e1.registerStudent(s3);

    	e2.registerStudent(s1);
    	e2.registerStudent(s2);
    	e2.registerStudent(s3);

    	System.out.println(e1);
    	System.out.println(e2);
    	
    	
    }
}
