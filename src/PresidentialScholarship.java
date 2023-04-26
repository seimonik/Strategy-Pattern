public class PresidentialScholarship implements ChangeScholarship{
    // Президентская стипендия
    @Override
    public void applyChange(Student stud) {
        stud.setScholarship(stud.getScholarship()+77777);
    }
}
