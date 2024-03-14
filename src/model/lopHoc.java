package model;

public class lopHoc extends  simhvien{
    private String classroom;
    public lopHoc(){}

    public lopHoc(String name, String classroom) {
        super(name);
        this.classroom = classroom;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
    public String toString(){
        return " ten lop học"+getName()+"lop :"+classroom;
    }
}
