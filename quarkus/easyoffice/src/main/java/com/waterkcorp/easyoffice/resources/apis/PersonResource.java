package com.waterkcorp.easyoffice.resources.apis;

import com.waterkcorp.easyoffice.resources.domain.Person;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashSet;
import java.util.Set;

@Path("/person")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonResource {

    private Set<Person> people = new HashSet<>();

    public PersonResource() {
        people.add(Person.Builder.create().name("Rafael").age(22).build());
        people.add(Person.Builder.create().name("Gustavo").age(23).build());
    }

    @GET
    public Set<Person> list() {
        return people;
    }

    @POST
    public Set<Person> add(Person person) {
        people.add(person);
        return people;
    }

    @DELETE
    public Set<Person> delete(Person person) {
        people.remove(person);
        return people;
    }

}
