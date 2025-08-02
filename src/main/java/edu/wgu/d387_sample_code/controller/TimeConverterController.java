package edu.wgu.d387_sample_code.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class TimeConverterController {

    @GetMapping("/presentation")
    public ResponseEntity<String> getPresentation() {
        String presentation = "A Live Presentation Is Being Held At: " + TimeConverter.convertTime();
        return new ResponseEntity<>(presentation, HttpStatus.OK);
    }

}
