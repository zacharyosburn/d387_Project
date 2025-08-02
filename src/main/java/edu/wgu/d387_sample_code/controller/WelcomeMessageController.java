package edu.wgu.d387_sample_code.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@CrossOrigin
@RestController
public class WelcomeMessageController {

    @GetMapping("/welcome")
    public ResponseEntity<String> WelcomeMessage(@RequestParam("lang") String language) {
        Locale locale = Locale.forLanguageTag(language);
        WelcomeMessage welcomeMessage = new WelcomeMessage(locale);
        return new ResponseEntity<>(welcomeMessage.getMessage(), HttpStatus.OK);
    }

}
