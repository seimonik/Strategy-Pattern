public class PostgraduateStudent implements Student{
    // студент аспирантуры
    private String Name;
    private double Scholarship=1800;
    public PostgraduateStudent(String name){
        this.Name=name;
    }
    public double getScholarship(){
        return this.Scholarship;
    }
    public void setScholarship(double value){
        this.Scholarship=value;
    }
    @Override
    public String toString(){
        return Name + " gets " + Scholarship;
    }
}
