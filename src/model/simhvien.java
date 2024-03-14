package model;

public class simhvien {
    private String name;
    public simhvien(){}
    public simhvien( String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return " ten SV"+name;
    }
}
