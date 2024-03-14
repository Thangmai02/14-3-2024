package model;

public class bangdiem extends simhvien {
    private double gpa;
public bangdiem(){}
    public bangdiem(String name, double gpa) {
        super(name);
        this.gpa = gpa;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public String toString(){
        return " ten sv "+getName()+"  diem"+gpa;
    }
}
