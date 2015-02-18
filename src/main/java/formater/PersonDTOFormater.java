package formater;

import domain.PersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

/**
 * Created by T_GermanB1 on 18/02/2015.
 */
@Component
public class PersonDTOFormater implements Formatter<PersonDTO>
{
    @Autowired
    private  ConversionService conversionService;

    @Override public PersonDTO parse(String s, Locale locale) throws ParseException
    {
        return conversionService.convert(s,PersonDTO.class);
    }

    @Override public String print(PersonDTO personDTO, Locale locale)
    {
        return personDTO.toString();
    }
}
