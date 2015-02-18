package domain;

import java.util.List;

/**
 * Created by T_GermanB1 on 18/02/2015.
 */
public class PersonBuilder
{
    private Long id;

    private String name;

    private List<String> surnames;

    private PersonBuilder()
    {
    }

    public static PersonBuilder aPerson()
    {
        return new PersonBuilder();
    }

    public PersonBuilder withId(Long id)
    {
        this.id = id;
        return this;
    }

    public PersonBuilder withName(String name)
    {
        this.name = name;
        return this;
    }

    public PersonBuilder withSurnames(List<String> surnames)
    {
        this.surnames = surnames;
        return this;
    }

    public PersonBuilder but()
    {
        return aPerson().withId(id).withName(name).withSurnames(surnames);
    }

    public Person build()
    {
        Person person = new Person();
        person.setId(id);
        person.setName(name);
        person.setSurnames(surnames);
        return person;
    }
}
