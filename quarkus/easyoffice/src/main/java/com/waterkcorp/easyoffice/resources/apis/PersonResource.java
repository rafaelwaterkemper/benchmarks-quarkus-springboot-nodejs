package com.waterkcorp.easyoffice.resources.apis;

import com.waterkcorp.easyoffice.resources.domain.Person;
import io.quarkus.runtime.StartupEvent;

import javax.enterprise.event.Observes;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static java.lang.String.*;

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
        System.out.println(format("GET /person %s", new SimpleDateFormat("HH:mm:ss.SSS").format(new Date(System.currentTimeMillis()))));
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

    void onStart(@Observes StartupEvent startup) {
        System.out.println(format("App start %s", new SimpleDateFormat("HH:mm:ss.SSS").format(new Date())));
    }

}
