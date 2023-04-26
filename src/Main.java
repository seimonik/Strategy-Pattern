import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// InputMismatchException выдается сканером, чтобы указать, что извлеченный токен не соответствует шаблону
// для ожидаемого типа или что токен находится вне диапазона для ожидаемого типа.
public class Main {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Количество студентов: ");
            int count = in.nextInt();

            ArrayList<Student> students = new ArrayList<Student>();
            System.out.println("Введите имена студентов и информацию о стипендии (1 - отличник, 2 - повышенная, 3 - президентская, 4 - без надбавок, 0 - обнуление)");
            for (int i = 0; i < count; i++) {
                students.add(new Student(in.next()));
                int command = in.nextInt();
                if(command < 0 || command > 4){
                    throw new RuntimeException("Выход за диапазон доступных команд");
                }
                switch (command){
                    case 0:
                        new RemoveScholarship().applyChange(students.get(i));
                        break;
                    case 1:
                        new ExcellentStudent().applyChange(students.get(i));
                        break;
                    case 2:
                        new IncreasedScholarship().applyChange(students.get(i));
                        break;
                    case 3:
                        new PresidentialScholarship().applyChange(students.get(i));
                        break;
                }
            }

            for (Student stud:
                 students) {
                System.out.println(stud);
            }
        } catch (InputMismatchException e){
            System.out.println("Введите число");
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
