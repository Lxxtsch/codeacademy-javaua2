package eu.codeacademy.javaua2;

import com.fasterxml.jackson.databind.ObjectMapper;
import eu.codeacademy.javaua2.model.Car;
import eu.codeacademy.javaua2.model.Person;
import eu.codeacademy.javaua2.service.JsonExampleService;
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

        JsonExampleService example = new JsonExampleService();

        example.basicSerializeAndDeserializeExample();
        example.basicDeserializationFromResources();

    }
}
