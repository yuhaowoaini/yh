package ew.demo.model;

public class Qq {
    private int id;
    private int school_id;
    private String sex;
    private String mobilel;
    private String real_name;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSchool_id() {
        return school_id;
    }

    public void setSchool_id(int school_id) {
        this.school_id = school_id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMobilel() {
        return mobilel;
    }

    public void setMobilel(String mobilel) {
        this.mobilel = mobilel;
    }

    public String getReal_name() {
        return real_name;
    }

    public void setReal_name(String real_name) {
        this.real_name = real_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Qq{" +
                "id=" + id +
                ", school_id=" + school_id +
                ", sex='" + sex + '\'' +
                ", mobilel='" + mobilel + '\'' +
                ", real_name='" + real_name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
