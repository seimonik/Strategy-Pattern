public class ExcellentStudent implements ChangeScholarship {
    // Стипендия отличника
    @Override
    public void applyChange(Student stud) {
        stud.setScholarship(stud.getScholarship()+500);
    }
}
