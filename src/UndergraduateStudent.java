public class UndergraduateStudent implements Student{
    // студент бакалавриата
    String Name;
    double Scholarship=4211.71;
    public UndergraduateStudent(String name){
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
