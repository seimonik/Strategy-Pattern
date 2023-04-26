public class Student {
    private String Name;
    private double Scholarship=4211.71;
    public Student(String name){
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
