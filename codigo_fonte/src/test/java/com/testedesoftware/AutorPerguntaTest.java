package com.testedesoftware;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.junit.BeforeClass;
import org.junit.Test;

public class AutorPerguntaTest {

    static ResponseGenerator instance;
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        Properties queries = loadPropertiesFile("requests.properties");
        Properties responses = loadPropertiesFile("responses.properties");
        instance = new ResponseGenerator(queries, responses);
    }

    @Test
    public void testGetResponse() {
        String request = "<some>request</some>";
        String expResult = "<some>response</some>";
        String result = instance.getResponse(request);
        assertEquals(expResult, result);
    }
    
}
