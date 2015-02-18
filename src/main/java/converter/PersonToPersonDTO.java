package converter;

import domain.Person;
import domain.PersonDTO;
import domain.PersonDTOBuilder;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * Created by T_GermanB1 on 18/02/2015.
 */
@Component
public class PersonToPersonDTO implements Converter<Person,PersonDTO>
{
    @Override public PersonDTO convert(Person person)
    {
        return PersonDTOBuilder.aPersonDTO()
            .withId(person.getId())
            .withName(person.getName())
            .withLastNames(person.getSurnames()).build();
    }
}
