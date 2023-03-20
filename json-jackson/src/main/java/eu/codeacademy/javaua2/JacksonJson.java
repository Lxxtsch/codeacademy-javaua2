package eu.codeacademy.javaua2;

import com.fasterxml.jackson.databind.ObjectMapper;
import eu.codeacademy.javaua2.model.Car;
import eu.codeacademy.javaua2.model.Person;
import eu.codeacademy.javaua2.utils.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Hello world!
 *
 */
public class JacksonJson
{
    public static void main( String[] args ) throws IOException, URISyntaxException {

        ////////// Saving to file

        Person person = new Person("Petras", 25);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("target/person.json"), person);

        /////////// Reading from file

        ObjectMapper mapper = new ObjectMapper();

        File file = new File("target/person.json");

        Person personFromJson = mapper.readValue(file, Person.class);
        System.out.println(personFromJson);

        /////////// Using Get from resources class method
        File carFile = FileUtils.getFileFromResource("car.json");

        Car carFromJson = mapper.readValue(carFile, Car.class);
        System.out.println(carFromJson);

    }
}
