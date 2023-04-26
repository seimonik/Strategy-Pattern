public class IncreasedScholarship implements ChangeScholarship{
    // Повышенная стипендия
    @Override
    public void applyChange(Student stud){
        stud.setScholarship(stud.getScholarship()+10000);
    }
}