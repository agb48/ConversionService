package converter;

import domain.PersonDTO;
import domain.PersonDTOBuilder;
import org.springframework.core.convert.converter.Converter;

/**
 * Created by T_GermanB1 on 18/02/2015.
 */
public class StringToPersonDTO implements Converter<String, PersonDTO>
{
    @Override public PersonDTO convert(String s)
    {
        return PersonDTOBuilder.aPersonDTO().withName(s).build();
    }
}
