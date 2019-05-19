package com.watercorp.easyoffice.apis;

import com.watercorp.easyoffice.domain.Person;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController("/person")
public class PersonResource {

    private Set<Person> people = new HashSet<>();

    public PersonResource() {
        people.add(Person.Builder.create().name("Rafael").age(22).build());
        people.add(Person.Builder.create().name("Gustavo").age(23).build());
    }

    @GetMapping
    public Set<Person> list() {
        return people;
    }

    @PostMapping
    @ResponseBody
    public Set<Person> add(@RequestBody Person person) {
        people.add(person);
        return people;
    }

    @DeleteMapping
    public Set<Person> delete(Person person) {
        people.remove(person);
        return people;
    }

}
