

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
/*

        ESMAEEIL ENANI
*/
public class KAU_Management {

    public static void main(String[] args) throws FileNotFoundException {
        Run();
    }

//--------------------Start Method-------------------------
    public static void Run() throws FileNotFoundException {

//------File Creation------------------
        File FR = new File("input.txt");
        if (!FR.exists()) {
            System.out.println("File Not Found!!");
            System.exit(0);
        }
        Scanner in = new Scanner(FR);
        File WF = new File("StudentWrite.txt");
        PrintWriter out = new PrintWriter(WF);
        ReadCommand(in, out, WF);
//----------------------------------------
    }

//------------Command Reader-----------------------------------    
    public static void ReadCommand(Scanner in, PrintWriter out, File WF) throws FileNotFoundException {

        Teacher teacher[] = new Teacher[in.nextInt()];
        Invigilator invigilator[] = new Invigilator[in.nextInt()];
        ExamVenue examVenue[] = new ExamVenue[in.nextInt()];
        Courselab courselab[] = new Courselab[in.nextInt()];
        Course course[] = new Course[in.nextInt()];
        Student student[] = new Student[in.nextInt()];
        int Index[] = new int[6];

        String Command;
        out.println("--------------- Welcome to KAU Management System ---------------");
        while (in.hasNext()) {
            Command = in.next();

            switch (Command) {
//----------------Adding to System--------------------------------------------------------------
                case "Add_Teacher":
                    out.println("Command " + Command + ": Add a new doctor record in the System");
                    if (Index[0] < teacher.length) {
                        
                        teacher[Index[0]] = new Teacher(in.next(), in.next(), in.nextDouble(), in.next(), in.nextInt(), in.nextBoolean(), in.nextInt(), in.next(), in.next(), in.nextInt(), in.nextInt(), in.nextInt(), in.next().charAt(0), in.nextInt(), in.next());
                        out.println(teacher[Index[0]++].toString());
                    
                    } else {
                    
                        out.println("You have exceeded the Maximum limit");
                        out.println("\tSorry you can't Add more Teacher\r\n");
                    }
                    out.println("----------------------------------------------------------------");
                    break;

                case "Add_Invigilator":
                    out.println("Command " + Command + ": Add a new invigilator record in the System");
                    if (Index[1] < invigilator.length) {
                    
                        invigilator[Index[1]] = new Invigilator(in.nextInt(), in.next(), in.next(), in.nextInt(), in.nextBoolean(), in.nextInt(), in.next(), in.next(), in.nextInt(), in.nextInt(), in.nextInt(), in.next().charAt(0), in.nextInt(), in.next());
                        out.println(invigilator[Index[1]++].toString());
                    
                    } else {
                        
                        out.println("You have exceeded the Maximum limit");
                        out.println("\tSorry you can't Add more invigilator\r\n");

                    }
                    out.println("----------------------------------------------------------------");

                    break;

                case "Add_ExamVenue":
                    out.println("Command " + Command + ": Add a new exam venue record in the System");

                    if (Index[2] < examVenue.length) {
                        
                        examVenue[Index[2]] = new ExamVenue(in.nextInt(), in.next(), in.nextInt());
                        out.println("Exam Venue Details are as follows:");
                        out.println(examVenue[Index[2]++].toString() + "\r\n");

                    } else {
                        
                        out.println("You have exceeded the Maximum limit");
                        out.println("\tSorry you can't Add more ExamVenue\r\n");
                    }

                    out.println("----------------------------------------------------------------");
                    break;

                case "Add_CourseLab":

                    out.println("Command " + Command + ": Add a new course lab record in the System");

                    if (Index[3] < courselab.length) {
                        
                        courselab[Index[3]] = new Courselab(in.nextInt(), in.next(), in.nextDouble());
                        out.println(courselab[Index[3]++].toString() + "\r\n");

                    } else {
                        
                        out.println("You have exceeded the Maximum limit");
                        out.println("\tSorry you can't Add more CourseLab\r\n");
                    }

                    out.println("----------------------------------------------------------------");
                    break;

                case "Add_Course":
                    out.println("Command " + Command + ": Add a new course record in the System");

                    if (Index[4] < course.length) {
                        
                        course[Index[4]] = new Course(in.nextInt(), in.next(), in.nextDouble());
                        out.println(course[Index[4]++].toString() + "\r\n");
                        
                    } else {
                        
                        out.println("You have exceeded the Maximum limit");
                        out.println("\tSorry you can't Add more Course\r\n");
                    }
                    out.println("----------------------------------------------------------------");

                    break;

                case "Add_Student":
                    out.println("Command " + Command + ": Add a new Student record in the System");
                    if (Index[5] < student.length) {
                        
                        student[Index[5]] = new Student(in.next(), in.nextInt(), in.nextDouble(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.next(), in.next(), in.nextInt(), in.nextInt(), in.nextInt(), in.next().charAt(0), in.nextInt(), in.next(), in.nextInt(), in.nextInt());
                        out.println(student[Index[5]++].printStudentBasicInfo());
                        

                    } else {
                        
                        out.println("You have exceeded the Maximum limit");
                        out.println("\tSorry you can't Add more Student\r\n");
                        
                    }
                    out.println("----------------------------------------------------------------");
                    break;

//--------------------Assign INFO to Student-----------------------------------------------------------------------
                case "Assign_Teacher_Student":

                    Assign_Teacher(Command, teacher, student, in, out);
                    break;

                case "Assign_ExamVenue_Student":
                    Assign_ExamVenue(Command, examVenue, student, in, out);
                    break;

                case "Assign_Invigilator_Student":
                    Assign_Invigilator(Command, invigilator, student, in, out);
                    break;

                case "Assign_CourseLab_Student":
                    Assign_CourseLab(Command, courselab, student, in, out);
                    break;

                case "Assign_Course_Student":
                    Assign_Course(Command, course, student, in, out);
                    break;

                case "Print_Report":
                    for (int i = 0; i < student.length; i++) {
                        PrintReport(student[i], WF);
                    }

                    break;

                case "Quit":
                    out.println("Thank you for using KAU Management System, Good Bye!");
                    out.close();
                    break;

            }

        }

    }
//-------------------------------------------------------------

    //*********************Assign Teacher to Student**********************************************************    
    public static void Assign_Teacher(String Command, Teacher Teachers[], Student Students[], Scanner in, PrintWriter out) {
        Teacher T = getTeacher(in, Teachers);
        
        if (T != null) {
            Student S = getStudent(in, Students);

            if (S != null) {
                
                out.println("Command " + Command + ": Successfully Processed by the System, Following are the details:");
                S.setTeacher(T);
                out.println("\t\t Student: " + S.getName());
                out.println("\t\tAssigned to Teacher: " + T.getName());

            } else {
                out.println("\r\n\tSorry we don't have this Student ID in the System");
            }
            
        } else {
            out.println("\r\n\tSorry we don't have this Teacher ID in the System");
        }
        out.println("----------------------------------------------------------------");
    }

//*********************Assign Invigilator to Student******************************************************************   
    public static void Assign_Invigilator(String Command, Invigilator Invigilators[], Student Students[], Scanner in, PrintWriter out) {
        Invigilator I = getInvigilator(in, Invigilators);

        if (I != null) {
            Student S = getStudent(in, Students);

            if (S != null) {
                out.println("Command " + Command + ": Successfully Processed by the System, Following are the details:");
                S.setInvigilator(I);
                out.println("\t\t Student: " + S.getName());
                out.println("\t\t Assigned to Invigilator: " + I.getName());

            } else {
                out.println("\r\n\tSorry we don't have this Student ID in the System");
            }

        } else {
            out.println("\r\n\tSorry we don't have this Invigilator ID in the System");
        }

        out.println("----------------------------------------------------------------");
    }

//*********************Assign ExamVenue to Student*************************************************************   
    public static void Assign_ExamVenue(String Command, ExamVenue ExamVenues[], Student Students[], Scanner in, PrintWriter out) {

        ExamVenue E = getExamVenue(in, ExamVenues);
        if (E != null) {
            Student S = getStudent(in, Students);
            if (S != null) {
                out.println("Command " + Command + ": Successfully Processed by the System, Following are the details:");
                S.setExamVenue(E);
                out.println("\t\tStudent: " + S.getName());
                out.println("\t\tAssigned to ExamVenue:");
                out.println("Exam Venue Details are as follows:");
                out.println(E.toString() + "\r\n");
            } else {
                out.println("\r\n\tSorry we don't have this Student ID in the System");
            }

        } else {

            out.println("\r\n\tSorry we don't have this ExamVenue ID in the System");
        }
        out.println("----------------------------------------------------------------");
    }

//*********************Assign CourseLab to Student**************************************************************    
    public static void Assign_CourseLab(String Command, Courselab Courselabs[], Student Students[], Scanner in, PrintWriter out) {
        Student S = getStudent(in, Students);

        if (S != null) {
            out.println("Command " + Command + ": Successfully Processed by the System, Following are the details:");
            out.println("\t\t Student: " + S.getName());

            for (int i = 0; i < S.getTotCourseLabHrs(); i++) {
                S.setCourselab(getCourselab(in, Courselabs), i);
                out.println("\t\t Course Lab added:  " + S.getCourselab(i).toString() + "\r\n");
            }

        } else {
            out.println("\r\n\tSorry we don't have this Student ID in the System");
        }
        out.println("----------------------------------------------------------------");
    }

//********************Assign Course to Student*********************************************************   
    public static void Assign_Course(String Command, Course Courses[], Student Students[], Scanner in, PrintWriter out) {

        Student S = getStudent(in, Students);
        if (S != null) {

            out.println("Command " + Command + ": Successfully Processed by the System, Following are the details:");
            out.println("\t\t Student: " + S.getName());

            for (int i = 0; i < S.getTotCourseHrs(); i++) {
                S.setCourse(getCourse(in, Courses), i);
                out.println("\t\t Course added:  " + S.getCourse(i).toString() + "\r\n");
            }

            
        } else {
            out.println("\r\n\tSorry we don't have this Student ID in the System");
        }

        out.println("----------------------------------------------------------------");

    }

//-----------------get teacher to assgin it to Student-------------    
    public static Teacher getTeacher(Scanner in, Teacher teacher[]) {
        int id = in.nextInt();
        for (int i = 0; i < teacher.length; i++) {
            if (teacher[i].getId() == id) {
                return teacher[i];
            }
        }
        return null;
    }
//-----------------------------------------------------------------

//---------------get Invigilator to assgin it to Student---------------------------
    public static Invigilator getInvigilator(Scanner in, Invigilator invigilator[]) {
        int id = in.nextInt();
        for (int i = 0; i < invigilator.length; i++) {
            if (invigilator[i].getId() == id) {
                return invigilator[i];
            }
        }
        return null;
    }
//---------------------------------------------------------------------------------

//----------------get ExamVenue to assgin it to Student--------------------
    public static ExamVenue getExamVenue(Scanner in, ExamVenue examVenue[]) {
        int id = in.nextInt();
        for (int i = 0; i < examVenue.length; i++) {
            if (examVenue[i].getExamVenueNo() == id) {
                return examVenue[i];
            }
        }
        return null;
    }
//---------------------------------------------------------------------------------

//---------------get Courselab to assgin it to Student---------------------
    public static Courselab getCourselab(Scanner in, Courselab courselab[]) {
        int id = in.nextInt();
        for (int i = 0; i < courselab.length; i++) {
            if (courselab[i].getLabID() == id) {
                return courselab[i];
            }
        }
        return null;
    }
//--------------------------------------------------------------------------

//---------------get Course to assgin it to Student------------
    public static Course getCourse(Scanner in, Course course[]) {
        int id = in.nextInt();
        for (int i = 0; i < course.length; i++) {
            if (course[i].getCourseCode() == id) {
                return course[i];
            }
        }
        return null;
    }
//--------------------------------------------------------------

//---------------get Student to assign what is need---------------
    public static Student getStudent(Scanner in, Student student[]) {
        int id = in.nextInt();
        for (int i = 0; i < student.length; i++) {
            if (student[i].getId() == id) {
                return student[i];
            }
        }
        return null;
    }
//----------------------------------------------------------------

//--------------------Print Student INFO----------------------------------------------
    public static void PrintReport(Student Stu, File WF) throws FileNotFoundException {
        WF = new File(Stu.getName().substring(0, 2) + Stu.getId() + "_Student_Report.txt");
        PrintWriter out = new PrintWriter(WF);
        out.println(Stu.toString());
        out.close();
    }
//------------------------------------------------------------------------------------

}
