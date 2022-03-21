package com.rgpx07.jokeApp;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class QuoteService {
    private final ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

    public String getQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
