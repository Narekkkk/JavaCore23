package homework.students;

import homework.students.command.Commands;
import homework.students.exception.LessonNotFoundException;
import homework.students.model.Lesson;
import homework.students.model.Student;
import homework.students.storage.LessonStorage;
import homework.students.storage.StudentStorage;

import java.util.Scanner;

public class StudentDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();
    private static LessonStorage lessonStorage = new LessonStorage();

    public static void main(String[] args) {
        Lesson java = new Lesson("Java", "Teacher", 7, 60.000);
        Lesson mySql = new Lesson("MySql", "Teacher", 7, 25.000);
        Lesson php = new Lesson("PHP", "Teacher", 7, 15.000);
        Lesson python = new Lesson("Python", "Teacher", 7, 20.000);
        lessonStorage.add(java);
        lessonStorage.add(mySql);
        lessonStorage.add(php);
        lessonStorage.add(python);
        studentStorage.add(new Student("Bob", "Trump", 16, "374", "Step", java));
        studentStorage.add(new Student("Mike", "Trump", 17, "474", "Step", mySql));
        studentStorage.add(new Student("Nike", "Trump", 20, "574", "Step", php));
        studentStorage.add(new Student("Adidas", "Trump", 19, "674", "Step", python));
        boolean run = true;
        while (run) {
            Commands.printCommands();
            int command;
            try {
                command =  Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                command = -1;
            }
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case (PRINT_ALL_STUDENTS):
                    studentStorage.print();
                    break;
                case (DELETE_STUDENT_BY_INDEX):
                    deleteByIndex();
                    break;
                case (PRINT_STUDENTS_BY_LESSON):
                    printStudentsByLessonName();
                    break;
                case (PRINT_STUDENT_COUNT):
                    System.out.println("Students Count:" + studentStorage.getSize());
                    break;
                case (CHANGE_STUDENT_LESSON):
                    changeStudentLessonName();
                    break;
                case (ADD_LESSON):
                    addLesson();
                    break;
                case (PRINT_ALL_LESSONS):
                    lessonStorage.print();
                    break;
                default:
                    System.out.println("Invalid Command");
            }
        }

    }

    private static void addLesson() {
        System.out.println("Please input Lesson Name");
        String lessonName = scanner.nextLine();
        System.out.println("Please input lesson teacher name");
        String teacherName = scanner.nextLine();
        System.out.println("Please input lesson duration by month");
        int duration = Integer.parseInt(scanner.nextLine());
        System.out.println("Input lesson price");
        double price = Double.parseDouble(scanner.nextLine());

        Lesson lesson = new Lesson(lessonName, teacherName, duration, price);
        lessonStorage.add(lesson);
        System.out.println("Lesson Created");
    }

    private static void changeStudentLessonName() {
        studentStorage.print();
        System.out.println("Please Choose Student Index");
        int index = Integer.parseInt(scanner.nextLine());
        Student student = studentStorage.getStudentByIndex(index);
        if (student == null) {
            System.out.println("Wrong Index!");
            changeStudentLessonName();
        } else {
            if (lessonStorage.getSize() != 0) {
                lessonStorage.print();
                System.out.println("Please choose Lesson Index");
                try {
                    int lessonIndex = Integer.parseInt(scanner.nextLine());
                    Lesson lesson = lessonStorage.getLessonByIndex(lessonIndex);
                    student.setLesson(lesson);
                    System.out.println("Lesson Changed!");
                } catch (LessonNotFoundException | NumberFormatException e) {
                    System.out.println("Please input correct index!");
                    changeStudentLessonName();
                }


            }

        }
    }

    private static void printStudentsByLessonName() {
        System.out.println("Please input lesson name");
        String lessonName = scanner.nextLine();
        studentStorage.printStudentsByLessonName(lessonName);
    }

    private static void deleteByIndex() {
        studentStorage.print();
        System.out.println("Please choose student index");
        int index = Integer.parseInt(scanner.nextLine());
        studentStorage.deleteByIndex(index);
    }

    private static void addStudent() {
        if (lessonStorage.getSize() != 0) {
            lessonStorage.print();
            System.out.println("Please choose lesson index");
            Lesson lesson = null;
            try {
                int lessonIndex = Integer.parseInt(scanner.nextLine());
                lesson = lessonStorage.getLessonByIndex(lessonIndex);
                System.out.println("Please input student name");
                String name = scanner.nextLine();
                System.out.println("Please input student surname");
                String surname = scanner.nextLine();
                System.out.println("Please input student phone number");
                String phoneNumber = scanner.nextLine();
                System.out.println("Please input student City");
                String city =  scanner.nextLine();
                System.out.println("Please input student age");
                int age = Integer.parseInt(scanner.nextLine());
                Student student = new Student(name,surname,age,phoneNumber,city,lesson);
                studentStorage.add(student);
                System.out.println("Student created");
            }catch (LessonNotFoundException|NumberFormatException e){
                System.out.println("Please choose correct number or index");
                addStudent();
            }

        }
    }



}

