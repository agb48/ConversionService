import domain.Person;
import domain.PersonBuilder;
import domain.PersonDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.convert.ConversionService;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by T_GermanB1 on 18/02/2015.
 */
public class Application
{

    public static void main(String[] args)
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"application-context.xml"});

        ConversionService conversionService = (ConversionService)ctx.getBean("conversionService");


        Person person = PersonBuilder.aPerson()
            .withId(1L)
            .withName("some name")
            .build();

        PersonDTO personDTO = conversionService.convert(person, PersonDTO.class);


        assertThat(personDTO.getName(), is(person.getName()));
        assertThat(personDTO.getId(), is(person.getId()));


    }
}
