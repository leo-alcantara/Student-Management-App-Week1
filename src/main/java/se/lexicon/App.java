package se.lexicon;

import Config.ComponentScanConfig;
import data_access.StudentDao;
import models.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {

    public static void main(String[] args) {


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);

        StudentDao studentDao = context.getBean(StudentDao.class);

        Student student = new Student(1, "Laurita");
        Student student1 = new Student(2, "Leo");

        studentDao.save(student);
        studentDao.save(student1);

        studentDao.findAll().forEach(System.out::println);



    }




}
