package com.testedesoftware;

import java.util.Properties;

public class ResponseGenerator {
   
    private Properties queries;
    private Properties responses;

    public ResponseGenerator(Properties queries, Properties responses) {
        this.queries = queries;
        this.responses = responses;
    }

    public String getResponse(String request) {
        // Encontra a chave correspondente no arquivo de solicitações
        for (String key : queries.stringPropertyNames()) {
            if (queries.getProperty(key).equals(request)) {
                // Retorna a resposta correspondente do arquivo de respostas
                return responses.getProperty(key);
            }
        }
        return null;
    }
}

