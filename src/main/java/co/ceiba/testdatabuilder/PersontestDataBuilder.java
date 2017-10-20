package co.ceiba.testdatabuilder;

import domain.Person;

public class PersontestDataBuilder {
    private String name;
    private  String lastname;

    public Person build() {
        return  new Person(this.name, this.lastname);
    }
}
