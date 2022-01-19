import domain.Bootcamp;
import domain.Course;
import domain.Developer;
import domain.Mentorship;

import java.time.LocalDate;

public class BootcampApplication {

    public static void main(String[] args) {
        Course javaCourse = new Course();
        javaCourse.setTitle("Java");
        javaCourse.setDescription("Introductory Course");
        javaCourse.setWorkload(8);

        Course springCourse = new Course();
        springCourse.setTitle("Spring Framework");
        springCourse.setDescription("Advanced Course");
        springCourse.setWorkload(14);

        Mentorship mentoria = new Mentorship();
        mentoria.setTitle("Java Mentoring");
        mentoria.setDescription("Description Java Mentoring");
        mentoria.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Java Developer");
        bootcamp.setDescription("Description Java Developer");
        bootcamp.getContents().add(javaCourse);
        bootcamp.getContents().add(springCourse);
        bootcamp.getContents().add(mentoria);

        Developer henrique = new Developer();
        henrique.setName("Henrique");
        henrique.registerBootcamp(bootcamp);
        System.out.println("Subscribed Contents Henrique " + henrique.getSubscribedContent());
        henrique.progress();
        henrique.progress();
        henrique.progress();
        System.out.println("-");
        System.out.println("Subscribed Contents Henrique " + henrique.getSubscribedContent());
        System.out.println("Completed Contents Henrique " + henrique.getCompletedContent());
        System.out.println("XP: " + henrique.calculateTotalXp());

        System.out.println("----------");

        Developer bruno = new Developer();
        bruno.setName("Bruno");
        bruno.registerBootcamp(bootcamp);
        System.out.println("Subscribed Contents Bruno " + bruno.getSubscribedContent());
        bruno.progress();
        bruno.progress();
        System.out.println("-");
        System.out.println("Subscribed Contents Bruno " + bruno.getSubscribedContent());
        System.out.println("Completed Contents Bruno " + bruno.getCompletedContent());
        System.out.println("XP: " + bruno.calculateTotalXp());
    }
}
