package com.example.shortener_connector;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


import java.io.IOException;


public class Connector {
    private final static String SOURCE ="http://localhost:9999/sh/";
    public boolean getAnotherSource(String shortLink, String expectedLink) throws IOException {

        Document document = Jsoup.connect(SOURCE + shortLink)
                .ignoreContentType(true)
                .get();
        String actualLink = document.body().baseUri();
        return actualLink.equals(expectedLink);
    }
}
