package classes;

import util.ParseCode;

public class Person {

    private String firstname;
    private String lastname;
    private String code;
    private Integer age;
    private String birthday;
    private String sex;
    private Integer day;
    private Integer month;
    private Integer year;
    private ParseCode parseCode;
    
    public Person(String firstname, String lastname, String code) {
        this.parseCode=new ParseCode(code);
        this.firstname = firstname;
        this.lastname = lastname;
        this.code = code;
        this.setAge();
        this.setBirthday();
        this.setDay();
        this.setYear();
        this.setSex();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge() {
        this.age = parseCode.getAge();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday() {
        this.birthday = parseCode.getBirthday();
    }

    public String getSex() {
        return sex;
    }

    public void setSex() {
        this.sex = parseCode.getSex();
    }

    public Integer getDay() {
        return day;
    }

    public void setDay() {
        this.day = parseCode.getDay();
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear() {
        this.year = parseCode.getYear();
    }

    public ParseCode getParseCode() {
        return parseCode;
    }

    public void setParseCode(ParseCode parseCode) {
        this.parseCode = parseCode;
    }
    
    
}
