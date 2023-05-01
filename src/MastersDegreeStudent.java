public class MastersDegreeStudent implements Student{
    //студент магистратуры
    private String Name;
    private double Scholarship=3523.4;
    public MastersDegreeStudent(String name){
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
