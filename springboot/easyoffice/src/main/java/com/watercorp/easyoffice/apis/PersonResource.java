package com.watercorp.easyoffice.apis;

import com.watercorp.easyoffice.domain.Person;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static java.lang.String.format;

@RestController("/person")
public class PersonResource {

    private Set<Person> people = new HashSet<>();

    public PersonResource() {
        people.add(Person.Builder.create().name("Rafael").age(22).build());
        people.add(Person.Builder.create().name("Gustavo").age(23).build());
    }

    @GetMapping
    public Set<Person> list() {
        System.out.println(format("GET /person %s", new SimpleDateFormat("HH:mm:ss.SSS").format(new Date(System.currentTimeMillis()))));

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
