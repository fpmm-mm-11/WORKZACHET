package org.jboss.as.quickstarts.helloworld;

/**
 * Created by Александр on 27.03.2015.
 */

import java.util.*;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.event.Reception;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


@RequestScoped
public class UsersList {


    private List<Users> UsersList;

    @Produces
    @Named
    public List<Users> getMembers() {



        Users ps2 = new Users();
        ps2.setId((long)1337);
        ps2.setEmail("mail");
        ps2.setName("name");
        //ps2.setSurname("surname");

        ArrayList<Users> UsersArray = new ArrayList<Users>();
        UsersArray.add(ps2);

        return UsersArray;
    }
}
