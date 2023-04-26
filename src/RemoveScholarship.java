public class RemoveScholarship implements ChangeScholarship{
    // Стмпендия слетела
    @Override
    public void applyChange(Student stud) {
        stud.setScholarship(0);
    }
}
