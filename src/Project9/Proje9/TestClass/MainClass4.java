package Proje9.TestClass;

import Proje9.Lessons.LessonClass;
import Proje9.Lessons.Music;
import Proje9.Student.StudentClass;

public class MainClass4 {
    public static void main(String[] args) throws Exception{

        StudentClass studentClass = new StudentClass("David", "Villa","England" );

        LessonClass lessonClass = new Music(studentClass);

        studentClass.setClassNameAndScore(lessonClass.getClassNameAndScore());

        System.out.println(studentClass);


        /*

        Run the MainClass4

        Result should be
         Exception in thread "main" java.lang.AssertionError: Not able to find a username and password. Please sign up to website

         */
    }
}




