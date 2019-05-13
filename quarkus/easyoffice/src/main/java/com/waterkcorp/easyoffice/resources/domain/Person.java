package com.waterkcorp.easyoffice.resources.domain;

import java.time.LocalDate;
import java.util.Objects;

public class Person {

    private String name;

    private int age;

    private LocalDate birthDate;

    private int hashCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    protected Person(){}

    public static class Builder extends AbstractyEntityBuilder<Person, Builder> {

        public Builder(Person entity) {
            super(entity);
        }

        public static Builder create() {
            return new Builder(new Person());
        }

        public Builder name(String name) {
            entity.name = name;
            return this;
        }

        public Builder age(int age) {
            entity.age = age;
            return this;
        }

        public Builder birthDate(LocalDate birthDate) {
            entity.birthDate = birthDate;
            return this;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(birthDate, person.birthDate);
    }

    @Override
    public int hashCode() {
        int result = hashCode;
        if (result == 0) {
            result = Objects.hash(name, age, birthDate);
        }

        this.hashCode = result;
        return result;
    }
}
