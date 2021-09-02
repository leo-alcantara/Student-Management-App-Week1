package data_access;

import models.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;



@Component
public class StudentDaoListImpl implements StudentDao {

    List<Student> studentStorage = null;

    public StudentDaoListImpl(List<Student> studentStorage) {
        this.studentStorage = new ArrayList<>();
    }

    @Override
    public Student save(Student student) {
        studentStorage.add(student);
        return student;
    }

    @Override
    public Student find(int id) {
        //Student newStudent = new Student();
        for (Student student:studentStorage) {
            if(student.getId() == id){
                return student;
            }
        }
 //               studentStorage.stream()
 //               .filter(student -> student.getId()==id)
 //               .findFirst();

        return null;
    }

    @Override
    public List<Student> findAll() {
        return studentStorage;
    }

    @Override
    public void delete(int id) {
        studentStorage.remove(id);
    }
}
