import domain.Course;
import domain.Mentorship;

import java.time.LocalDate;

public class BootcampApplication {

    public static void main(String[] args) {
        Course curso = new Course();
        curso.setTitle("Java");
        curso.setDescription("Curso introdutório");
        curso.setWorkload(8);

        Course curso1 = new Course();
        curso1.setTitle("JavaScript");
        curso1.setDescription("Curso avançado");
        curso1.setWorkload(14);

        Mentorship mentoria = new Mentorship();
        mentoria.setTitle("Mentoria de Java");
        mentoria.setDescription("Abstraindo um Bootcamp usando Java e OO");
        mentoria.setDate(LocalDate.now());

        System.out.println(curso);
        System.out.println(curso1);
        System.out.println(mentoria);
    }
}
