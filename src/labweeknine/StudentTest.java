package labweeknine;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Assignment a1 = new CourseAssisting(null);
//ResearchAssistant b1 = new ResearchAssistant(null, null, 0);
//b1.addCourseAssistingAssignment(null);


Assignment a1 = new CourseAssisting("a1");
Assignment a2 = new LabCourseAssisting("a2");
Assignment a3 = new CourseInstructing("a3");
Assignment a4 = new ExamOverseeing("a4");
Research r1 = new Research("r1","research1",5);

ResearchAssistant p1 = new ResearchAssistant("00000000000", "ins1", "12345", 2500);
AssistantProffesor p2 = new AssistantProffesor("00000000000", "ins1", "12345", 2500);
p1.addCourseAssistingAssignment(a2);


ArrayList<String> errorLogs= new ArrayList<String>(); 
 
Professor professor = new Professor("1111","Professor" ,"1111",1000);
CourseData[] courses1 = new CourseData[3];
courses1[0] = new UnderGradCourseData("11","Course 1",1);
courses1[1]= new UnderGradCourseData("22","Course 1",10);
courses1[2] =new GradCourseData("22","Course 1",1);
professor.setCourses(courses1);

Professor professor2 = new Professor("1111","Professor" ,"1111",1000);
CourseData[] courses2 = new CourseData[3];
courses2[0] = new UnderGradCourseData("11","Course 1",1);
courses2[1] = new UnderGradCourseData("22","Course 1",1);
courses2[2] = new UnderGradCourseData("22","Course 1",1);
professor2.setCourses(courses2);


Professor professor3 = new Professor("1111","Professor" ,"1111",1000);
CourseData[] courses3 = new CourseData[3];
courses3[0] = new GradCourseData("11","Course 1",1);
courses3[1] = new GradCourseData("22","Course 1",1);
courses3[2] = new GradCourseData("22","Course 1",1);
professor2.setCourses(courses3);

try {
	professor.PaySalary();
	professor2.PaySalary();
	professor3.PaySalary();
}
catch(UMS_PaySalaryError e) {
 for (int i = 0; i < e.getCauses().size(); i++) {
	System.out.println(e.getCauses().get(i));
	
}
}



		/*
	    Student student1 = new MscStudent("111111","Student1",2019);
	    Student student2 = new MscStudent("222222","Student2",2020);
	    Student student3 = new PhdStudent("333333","Student3",2017);
	    Student student4 = new PhdStudent("444444","Student4",2016);
	    Student student5 = new PhdStudent("555555","Student5",2018);
        Student student6 = new UnderGradStudent("666666","Student6",2017);
        Student student7 = new UnderGradStudent("777777","Student7",2018);

        Caretaker caretaker1 = new Caretaker("1233213", "temizlikçi", "221312", 00.00);
        caretaker1.AddClassroom(new LectureHall("1", "location", 150));
        caretaker1.EarnedHisSalary(caretaker1.getClassrooms());
        if (caretaker1.EarnedHisSalary(caretaker1.getClassrooms()) == true) {
            System.out.println("hak etti");
        } else {
            System.out.println("Hak etmedi");
        }        
        
        Caretaker caretaker2 = new Caretaker("1233213", "temizlikçi", "221312", 00.00);
        caretaker2.AddClassroom(new LectureHall("1", "location", 150));
        caretaker2.AddClassroom(new LectureHall("1", "location", 150));
        caretaker2.AddClassroom(new LectureHall("1", "location", 150));
        caretaker2.EarnedHisSalary(caretaker2.getClassrooms());
        if (caretaker2.EarnedHisSalary(caretaker2.getClassrooms()) == true) {
            System.out.println("hak etti");
        } else {
            System.out.println("Hak etmedi");
        }        
        
        
	    
        Instructor instructor1 = new Instructor("1232133", "instructor", "4432432", 00.00);
        
        instructor1.AddCourse(new GradCourseData("ceng101", "prog 1", 4));
        instructor1.AddCourse(new GradCourseData("ceng102", "prog 2", 3));
        instructor1.AddCourse(new GradCourseData("ceng103", "prog 3", 2));
        instructor1.AddCourse(new UnderGradCourseData("ceng104", "prog 4", 5));
        
        instructor1.EarnedHisSalary(instructor1.getGiven_courses());
        if (instructor1.EarnedHisSalary(instructor1.getGiven_courses()) == true) {
            System.out.println("hak etti");
        } else {
            System.out.println("Hak etmedi");
        }        
        
        Instructor instructor2 = new Instructor("323213", "instructor", "4432432", 00.00);
        instructor2.AddCourse(new GradCourseData("ceng101", "prog 1", 4));
        instructor2.AddCourse(new GradCourseData("ceng102", "prog 2", 3));
        instructor2.EarnedHisSalary(instructor2.getGiven_courses());
        if (instructor2.EarnedHisSalary(instructor2.getGiven_courses()) == true) {
            System.out.println("hak etti");
        } else {
            System.out.println("Hak etmedi");
        }        
        

	    
        student1.addCourse(new GradCourseData("ceng101","Lecture1",5));
        student1.addCourse(new GradCourseData("ceng102","Lecture2",6));
        student1.addCourse(new UnderGradCourseData("ceng103","Lecture3",50));
        student1.addCourse(new GradCourseData("ceng104","Lecture4",6));

       
        student2.addCourse(new GradCourseData("ceng101","Lecture1",5));
        student2.addCourse(new GradCourseData("ceng102","Lecture2",6));
        student2.addCourse(new GradCourseData("ceng103","Lecture3",50));
        student2.addCourse(new GradCourseData("ceng104","Lecture4",6));

        
        student3.addCourse(new GradCourseData("ceng101","Lecture1",5));
        student3.addCourse(new GradCourseData("ceng102","Lecture2",60));
        student3.addCourse(new GradCourseData("ceng103","Lecture3",50));
        student3.addCourse(new GradCourseData("ceng104","Lecture4",6));

        
        student4.addCourse(new GradCourseData("ceng102","Lecture2",40));
        student4.addCourse(new GradCourseData("ceng103","Lecture3",50));
        student4.addCourse(new GradCourseData("ceng104","Lecture4",60));

       
        student5.addCourse(new GradCourseData("ceng101","Lecture1",5));
        student5.addCourse(new GradCourseData("ceng102","Lecture2",60));
        student5.addCourse(new GradCourseData("ceng103","Lecture3", 15));
        student5.addCourse(new GradCourseData("ceng104","Lecture4",6));

        student6.addCourse(new UnderGradCourseData("ceng101","Lecture1",5));
        student6.addCourse(new UnderGradCourseData("ceng102","Lecture2",60));
        student6.addCourse(new UnderGradCourseData("ceng103","Lecture3",50));
        student6.addCourse(new UnderGradCourseData("ceng104","Lecture4",6));


        student7.addCourse(new UnderGradCourseData("ceng101","Lecture1",5));
        student7.addCourse(new UnderGradCourseData("ceng102","Lecture2",6));
        student7.addCourse(new UnderGradCourseData("ceng103","Lecture3",50));
        student7.addCourse(new UnderGradCourseData("ceng104","Lecture4",6));

        Student[] students = {student1,student2,student3,student4,student5,student6,student7};

        for (int i = 0; i < students.length; i++) {
            System.out.printf("%s %s\n",students[i].getStudent_name(),students[i].check_graduation()?"Mezun olabilir!":"Mezun olamaz!");
        }
	
*/
	}
}
