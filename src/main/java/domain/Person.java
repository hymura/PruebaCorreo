package domain;

public class Person {
    private String name;
    private String LastName;

    public Person(String name, String LastName){
        this.name=name;
        this.LastName=LastName;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
