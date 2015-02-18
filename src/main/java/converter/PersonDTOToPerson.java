package converter;

import domain.Person;
import domain.PersonBuilder;
import domain.PersonDTO;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * Created by T_GermanB1 on 18/02/2015.
 */
@Component
public class PersonDTOToPerson implements Converter<PersonDTO, Person>
{
    @Override public Person convert(PersonDTO personDTO)
    {
        return PersonBuilder.aPerson()
            .withName(personDTO.getName())
            .build();
    }
}
