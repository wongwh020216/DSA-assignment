package dao;

import ADT.CLinkedList;
import ADT.CircularListInterface;
import Entities.Course;
import Entities.Student;
import Entities.TutorialGroup;

public class Initializer {
    
        // TODO: change to tutor class
    public CircularListInterface<String> tutorlistinit(){
        CircularListInterface<String> tutorList = new CLinkedList<>();
        tutorList.add("Tutor1");
        tutorList.add("Tutor2");
        tutorList.add("Tutor3");
        tutorList.add("Tutor4");
        tutorList.add("Tutor5");
        tutorList.add("Tutor6");
        tutorList.add("Tutor7");
        return tutorList;
    }

     //TODO: change to course class
    public CircularListInterface<String> courseListInit(){
        CircularListInterface<String> courseList = new CLinkedList<>();
        courseList.add("Course1");
        courseList.add("Course2");
        courseList.add("Course3");
        courseList.add("Course4");
        courseList.add("Course5");
        courseList.add("Course6");
        courseList.add("Course7");
        return courseList;
    }
    


    

    public CircularListInterface<Student> studentDetailListInit(){
        CircularListInterface<Student> studentlist = new CLinkedList<>();
        studentlist.add(new Student( "Alice", "RSD", "G1", "FOCS", "Alice@tarc.edu.my" ));
        studentlist.add(new Student( "Bob", "RSD", "G1", "FOCS", "Bob@tarc.edu.my" ));
        studentlist.add(new Student( "Charlie","RSD", "G1", "FOCS", "Charlie@tarc.edu.my" ));
        studentlist.add(new Student( "Carl","RSD", "G1", "FOCS", "Carl@tarc.edu.my" ));
        studentlist.add(new Student( "Molly","RSD", "G1", "FOCS", "Molly@tarc.edu.my" ));

        return studentlist;
    }
    public CircularListInterface<Student> studentInitialize1(){
        CircularListInterface<Student> studentlist2 = new CLinkedList<>();
        studentlist2.add(new Student( "Bobby","RSD", "G1", "FOCS", "Bobby@tarc.edu.my" ));
        studentlist2.add(new Student( "Conny","RSD", "G1", "FOCS", "Conny@tarc.edu.my" ));
        studentlist2.add(new Student("Polly","RSD", "G1", "FOCS", "Polly@tarc.edu.my" ));
        studentlist2.add(new Student( "Ken","RSD", "G1", "FOCS", "Ken@tarc.edu.my" ));
        studentlist2.add(new Student( "Sacy","RSD", "G1", "FOCS", "Sacy@tarc.edu.my" ));
        studentlist2.add(new Student( "Paul","RSD", "G1", "FOCS", "Paul@tarc.edu.my" ));
        studentlist2.add(new Student( "Darren","RSD", "G1", "FOCS", "Darren@tarc.edu.my" ));
        return studentlist2;
    }
    
        public CircularListInterface<Student> studentInitialize2(){
        CircularListInterface<Student> studentlist2 = new CLinkedList<>();
        studentlist2.add(new Student( "Bobby","RSD", "G1", "FOCS", "Bobby@tarc.edu.my" ));
        studentlist2.add(new Student( "Conny","RSD", "G1", "FOCS", "Conny@tarc.edu.my" ));
        studentlist2.add(new Student( "Polly","RSD", "G1", "FOCS", "Polly@tarc.edu.my" ));
        studentlist2.add(new Student( "Ken","RSD", "G1", "FOCS", "Ken@tarc.edu.my" ));
        studentlist2.add(new Student( "Sacy","RSD", "G1", "FOCS", "Sacy@tarc.edu.my" ));
        studentlist2.add(new Student( "Paul","RSD", "G1", "FOCS", "Paul@tarc.edu.my" ));
        studentlist2.add(new Student( "Darren","RSD", "G1", "FOCS", "Darren@tarc.edu.my" ));
        return studentlist2;
    }


    // TODO: change to student class
    public CircularListInterface<String> studentInitString(){
        CircularListInterface<String> studentList = new CLinkedList<>();
        studentList.add("Charlie");
        studentList.add("Bob");
        studentList.add("Carl");
        studentList.add("Sally");
        studentList.add("Dave");
        studentList.add("Chum");
        studentList.add("Chummy");
        studentList.add("John");
        studentList.add("Mike");
        studentList.add("Emily");
        studentList.add("Sarah");
        studentList.add("Alex");
        studentList.add("Jessica");
        studentList.add("Tyler");
        studentList.add("Liam");
        studentList.add("Olivia");
        studentList.add("Ethan");
        studentList.add("Ava");
        studentList.add("Noah");
        studentList.add("Isabella");
        studentList.add("Mason");
        return studentList;
    }



    public CircularListInterface<TutorialGroup> tutorialGroupListInit(){
        CircularListInterface<TutorialGroup> tutorialGrouplist = new CLinkedList<>();
        tutorialGrouplist.add(new TutorialGroup("GRP1", "Tutor1", "Course1"));
        tutorialGrouplist.add(new TutorialGroup("GRP2", "Tutor2", "Course2"));
        tutorialGrouplist.add(new TutorialGroup("GRP3", "Tutor3", "Course3"));
        tutorialGrouplist.add(new TutorialGroup("GRP4", "Tutor4", "Course4"));
        tutorialGrouplist.add(new TutorialGroup("GRP5", "Tutor5", "Course5"));
        tutorialGrouplist.add(new TutorialGroup("GRP6", "Tutor6", "Course6"));
        tutorialGrouplist.add(new TutorialGroup("GRP7", "Tutor7", "Course7"));
        tutorialGrouplist.add(new TutorialGroup("GRP8", "Tutor8", "Course8"));
        return tutorialGrouplist;
    }
    
    public CircularListInterface<String> courseListInitString(){
        CircularListInterface<String> courseList = new CLinkedList<>();
        courseList.add("DataScience");
        courseList.add("Python");
        courseList.add("Java");
        courseList.add("C++");
        courseList.add("Kotlin");
        courseList.add("MobileApplication");
        courseList.add("MySQL");
        courseList.add("ASP.NET");
        courseList.add("HTML");
        return courseList;
    }
    
    public CircularListInterface<String> programmeInitString(){
        CircularListInterface<String> programmeList = new CLinkedList<>();
        programmeList.add("RSW");
        programmeList.add("RSA");
        programmeList.add("RSB");
        programmeList.add("RSC");
        programmeList.add("RSD");
        programmeList.add("RSE");
        programmeList.add("RSF");
        programmeList.add("RSG");
        programmeList.add("RSH");
        return programmeList;
    }
        
    public CircularListInterface<String> studentClassInitString(){
        CircularListInterface<String> studentClassList = new CLinkedList<>();
        studentClassList.add("FOCS");
        return studentClassList;
    }
    
     public CircularListInterface<String> emailInitString(){
        CircularListInterface<String> emailList = new CLinkedList<>();
        emailList.add("wong@gmail.com");
        return emailList;
    }
     
     public CircularListInterface<Course> courseProgramListInit(){
        CircularListInterface<Course> courseProgramList = new CLinkedList<>();
        courseProgramList.add(new Course("Course1","Program1", "CourseDetail1","Semester1","Faculty1",100));
        courseProgramList.add(new Course("Course1","Program2", "CourseDetail1","Semester1","Faculty2",100));
        courseProgramList.add(new Course("Course1","Program3", "CourseDetail1","Semester1","Faculty3",100));
        courseProgramList.add(new Course("Course2","Program1", "CourseDetail2","Semester1","Faculty1",200));
        courseProgramList.add(new Course("Course2","Program2", "CourseDetail2","Semester2","Faculty2",200));
        courseProgramList.add(new Course("Course2","Program3", "CourseDetail2","Semester3","Faculty3",200));
        courseProgramList.add(new Course("Course3","Program1", "CourseDetail3","Semester1","Faculty4",300));
        courseProgramList.add(new Course("Course3","Program2", "CourseDetail3","Semester2","Faculty5",300));
        courseProgramList.add(new Course("Course3","Program3", "CourseDetail3","Semester3","Faculty6",300));
        courseProgramList.add(new Course("Course4","Program4", "CourseDetail4","Semester1","Faculty4",400));
        courseProgramList.add(new Course("Course5","Program4", "CourseDetail5","Semester2","Faculty5",500));
        courseProgramList.add(new Course("Course7","Program4", "CourseDetail6","Semester3","Faculty6",700));
        courseProgramList.add(new Course("Course4","Program5", "CourseDetail4","Semester2","Faculty1",400));
        courseProgramList.add(new Course("Course5","Program5", "CourseDetail5","Semester3","Faculty2",500));
        courseProgramList.add(new Course("Course6","Program5", "CourseDetail6","Semester1","Faculty3",600));
        courseProgramList.add(new Course("Course4","Program6", "CourseDetail4","Semester3","Faculty4",400));
        courseProgramList.add(new Course("Course6","Program6", "CourseDetail6","Semester2","Faculty6",600));
        courseProgramList.add(new Course("Course10","Program10", "CourseDetail10","Semester10","Faculty10", 1000));

        return courseProgramList;
    }
     
  
        
     
}
