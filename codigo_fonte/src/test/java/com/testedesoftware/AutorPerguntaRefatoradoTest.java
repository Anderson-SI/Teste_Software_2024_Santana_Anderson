package com.testedesoftware;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.junit.BeforeClass;
import org.junit.Test;


public class AutorPerguntaRefatoradoTest 
{
    private static String Path =    "C:\\Users\\Ander\\OneDrive\\Área de Trabalho\\UFS\\2024.1\\TS\\" +
                                    "Teste_Software_2024_Santana_Anderson\\codigo_fonte\\src\\conf\\";
    static ResponseGenerator instance;

    @BeforeClass
    public static void setUpClass() throws Exception {

        Properties queries = new Properties();
        Properties responses = new Properties();
        // Reescrito 
        try (InputStream inQueries = new FileInputStream(Path + "requests.properties")) {
            queries.load(inQueries);
            // queries.list(System.out);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (InputStream inResponse = new FileInputStream(Path + "responses.properties")) {
            responses.load(inResponse);
            // responses.list(System.out);
        } catch (Exception e) {
            e.printStackTrace();
        }

        instance = new ResponseGenerator(queries, responses);
    }

    @Test
    public void testGetResponse() {
        String request = "<some/>request</some>";
        String expResult = "<some>response</some>";
        String result = instance.getResponse(request);
        assertEquals(expResult, result);
    }
}
