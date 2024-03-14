package model;

public class khoahoc extends simhvien {
    private String id;
    public khoahoc(){}
    public khoahoc( String id,String name
    ){
        super(name);
        this.id=id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String toString(){
        return " ten lop học"+getName()+"mã kh :"+id;
    }
}
