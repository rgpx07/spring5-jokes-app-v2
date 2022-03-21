package com.rgpx07.jokeApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private final QuoteService quoteService;

    public JokeController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @RequestMapping("/joke")
    public String getJoke(Model model) {
        model.addAttribute("view", quoteService.getQuote());

        return "jokes/view";
    }
}
