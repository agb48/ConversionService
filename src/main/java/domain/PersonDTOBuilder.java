package domain;

import java.util.List;

/**
 * Created by T_GermanB1 on 18/02/2015.
 */
public class PersonDTOBuilder
{
    private Long id;

    private String name;

    private List<String> lastNames;

    private String streetAddress;

    private String city;

    private String postalCode;

    private PersonDTOBuilder()
    {
    }

    public static PersonDTOBuilder aPersonDTO()
    {
        return new PersonDTOBuilder();
    }

    public PersonDTOBuilder withId(Long id)
    {
        this.id = id;
        return this;
    }

    public PersonDTOBuilder withName(String name)
    {
        this.name = name;
        return this;
    }

    public PersonDTOBuilder withLastNames(List<String> lastNames)
    {
        this.lastNames = lastNames;
        return this;
    }

    public PersonDTOBuilder withStreetAddress(String streetAddress)
    {
        this.streetAddress = streetAddress;
        return this;
    }

    public PersonDTOBuilder withCity(String city)
    {
        this.city = city;
        return this;
    }

    public PersonDTOBuilder withPostalCode(String postalCode)
    {
        this.postalCode = postalCode;
        return this;
    }

    public PersonDTOBuilder but()
    {
        return aPersonDTO().withId(id).withName(name).withLastNames(lastNames).withStreetAddress(streetAddress)
            .withCity(city).withPostalCode(postalCode);
    }

    public PersonDTO build()
    {
        PersonDTO personDTO = new PersonDTO();
        personDTO.setId(id);
        personDTO.setName(name);
        personDTO.setLastNames(lastNames);
        personDTO.setStreetAddress(streetAddress);
        personDTO.setCity(city);
        personDTO.setPostalCode(postalCode);
        return personDTO;
    }
}
