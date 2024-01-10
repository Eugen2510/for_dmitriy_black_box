package com.example.shortener_connector;



import java.io.IOException;

public class ShortenerConnectorApplication {

    public static void main(String[] args) throws IOException {
        Connector connector = new Connector();

        String shortLink = "kkyoNGCS";
        String expectedLink = "https://www.codewars.com/";

        System.out.println(connector.getAnotherSource(shortLink, expectedLink));
    }

}
