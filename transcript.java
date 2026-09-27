import java.util.ArrayList;
class course{
    private String name;
    private float credits;
    private float grade;
    public course(String name, float credits){
        this.name=name;
        this.credits=credits;
        this.grade=0.0;
    }
    public void setgrade(float grade){
        this.grade=grade;
    }
    public float getgrade(){
        return grade;
    }
    public String getname(){
        return name;
    }
    public float credits(){
        return credits;
    }
    if(grade==4.0){
        return "a";
    }
    else if(grade>=3.8){
        return "b";
    }
    else if(grade>=3.6){
        return "c";
    }
    else if(grade>=3.4){
        return "d";
    }
    else{
        return "f";
    }
}
class student{
    private String name;
    private int id;
    private ArrayList<course> courses;
    public student(String name, int id){
        this.name=name;
        this.id=id;
        courses=new ArrayList<>()
    }
    public void addcourse(course c){
        courses.add(c);
    }
    public void removecourse(course c){
        courses.remove(c);
    }
    public double getgpa(){
        if(courses.isEmpty){
            return 0.0;
        }
        double total=0.0;
        for(course c:courses){
            total+=c.getgrade();
        }
        return total/courses.size();
    }
    public String gettranscript(){
        String
    }
}
