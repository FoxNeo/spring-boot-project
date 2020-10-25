package de.caceres.swaggerdocumentation.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

@RestController
public class CurrentTimeController {

    private static final Logger LOG = LoggerFactory.getLogger(CurrentTimeController.class);

    private static final SimpleDateFormat formater = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");

    @RequestMapping(value = "/time", method = RequestMethod.GET)
    public String getCurrentTime(){
        return generateTimestamp();
    }

    private String generateTimestamp(){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return formater.format(timestamp).toString();
    }

}
